var renumber = function(argMoved) {
	var lclCurrentNumber = 1;
	extractNumberWidgets(argMoved.parent()).each(
		function(argI, argWidget) {
			$(argWidget).val(lclCurrentNumber);
			++lclCurrentNumber;
		}
	);
};

var extractNumberWidgets = function(argParent) {
	return argParent.find("input[type=number].number-widget");
};

$(
	function() {
		$('.reorderable').sortable(
			{
				axis: 'y',
				containment: 'parent',
				cursor: 'grabbing',
				update: function(argEvent, argUI) {
					renumber(argUI.item);
				},
				helper: function(argEvent, argRow) {
					// from http://stackoverflow.com/questions/1307705/jquery-ui-sortable-with-table-and-tr-width
					var lclOriginals = argRow.children();
					
					var lclHelper = argRow.clone();
					
					lclHelper.children().each(
						function(argIndex, argChild) {
							$(this).width(lclOriginals.eq(argIndex).width());
						}
					);
					
					return lclHelper;
				}
			}
		);
		$('.reorderable').disableSelection();
	}
);
