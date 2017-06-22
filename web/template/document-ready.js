$(document).ready(
	function() {
		$('[title]').attr('data-tooltip', '').attr('aria-haspopup', 'true');
		
		$('input[type=submit], input[type=reset], input[type=button], button').addClass('button');
		$('input[type=submit]:not(.tiny):not(.medium):not(.large), input[type=reset]:not(.tiny):not(.medium):not(.large), input[type=button]:not(.tiny):not(.medium):not(.large), button:not(.tiny):not(.medium):not(.large), a.button:not(.tiny):not(.medium):not(.large)').addClass('small');
		
		$('#\\/Date').fdatepicker({format: 'yyyy-mm-dd'});
		
		$('table:not(.unsortable)').tablesorter({
			textExtraction: myTextExtractor
			// sorter: 'data',
			// debug: true
		});
		
		$(document).foundation();
		
		var lclModalsToOpenOnLoad = $('.modal-open-on-load');
		if (lclModalsToOpenOnLoad.length > 0) {
			lclModalsToOpenOnLoad.foundation('open');
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

var myTextExtractor = function(argNode) {
	// Does it have a custom data-tablesorter-numeric attribute?
	var lclNumericAttribute = argNode.getAttribute('data-tablesorter-numeric');
	if (lclNumericAttribute !== undefined && lclNumericAttribute != null && lclNumericAttribute != '') {
		return parseFloat(lclNumericAttribute);
	}
	
	// Does it have a custom data-tablesorter-string attribute?
	var lclStringAttribute = argNode.getAttribute('data-tablesorter-string');
	if (lclStringAttribute !== undefined && lclStringAttribute != null && lclStringAttribute != '') {
		return lclStringAttribute;
	}
	
	// Neither. We have to muck with the inside.
	var lclInside = argNode.innerHTML;
	if (lclInside == "-") {
		lclInside = "ZZZZZZ";
	}
	
	var lclChild = argNode.firstChild;
	if (lclChild === undefined || lclChild == null || lclChild.nodeType != Node.ELEMENT_NODE) {
		// If it has no elemental children, just return its inner HTML (normalized to uppercase).
		return lclInside.toUpperCase();
	} else {
		// If its first child is a simple tag, return its inside. (Theoretically we might want to descend, in case of things like <strong><a>, but that can be saved for later.)
		if (lclChild.localName == "a" || lclChild.localName == "strong" || lclChild.localName == "code" || lclChild.localName == "em" || lclChild.localName == "label") {
			return lclChild.innerHTML.toUpperCase();
		}
		
		// Look for an <input> whose type we can use
		var lclChildren = argNode.children;
		for (var lclI = 0; lclI < lclChildren.length; ++lclI) {
			var lclThisChild = lclChildren[lclI];
			if (lclThisChild.nodeType == Node.ELEMENT_NODE && lclThisChild.localName == "input") {
				var lclTypeAttribute = lclThisChild.getAttribute('type');
				if (lclTypeAttribute === undefined || lclTypeAttribute == null) {
					continue;
				}
				
				if (lclTypeAttribute == "text" || lclTypeAttribute == "checkbox" || lclTypeAttribute == "radio" || lclTypeAttribute == "submit" || lclTypeAttribute == "button" || lclTypeAttribute == "color" || lclTypeAttribute == "date" || lclTypeAttribute == "datetime" || lclTypeAttribute == "datetime-local" || lclTypeAttribute == "email" || lclTypeAttribute == "month" || lclTypeAttribute == "number" || lclTypeAttribute == "range" || lclTypeAttribute == "search" || lclTypeAttribute == "tel" || lclTypeAttribute == "time" || lclTypeAttribute == "url" || lclTypeAttribute == "week") {
					return lclThisChild.value.toUpperCase();
				}
			}
		}
		
		// If we get here, there were no usable <input>s
		return lclInside.toUpperCase();
	}
};