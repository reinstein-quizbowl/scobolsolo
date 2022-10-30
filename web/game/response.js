var lclActivatedWord;

function beforeUnloadListener(event) {
	event.preventDefault();
	
	// The actual message is ignored in most modern browsers (they just use a default message), but it's worth a try.
	return event.returnValue = 'You probably don&#8217;t want to navigate away now; the results you have entered won&#8217;t be saved. Use the &#8220;Continue&hellip;&#8221; button to save.';
}

function addCloseWarning() {
	addEventListener('beforeunload', beforeUnloadListener, { capture: true });
}

function removeCloseWarning() {
	removeEventListener('beforeunload', beforeUnloadListener, { capture: true });
}

$(document).ready(
	function() {
		$('.originally-buzzable').addClass('buzzable');
		var lclMousedownFired = false;
		
		addCloseWarning();
		
		$(document).off()
		.on(
			'touchstart mousedown',
			'.buzzable',
			function(argEvent) {
				lclMousedownFired = true;
				if (lclData.left.buzzed && lclData.right.buzzed) {
					// No buzzing options to show.
					return;
				} else if (alreadyAnsweredCorrectly()) {
					// No buzzing options to show.
					return;
				} else {
					var lclClickedWord = $(argEvent.target);
					var lclIndex = lclClickedWord.data('buzzIndex');
					
					// You can't buzz earlier than you already buzzed
					if (lclIndex < getLatestIndexOfBuzz()) {
						return;
					}
					
					lclClickedWord.addClass('active');
					lclActivatedWord = lclClickedWord;
					
					var lclId = lclClickedWord.attr('id');
					while (!lclId) {
						lclId = lclClickedWord.parent().attr('id');
					}
					
					$('#buzzMenuContainer').html(
						'<table class="buzz-choices unsortable">' +
							'<thead>' +
								'<tr>' +
									(lclData.left.buzzed ? '' : '<th class="text-center" style="width: 50%;">' + lclData.left.name + '</th>') +
									(lclData.right.buzzed ? '' : '<th class="text-center" style="width: 50%;">' + lclData.right.name + '</th>') +
							'</thead>' +
							'<tbody>' +
								'<tr>' +
									(lclData.left.buzzed ? '' : '<td><a class="success button expanded" onclick="buzz(\'left\', \'' + lclId + '\', true)">Correct</a></td>') +
									(lclData.right.buzzed ? '' : '<td><a class="success button expanded" onclick="buzz(\'right\', \'' + lclId + '\', true)">Correct</a></td>') +
								'</tr>' +
								'<tr>' +
									(lclData.left.buzzed ? '' : '<td><a class="warning button expanded" onclick="buzz(\'left\', \'' + lclId + '\', false)">Incorrect</a></td>') +
									(lclData.right.buzzed ? '' : '<td><a class="warning button expanded" onclick="buzz(\'right\', \'' + lclId + '\', false)">Incorrect</a></td>') +
								'</tr>' +
							'</tbody>' +
						'</table>'
					).offset({top: argEvent.pageY, left: argEvent.pageX})
					.addClass('buzz-menu-container');
					
					
					// Go back to the regular cursor (instead of the crosshairs) for earlier words
					$('.buzzable').each(
						function(argIndex) {
							if ($(this).data('buzzIndex') < lclIndex) {
								$(this).removeClass('buzzable');
							}
						}
					);
				}
				
				argEvent.stopImmediatePropagation();
				argEvent.preventDefault();
			}
		).on( // Close the menu if clicked outside
			'click',
			':not(.buzzable):not(.buzz-menu-container)',
			function(argEvent) {
				if (lclMousedownFired) {
					lclMousedownFired = false;
				} else {
					hideBuzzMenu();
				}
				
				argEvent.stopImmediatePropagation();
			}
		);
	}
);

function hideBuzzMenu() {
	$('#buzzMenuContainer').html('').removeClass('buzz-menu-container');
	
	if (lclActivatedWord) {
		lclActivatedWord.removeClass('active');
	}
}

function buzz(argSide, argBuzzPointId, argCorrect) { 
	var lclBuzzPoint = $('#' + argBuzzPointId);
	
	lclData[argSide].buzzed = true;
	lclData[argSide].buzz_index = lclBuzzPoint.data('buzzIndex');
	lclData[argSide].correct = argCorrect;
	
	var lclMarker = $('<div></div>')
		.html(lclData[argSide].name + ': ' + (argCorrect ? 'correct' : 'incorrect'))
		.css('position', 'absolute')
		.offset(
			{
				// Correct buzzes get a marker below, incorrect above
				top: lclBuzzPoint.offset().top + (argCorrect ? 26 : -14),
				left: lclBuzzPoint.offset().left
			}
		).addClass('buzzed-indicator')
		.addClass(argCorrect ? 'buzzed-indicator-correct' : 'buzzed-indicator-incorrect')
		.appendTo(document.body);
	
	lclBuzzPoint.addClass(argCorrect ? 'buzzed-correct' : 'buzzed-incorrect');
	
	addCloseWarning();
	hideBuzzMenu();
}

function getLatestIndexOfBuzz() {
	var lclLatest = -1;
	
	if (lclData.left.buzzed) {
		var lclLeftBuzzIndex = lclData.left.buzz_index;
		if (lclLeftBuzzIndex && lclLeftBuzzIndex > lclLatest) {
			lclLatest = lclLeftBuzzIndex;
		}
	}
	
	if (lclData.right.buzzed) {
		var lclRightBuzzIndex = lclData.right.buzz_index;
		if (lclRightBuzzIndex && lclRightBuzzIndex > lclLatest) {
			lclLatest = lclRightBuzzIndex;
		}
	}
	
	return lclLatest;
}

function alreadyAnsweredCorrectly() {
	return (lclData.left.buzzed && lclData.left.correct) || (lclData.right.buzzed && lclData.right.correct);
}

function goOn() {
	var lclForm = $('<form id="response" action="QuestionResponse" method="post"></form>').appendTo(document.body);
	
	$('<input type="hidden" name="data" />').val(JSON.stringify(lclData)).appendTo(lclForm);
	
	removeCloseWarning();
	
	document.forms['response'].submit();
}

function usePersisted() {
	restore(true);
}

function clearResponses() {
	restore(false);
}

function restore(argUsePersisted) {
	lclData = cloneData(lclOriginalData);
	
	$('.buzzed-indicator').remove();
	$('.originally-buzzable').addClass('buzzable');
	$('.buzzable').removeClass('buzzed-correct');
	$('.buzzable').removeClass('buzzed-incorrect');
	
	if (argUsePersisted) {
		recordPersistedBuzzes();
	}
}

function findWordId(argDesiredBuzzIndex) {
	var lclClosestWordId;
	var lclClosestWordCloseness;
	
	var lclWords = $('.originally-buzzable');
	for (var lclI = 0; lclI < lclWords.length; ++lclI) {
		var lclBuzzableWord = $(lclWords[lclI]);
		var lclBuzzableWordId = lclBuzzableWord.attr('id');
		var lclThisWordBuzzIndex = lclBuzzableWord.data('buzzIndex');
		
		if (Math.abs(lclThisWordBuzzIndex - argDesiredBuzzIndex) <= 1) { // One-character buffer
			return lclBuzzableWordId;
		}
	}
	
	return undefined;
}
