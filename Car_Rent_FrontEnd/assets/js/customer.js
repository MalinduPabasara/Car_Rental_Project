function validCustomer() {
    var a = document.forms['frm']["name"].value;
    var b = document.forms['frm']["email"].value;
    var c = document.forms['frm']["password"].value;
    var d = document.forms['frm']["address"].value;
    var e = document.forms['frm']["contact"].value;
    var f = document.forms['frm']["dlicense"].value;
    var g = document.forms['frm']["icard"].value;
    if (a == null || a == "", b == null || b == "", c == null || c == "", d == null || d == "", e == null || e == "", f == null || f == "", g == null || g == "") {
        alert("Fields cannot be empty");
        return false;
    }
}

let cusNameRegEx = /^[a-zA-Z ]+$/;

$('#userName').on('keyup', function (event) {
    if (event.key == 'Enter') {
        $('#userEmail').focus();
    }
    let inputID = $('#userName').val();
    if (cusNameRegEx.test(inputID)) {
        $('#userName').css('border', '2px solid green');
        $('#lbluserName').text('');
        $('#lbluserName').css({
            'color': 'green',
            'font-size': '12px'
        });
    } else {
        $('#userName').css('border', '2px solid red');
        $('#lbluserName').text('Type only letters');
        $('#lbluserName').css({
            'color': 'red',
            'font-size': '12px'
        });

    }
});

let cusAddressRegEx = /^[0-9/]{1,4}[A-z ]*$/;
$('#address').on('keyup', function (event) {
    if (event.key == 'Enter') {
        $('#contact').focus();
    }
    let inputID = $('#address').val();
    if (cusAddressRegEx.test(inputID)) {
        $('#address').css('border', '2px solid green');
        $('#lbladdress').text('');
        $('#lbladdress').css({
            'color': 'green',
            'font-size': '12px'
        });
    } else {
        $('#address').css('border', '2px solid red');
        $('#lbladdress').text('Wrong input. Enter valid address');
        $('#lbladdress').css({
            'color': 'red',
            'font-size': '12px'
        });

    }
});

let cusContactRegEx = /^(0)[0-9]{9}$/;
$('#contact').on('keyup', function (event) {
    if (event.key == 'Enter') {
        $('#drivindNum').focus();
    }
    let inputID = $('#contact').val();
    if (cusContactRegEx.test(inputID)) {
        $('#contact').css('border', '2px solid green');
        $('#lblcontact').text('');
        $('#lblcontact').css({
            'color': 'green',
            'font-size': '12px'
        });
    } else {
        $('#contact').css('border', '2px solid red');
        $('#lblcontact').text('Please enter 10 digit number');
        $('#lblcontact').css({
            'color': 'red',
            'font-size': '12px'
        });

    }
});

let carTypeRegEx = /^mini$|^luxury$|^Mini$|^Luxury$$/;
$('#type').on('keyup', function (event) {
    if (event.key == 'Enter') {
        /*$('#txtGender').focus();*/
    }
    let inputID = $('#type').val();
    if (carTypeRegEx.test(inputID)) {
        $('#type').css('border', '2px solid green');
        $('#lbltype').text('');
        $('#lbltype').css({
            'color': 'green',
            'font-size': '12px'
        });
    } else {
        $('#type').css('border', '2px solid red');
        $('#lbltype').text('Mini or Luxury');
        $('#lbltype').css({
            'color': 'red',
            'font-size': '12px'
        });

    }
});

let carPassengerRegEx = /^[0-9]$/;
$('#passengers').on('keyup', function (event) {
    if (event.key == 'Enter') {
        $('#transmissionType').focus();
    }
    let inputID = $('#passengers').val();
    if (carPassengerRegEx.test(inputID)) {
        $('#passengers').css('border', '2px solid green');
        $('#lblpassenger').text('');
        $('#lblpassenger').css({
            'color': 'green',
            'font-size': '12px'
        });
    } else {
        $('#passengers').css('border', '2px solid red');
        $('#lblpassenger').text('Please enter only Numbers');
        $('#lblpassenger').css({
            'color': 'red',
            'font-size': '12px'
        });

    }
});

// let carTransmissionTypeRegEx = /^auto$|^$|^Auto$|^$$/;
// $('#transmissionType').on('keyup', function (event) {
//     if (event.key == 'Enter') {
//         /*$('#txtGender').focus();*/
//     }
//     let inputID = $('#transmissionType').val();
//     if (carTransmissionTypeRegEx.test(inputID)) {
//         $('#transmissionType').css('border', '2px solid green');
//         $('#lbltransmissionType').text('');
//         $('#lbltransmissionType').css({
//             'color': 'green',
//             'font-size': '12px'
//         });
//     } else {
//         $('#transmissionType').css('border', '2px solid red');
//         $('#lbltransmissionType').text('Enter Auto or ');
//         $('#lbltransmissionType').css({
//             'color': 'red',
//             'font-size': '12px'
//         });
//
//     }
// });

let fuelType = /^deesal$|^petrol$|^Deesal$|^Petrol$$/;
$('#fuelType').on('keyup', function (event) {
    if (event.key == 'Enter') {
        /*$('#txtGender').focus();*/
    }
    let inputID = $('#fuelType').val();
    if (fuelType.test(inputID)) {
        $('#fuelType').css('border', '2px solid green');
        $('#lblfuelType').text('');
        $('#lblfuelType').css({
            'color': 'green',
            'font-size': '12px'
        });
    } else {
        $('#fuelType').css('border', '2px solid red');
        $('#lblfuelType').text('Enter Deesal or Petrol');
        $('#lblfuelType').css({
            'color': 'red',
            'font-size': '12px'
        });

    }
});

let carColorRegEx = /^[a-zA-Z ]+$/;

$('#color').on('keyup', function (event) {
    if (event.key == 'Enter') {
        $('#priceforExKM').focus();
    }
    let inputID = $('#color').val();
    if (carColorRegEx.test(inputID)) {
        $('#color').css('border', '2px solid green');
        $('#lblcolor').text('');
        $('#lblcolor').css({
            'color': 'green',
            'font-size': '12px'
        });
    } else {
        $('#color').css('border', '2px solid red');
        $('#lblcolor').text('Enter Valid Color');
        $('#lblcolor').css({
            'color': 'red',
            'font-size': '12px'
        });

    }
});