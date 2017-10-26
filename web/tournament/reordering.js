function update() {
	var lclPositionTargets = document.getElementsByClassName('generated-position-target');
	
	for (var lclPosition = 1; lclPosition <= lclPositionTargets.length; ++lclPosition) {
		lclPositionTargets[lclPosition-1].value = lclPosition;
	}
}

$(document).ready(
	function() {
		$("#sortable").sortable(
			{
				axis: 'y',
				containment: 'parent',
				cursor: 'grabbing',
				change: function(event, ui) {update();}
			}
		);
		
		update();
	}
);
