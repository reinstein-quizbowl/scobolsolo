function openResponse(argRecipientId, argFocus) {
	var lclName = 'message_to_' + argRecipientId;
	
	findResponseContainer(argRecipientId).html(
		'<form class="response" action="SendMessage" method="post">' +
			'<input type="hidden" name="load_timestamp" value="' + lclCurrentTimeString + '" />' +
			'<input type="hidden" name="recipient_account_id" value="' + argRecipientId + '" />' +
			'<div class="small-10 medium-11 columns">' +
				'<textarea id="' + lclName + '" name="message" placeholder="Reply&hellip;" rows="2" cols="80" required="required" wrap="soft"></textarea>' +
			'</div>' +
			'<div class="small-2 medium-1 columns">' +
				'<input type="submit" class="small button full-width" value="Send" />' +
				'<button class="small info button full-width" formnovalidate="formnovalidate" onclick="closeResponse(' + argRecipientId + ')">Cancel</button><br />' +
			'</div>' +
		'</form>'
	);
	
	if (argFocus) {
		$('#' + lclName).focus();
	}
}

function closeResponse(argRecipientId) {
	findResponseContainer(argRecipientId).html('');
}

function findResponseContainer(argRecipientId) {
	return $('#' + argRecipientId).find('div.response-container');
}

$(document).ready(
	function() {
		$('.response-container.open-on-load').each(
			function(argIndex) {
				openResponse($(this).parents('div.correspondent').attr('id'), false);
			}
		);
		
		$('.focus-on-load textarea').focus();
		
		// Submit on ctrl-enter in a textarea
		$(document).on(
			'keydown',
			'form.response textarea',
			function(argEvent) {
				if (argEvent.ctrlKey && (argEvent.keyCode == 10 || argEvent.keyCode == 13)) {
					$(argEvent.target).parents('form').submit();
				}
			}
		);
	}
);
