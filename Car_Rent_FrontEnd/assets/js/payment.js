
let cusCardNumRegEx = /^4[0-9]{12}(?:[0-9]{3})?$/;

$('#cardnum').on('keyup', function (event) {
    if (event.key == 'Enter') {
        $('#expiry').focus();
    }
    let inputID = $('#cardnum').val();
    if (cusCardNumRegEx.test(inputID)) {
        $('#cardnum').css('border', '2px solid green');
        $('#lblCardNumber').text('');
        $('#lblCardNumber').css({
            'color': 'green',
            'font-size': '12px'
        });
    } else {
        $('#cardnum').css('border', '2px solid red');
        $('#lblCardNumber').text('Please input correct Card Number.');
        $('#lblCardNumber').css({
            'color': 'red',
            'font-size': '12px'
        });


    }
});



let cusCardCVSRegEx = /^[0-9]{1,3}$/;

$('#cvs').on('keyup', function (event) {
    if (event.key == 'Enter') {
        $('#name').focus();
    }
    let inputID = $('#cvs').val();
    if (cusCardCVSRegEx.test(inputID)) {
        $('#cvs').css('border', '2px solid green');
        $('#lblcvs').text('');
        $('#lblcvs').css({
            'color': 'green',
            'font-size': '12px'
        });
    } else {
        $('#cvs').css('border', '2px solid red');
        $('#lblcvs').text('Please input correct CVS (only 3 digit).');
        $('#lblcvs').css({
            'color': 'red',
            'font-size': '12px'
        });


    }
});

let cusNameRegEx = /^[a-zA-Z ]+$/;

$('#name').on('keyup', function (event) {
    if (event.key == 'Enter') {
        // $('#txtaddress').focus();
    }
    let inputID = $('#name').val();
    if (cusNameRegEx.test(inputID)) {
        $('#name').css('border', '2px solid green');
        $('#lblname').text('');
        $('#lblname').css({
            'color': 'green',
            'font-size': '12px'
        });
    } else {
        $('#name').css('border', '2px solid red');
        $('#lblname').text('Type only letters');
        $('#lblname').css({
            'color': 'red',
            'font-size': '12px'
        });

    }
});

let cusDOBRegEx = /^[0-9]{4}$/;
$('#txtdob').on('keyup', function (event) {
    if (event.key == 'Enter') {
        $('#txtcontactNo').focus();
    }
    let inputID = $('#txtdob').val();
    if (cusDOBRegEx.test(inputID)) {
        $('#txtdob').css('border', '2px solid green');
        $('#lbldob').text('');
        $('#lbldob').css({
            'color': 'green',
            'font-size': '12px'
        });
    } else {
        $('#txtdob').css('border', '2px solid red');
        $('#lbldob').text('Wrong input. Enter valid birthday (10/10/1990)');
        $('#lbldob').css({
            'color': 'red',
            'font-size': '12px'
        });

    }
});