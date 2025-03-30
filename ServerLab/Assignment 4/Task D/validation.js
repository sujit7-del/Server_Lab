function validateName() {
    let name = document.getElementById("name").value;
    let error = document.getElementById("nameError");
  
    if (name.length < 3) {
      error.innerText = "Name must be at least 3 characters!";
      error.style.color = "red";
      return false;
    } else {
      error.innerText = "✔ Valid";
      error.style.color = "green";
      return true;
    }
  }
  
  function validateEmail() {
    let email = document.getElementById("email").value;
    let error = document.getElementById("emailError");
    let regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  
    if (!regex.test(email)) {
      error.innerText = "Invalid email format!";
      error.style.color = "red";
      return false;
    } else {
      error.innerText = "✔ Valid";
      error.style.color = "green";
      return true;
    }
  }
  
  function validatePhone() {
    let phone = document.getElementById("phone").value;
    let error = document.getElementById("phoneError");
    let regex = /^[0-9]{10}$/;
  
    if (!regex.test(phone)) {
      error.innerText = "Enter a 10-digit phone number!";
      error.style.color = "red";
      return false;
    } else {
      error.innerText = "✔ Valid";
      error.style.color = "green";
      return true;
    }
  }
  
  function validatePassword() {
    let password = document.getElementById("password").value;
    let error = document.getElementById("passwordError");
    let regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
  
    if (!regex.test(password)) {
      error.innerText = "Password must be 8+ chars with uppercase, lowercase, number & special char!";
      error.style.color = "red";
      return false;
    } else {
      error.innerText = "✔ Strong Password";
      error.style.color = "green";
      return true;
    }
  }
  
  function validateForm(event) {
    event.preventDefault(); // Prevent form submission
  
    if (validateName() && validateEmail() && validatePhone() && validatePassword()) {
      alert("Registration Successful!");
    } else {
      alert("Please correct errors before submitting!");
    }
  }
  