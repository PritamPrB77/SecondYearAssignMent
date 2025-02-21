$(document).ready(function() {
    $('#redButton').click(function() {
        $('body').css('background-color', 'yellow');
    });
    $('#greenButton').click(function() {
        $('body').css('background-color', 'green');
    });
    $('#blueButton').click(function() {
        $('body').css('background-color', 'blue');
    });
    $('#toggleButton').click(function() {
        $('div').toggle(4000);
    });
});