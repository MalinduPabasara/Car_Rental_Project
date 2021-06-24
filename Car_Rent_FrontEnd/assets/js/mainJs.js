
var homeContent = document.getElementById('homeContent');
var registerContent = document.getElementById('registerContent');
// var homeContent = document.getElementById('');


homeContent.style.display='none';
registerContent.style.display='none';
// pOrderContent.style.display='none';

var btnHome=document.getElementById('mainHome');

btnHome.addEventListener('click', function () {
    homeContent.style.display='block';
    registerContent.style.display='none';

});

var btnRegister=document.getElementById('mainRegister');

btnRegister.addEventListener('click', function () {
    homeContent.style.display='none';
    registerContent.style.display='block';

});

var btnCar=document.getElementById('mainCar');

btnRegister.addEventListener('click', function () {
    homeContent.style.display='none';
    registerContent.style.display='none';


});