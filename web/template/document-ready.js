$(document).ready(
	function() {
		$('[title]').attr('data-tooltip', '').attr('aria-haspopup', 'true');
		
		$('input[type=submit], input[type=reset], input[type=button], button').addClass('button');
		$('input[type=submit]:not(.tiny):not(.medium):not(.large), input[type=reset]:not(.tiny):not(.medium):not(.large), input[type=button]:not(.tiny):not(.medium):not(.large), button:not(.tiny):not(.medium):not(.large), a.button:not(.tiny):not(.medium):not(.large)').addClass('small');
		
		$('#\\/Date').fdatepicker({format: 'yyyy-mm-dd'});
		
		$(document).foundation();
		
		var lclModalsToOpenOnLoad = $('.modal-open-on-load');
		if (lclModalsToOpenOnLoad.length > 0) {
			lclModalsToOpenOnLoad.foundation('open');
		}
		
		// Make data-freeze-* attributes work
		for (var columns = 0; columns < 10; columns++) {
			var options = {
				scrollX: true,
				fixedHeader: true,
				fixedColumns: { leftColumns: columns },
				order: [],
				paging: false,
				searching: false,
				info: false,
			};
			if (Foundation.MediaQuery.atLeast('medium')) {
				delete options.fixedColumns;
			} else {
				delete options.fixedHeader;
			}
			var $table = $('table.data-freeze-' + columns);
			$table.attr('width', '100%');
			if (typeof $table.DataTable === 'function') {
				$table.DataTable(options);
			}
		}
	}
);

function acknowledgeMessage(argMessageId) {
	try {
		$.ajax(
			{
				url: '/messages/AcknowledgeMessage',
				type: 'POST',
				dataType: 'json',
				data: {'message_id': argMessageId}
			}
		).done(
			function (argResponse) {
				var lclMessagesModal = $('#messages-modal');
				if (lclMessagesModal.length > 0) {
					lclMessagesModal.foundation('close');
				} else {
					// This is for when we're on the full page of messages.  It's lame, but a lot easier than actually updating the display in place.
					window.location.reload(true);
				}
			}
		).fail(
			function(argResponse) {
				window.alert('Failed to acknowledge message. Ask for help.');
			}
		);
	} catch (lclE) {
		window.alert('Failed to acknowledge message: ' + lclE.message);
	}
}
