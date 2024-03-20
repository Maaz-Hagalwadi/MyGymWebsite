function validate() {
    var un = document.getElementById("name").value
    var unp = /^[a-zA-Z]+$/
    
    var em = document.getElementById("email").value
    var emp = /^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}$/;

    if (un == "") {
        document.getElementById("msg").innerHTML = "Please Enter the name"
        return false
    }
    if (un.match(unp)) {
        
    } else {
        document.getElementById("msg1").innerHTML = "Invalid Name please Enter Alphabhets only"
        return false
    }
    if (un.length < 3) {
        document.getElementById("msg").innerHTML = "Miminum length should contains 3 letters"
        return false
    }
    if (un.length > 8) {
        document.getElementById("msg").innerHTML = "Maximum length should contains 8 letters"
        return false
    }

    if (em == "") {
        document.getElementById("msg2").innerHTML = "Enter Email Address"
        return false
    }

    if (em.match(emp)) {
        true
    } else {
        document.getElementById("msg2").innerHTML = "Invalid Email Address"
        return false
    }

    // Phone number validation
    var ph = document.getElementById("phone").value
    var php = /^[6-9]\d{9}$/;

    if (ph == "") {
        document.getElementById("msg1").innerHTML = "Enter phone number"
        return false
    }

    if (ph.match(php)) {
        true
    } else {
        document.getElementById("msg1").innerHTML = "Invalid Phone Number"
        return false
    }
}
