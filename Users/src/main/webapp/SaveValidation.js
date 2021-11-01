var lowercaseRegex=/[a-z]+/
var uppercaseRegex=/[A-Z]+/
var emailRegex=/^[a-zA-Z0-9._]+@[a-zA-Z.]+/
var numbersRegex=/[0-9]+/

function validateName(){
    var input=document.getElementById("name_input").value;

    if ((input=="" || input.length<3 || input.length>15 || uppercaseRegex.test(input))){
        document.getElementById("name_input_error").style.color="red";
    }
    else document.getElementById("name_input_error").style.color="white";
}

function validateEmail(){
    var input=document.getElementById("email_input").value;

    if ((input=="" || input.length<6 || input.length>18 || (!(emailRegex.test(input))))){
        document.getElementById("email_input_error").style.color="red";
    }
    else document.getElementById("email_input_error").style.color="white";
}

function validateContactNumber(){
    var input=document.getElementById("contact_number_input").value;

    if ((input=="" || input.length!=10 || (!(numbersRegex.test(input))))){
        document.getElementById("contact_number_input_error").style.color="red";
    }
    else document.getElementById("contact_number_input_error").style.color="white";
}

function validateDOB(){
    var input=document.getElementById("dob_input").value;

    if (input==""){
        document.getElementById("dob_input_error").style.color="red";
    }
    else document.getElementById("dob_input_error").style.color="white";

}

function validateCity(){
    var input=document.getElementById("city_input").value;

    if ((input=="" || uppercaseRegex.test(input))){
        document.getElementById("city_input_error").style.color="red";
    }
    else document.getElementById("city_input_error").style.color="white";
}

function validateNationality(){
    var input=document.getElementById("nationality_input").value;

    if ((input=="Select your nationality")){
        document.getElementById("nationality_input_error").style.color="red";
    }
    else document.getElementById("nationality_input_error").style.color="white";
}

function validateGender(){
    var input = document.querySelectorAll('input[name="gender"]:checked');
    if (input.length==0){document.getElementById("gender_input_error").style.color="red";
    }
    else document.getElementById("gender_input_error").style.color="white";
}

function selectStatus(id){
    id=id-1;
    var tags=document.querySelectorAll('input[name="status"]');
    var i=0
    for(i=0;i<tags.length;i++){
        if (i==id) tags[i].checked=true;
        else tags[i].checked=false;
    }
}

function validateStatus(){
    var input = document.querySelectorAll('input[name="status"]:checked');
    if (input.length==0){document.getElementById("status_input_error").style.color="red";
    }
    else document.getElementById("status_input_error").style.color="white";
}

function validatePassword(){
    var input=document.getElementById("password_input").value;

    if ((input=="" || input.length<8 || input.length>16 || !(uppercaseRegex.test(input)) ||
        !(lowercaseRegex.test(input)) || !(numbersRegex.test(input)))){
        document.getElementById("password_input_error").style.color="red";
    }
    else document.getElementById("password_input_error").style.color="white";
}

function validateOldPassword(){
    var input=document.getElementById("old_password_input").value;

    if ((input=="" || input.length<8 || input.length>16 || !(uppercaseRegex.test(input)) ||
        !(lowercaseRegex.test(input)) || !(numbersRegex.test(input)))){
        document.getElementById("old_password_input_error").style.color="red";
    }
    else document.getElementById("old_password_input_error").style.color="white";
}

function validateConfirmPassword(){
    var password=document.getElementById("password_input").value;
    var confirmPassword=document.getElementById("confirm_password_input").value;

    if (password!=confirmPassword){
        document.getElementById("confirm_password_input_error").style.color="red";
    }
    else document.getElementById("confirm_password_input_error").style.color="white";
}


function validateSubmission(){
    validateName();
    validateEmail();
    validatePassword();
    validateConfirmPassword();
    validateContactNumber();
    validateDOB();
    validateGender();
    validateStatus();
    validateCity();
    validateNationality();
}