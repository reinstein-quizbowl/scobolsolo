$(document).ready(
	function() {
		$('.originally-buzzable').addClass('buzzable');
		
		var lclActivatedWord;
		
		$(document).on(
			'mousedown taphold',
			'.buzzable',
			function(argEvent) {
				if (lclData['left']['buzzed'] && lclData['right']['buzzed']) {
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
									(lclData['left']['buzzed'] ? '' : '<th>' + lclData['left']['name'] + '</th>') +
									(lclData['right']['buzzed'] ? '' : '<th>' + lclData['right']['name'] + '</th>') +
							'</thead>' +
							'<tbody>' +
								'<tr>' +
									(lclData['left']['buzzed'] ? '' : '<td><a class="success button expanded" onclick="buzz(\'left\', \'' + lclId + '\', true)">Correct</a></td>') +
									(lclData['right']['buzzed'] ? '' : '<td><a class="success button expanded" onclick="buzz(\'right\', \'' + lclId + '\', true)">Correct</a></td>') +
								'</tr>' +
								'<tr>' +
									(lclData['left']['buzzed'] ? '' : '<td><a class="warning button expanded" onclick="buzz(\'left\', \'' + lclId + '\', false)">Incorrect</a></td>') +
									(lclData['right']['buzzed'] ? '' : '<td><a class="warning button expanded" onclick="buzz(\'right\', \'' + lclId + '\', false)">Incorrect</a></td>') +
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
			}
		);
		
		// Close the menu if clicked outside
		$(document).on(
			'click',
			':not(.buzzable):not(.buzz-menu-container)',
			function(argEvent) {
				$('#buzzMenuContainer').html('').removeClass('buzz-menu-container');
				
				if (lclActivatedWord) {
					lclActivatedWord.removeClass('active');
				}
			}
		);
	}
);

function buzz(argSide, argBuzzPointId, argCorrect) { 
	var lclBuzzPoint = $('#' + argBuzzPointId);
	
	lclData[argSide]['buzzed'] = true;
	lclData[argSide]['buzz_index'] = lclBuzzPoint.data('buzzIndex');
	lclData[argSide]['correct'] = argCorrect;
	
	var lclMarker = $('<div></div>')
		.html(lclData[argSide]['name'] + ': ' + (argCorrect ? 'correct' : 'incorrect'))
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
}

function getLatestIndexOfBuzz() {
	var lclLatest = -1;
	
	if (lclData['left']['buzzed']) {
		var lclLeftBuzzIndex = lclData['left']['buzz_index'];
		if (lclLeftBuzzIndex && lclLeftBuzzIndex > lclLatest) {
			lclLatest = lclLeftBuzzIndex;
		}
	}
	
	if (lclData['right']['buzzed']) {
		var lclRightBuzzIndex = lclData['right']['buzz_index'];
		if (lclRightBuzzIndex && lclRightBuzzIndex > lclLatest) {
			lclLatest = lclRightBuzzIndex;
		}
	}
	
	return lclLatest;
}

function alreadyAnsweredCorrectly() {
	return (lclData['left']['buzzed'] && lclData['left']['correct']) || (lclData['right']['buzzed'] && lclData['right']['correct']);
}

function goOn() {
	var lclForm = $('<form id="response" action="QuestionResponse" method="post"></form>').appendTo(document.body);
	
	$('<input type="hidden" name="data" />').val(JSON.stringify(lclData)).appendTo(lclForm);
	
	document.forms['response'].submit();
	// $.post('QuestionResponse', 'data=' + JSON.stringify(lclData));
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
		
		if (lclThisWordBuzzIndex == argDesiredBuzzIndex) {
			return lclBuzzableWordId;
		} else {
			var lclCloseness = Math.abs(lclThisWordBuzzIndex - argDesiredBuzzIndex);
			if (lclCloseness < lclClosestWordCloseness) {
				lclClosestWordId = lclBuzzableWordId;
				lclClosestWordCloseness = lclCloseness;
			}
		}
	}
	
	return lclClosestWordId;
}
