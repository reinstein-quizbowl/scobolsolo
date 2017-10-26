function radioSidesUpdated(argWhich) {
	var lclLeftButtons = $('input[name=left_player_id]:radio');
	var lclLeftChecked = $('input[name=left_player_id]:radio:checked').val();
	var lclRightButtons = $('input[name=right_player_id]:radio');
	var lclRightChecked = $('input[name=right_player_id]:radio:checked').val();
	
	var lclIsLeft = argWhich.getAttribute('name') == 'left_player_id';
	
	if (lclIsLeft) {
		if (lclRightButtons.length == 2) {
			// Find the value on the right side that isn't the left one's value, and check it
			for (var lclI = 0; lclI < lclRightButtons.length; ++lclI) { // Lame!
				if (lclRightButtons[lclI].getAttribute('value') != lclLeftChecked) {
					lclRightButtons[lclI].checked = true;
				}
			}
		}
	} else {
		if (lclLeftButtons.length == 2) {
			// Find the value on the left side that isn't the right one's value, and check it
			for (var lclI = 0; lclI < lclLeftButtons.length; ++lclI) { // Lame!
				if (lclLeftButtons[lclI].getAttribute('value') != lclRightChecked) {
					lclLeftButtons[lclI].checked = true;
				}
			}
		}
	}
}

function dropdownSidesUpdated(argWhich) {
	return;
}
