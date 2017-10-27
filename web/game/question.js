$(document).ready(
	function() {
		usePersisted();
	}
);

function cloneData(argData) {
	return JSON.parse(JSON.stringify(argData));
}

var lclData = cloneData(lclOriginalData);