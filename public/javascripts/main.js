var log = function(message) {
    var logNode = document.getElementById('demo_output');
    var txtNode = document.createTextNode(message);
    logNode.append(txtNode);
    logNode.append(document.createElement('br'));
};
