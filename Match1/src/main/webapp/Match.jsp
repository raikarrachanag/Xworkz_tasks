<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <nav class="navbar" style="background-color: white; color: black">
        <h2>User Registration</h2>
        <button type="submit">
            <a href="UserRegistrationSuccess.jsp">User Registration Success</a>
        </button>
    </nav>

    <form action="UserServlet" method="post" class="p-3 mb-2 bg-secondary text-white" onclick="return validateForm()">
        <h1>User Information</h1>
        <span id="valid" style="padding-left: 80px"></span>
        <p id="uName" />
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" name="name" onchange="handleName()" >
        </div>
        <p id="mNo" />
        <div class="form-group">
            <label for="mobileNo">Mobile Number</label>
            <input type="tel" class="form-control" id="mobileNo" name="mobileNo" onchange="handleMobileNo()" >
        </div>
        <p id="email" />
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" class="form-control" id="email" name="email" onchange="handleEmail()" >
        </div>
        <p id="dob" />
        <div class="form-group">
            <label for="dob">Date of Birth</label>
            <input type="date" class="form-control" id="dob" name="dob" onchange="handleDob()" >
        </div>
        <p id="location" />
        <div class="form-group">
            <label for="location">Location</label>
            <input type="text" class="form-control" id="location" name="location" onchange="handleLocation()" >
        </div>
        <p id="password" />
        <div class="form-group">
            <label for "password">Password</label>
            <input type="password" class="form-control" id="password" name="password" onchange="handlePassword()" >
        </div>
        <p id="confirmPassword" />
        <div class="form-group">
            <label for="confirmPassword">Confirm Password</label>
            <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" onchange="handleConfirmPassword()" >
        </div>
        <p id="robotCheck" />
        <div class="form-check">
            <input type="checkbox" class="form-check-input" id="robotCheck" name="robotCheck" onchange="handleRobotCheck()" >
            <label class="form-check-label" for="robotCheck">I am not a robot</label>
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-success" id="button">Submit</button>
        </div>
    </form>

    <script type="text/javascript">
        // Validation functions for the user registration form

        function handleName() {
            var name = document.getElementById("name").value;
            var button = document.getElementById("button");
            if (name.length >= 3 && name.length < 30) {
                document.getElementById("uName").innerHTML = "<span style='color:blue'>Name is valid</span>";
                button.removeAttribute("disabled");
            } else {
                document.getElementById("uName").innerHTML = "<span style='color:red'>Please enter a valid name</span>";
                button.setAttribute("disabled", "");
                return;
            }
        }

        function handleMobileNo() {
            var mobileNo = document.getElementById("mobileNo").value;
            var button = document.getElementById("button");
            var mobileNoPattern = /^\d{10}$/; // Change the pattern to match your mobile number format
            if (mobileNo.match(mobileNoPattern)) {
                document.getElementById("mNo").innerHTML = "<span style='color:blue'>Mobile number is valid</span>";
                button.removeAttribute("disabled");
            } else {
                document.getElementById("mNo").innerHTML = "<span style='color:red'>Please enter a valid mobile number</span>";
                button.setAttribute("disabled", "");
                return;
            }
        }

        function handleEmail() {
            var email = document.getElementById("email").value;
            var button = document.getElementById("button");
            var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
            if (email.match(emailPattern)) {
                document.getElementById("email").innerHTML = "<span style='color:blue'>Email is valid</span>";
                button.removeAttribute("disabled");
            } else {
                document.getElementById("email").innerHTML = "<span style='color:red'>Please enter a valid email address</span>";
                button.setAttribute("disabled", "");
                return;
            }
        }

        function handleDob() {
        	var dob = document.getElementById("dob").value;
            var button = document.getElementById("button");
            // Implement your date of birth validation logic here
            // For example, you can check if the user is above a certain age
            var currentDate = new Date();
            var selectedDate = new Date(dob);
            var age = currentDate.getFullYear() - selectedDate.getFullYear();

            if (age >= 18) {
                document.getElementById("dob").innerHTML = "<span style='color:blue'>Date of birth is valid</span>";
                button.removeAttribute("disabled");
            } else {
                document.getElementById("dob").innerHTML = "<span style='color:red'>You must be 18 or older to register</span>";
                button.setAttribute("disabled", "");
                return;
            }
        }
        }

        function handleLocation() {
            var location = document.getElementById("location").value;
            var button = document.getElementById("button");

            // Implement your location validation logic here
            // For example, check if the location is a valid city name

            var validCities = ["New York", "Los Angeles", "Chicago", "San Francisco", "Miami"];
            
            if (validCities.includes(location)) {
                document.getElementById("location").innerHTML = "<span style='color:blue'>Location is valid</span>";
                button.removeAttribute("disabled");
            } else {
                document.getElementById("location").innerHTML = "<span style='color:red'>Please enter a valid city name</span>";
                button.setAttribute("disabled", "");
                return;
            }
        }

        function handlePassword() {
        	function handlePassword() {
                var password = document.getElementById("password").value;
                var button = document.getElementById("button");
                // Implement your password validation logic here
                // For example, check if the password meets specific criteria (e.g., length)
                if (password.length >= 6) {
                    document.getElementById("password").innerHTML = "<span style='color:blue'>Password is valid</span>";
                    button.removeAttribute("disabled");
                } else {
                    document.getElementById("password").innerHTML = "<span style='color:red'>Password must be at least 6 characters long</span>";
                    button.setAttribute("disabled", "");
                    return;
                }
            }
        }

        function handleConfirmPassword() {
        	function handleConfirmPassword() {
                var password = document.getElementById("password").value;
                var confirmPassword = document.getElementById("confirmPassword").value;
                var button = document.getElementById("button");
                
                if (confirmPassword === password) {
                    document.getElementById("confirmPassword").innerHTML = "<span style='color:blue'>Passwords match</span>";
                    button.removeAttribute("disabled");
                } else {
                    document.getElementById("confirmPassword").innerHTML = "<span style='color:red'>Passwords do not match</span>";
                    button.setAttribute("disabled", "");
                    return;
                }
            }
        }

        function handleRobotCheck() {
        	 function handleRobotCheck() {
        	        var robotCheck = document.getElementById("robotCheck");
        	        var button = document.getElementById("button");

        	        if (robotCheck.checked) {
        	            document.getElementById("robotCheckMessage").innerHTML = "<span style='color:blue'>You are not a robot</span>";
        	            button.removeAttribute("disabled");
        	        } else {
        	            document.getElementById("robotCheckMessage").innerHTML = "<span style='color:red'>Please check the box to confirm you are not a robot</span>";
        	            button.setAttribute("disabled", "");
        	        }
        	    }
        }

        function validateForm() {
        	var name = document.getElementById("name").value;
            var mobileNo = document.getElementById("mobileNo").value;
            var email = document.getElementById("email").value;
            var dob = document.getElementById("dob").value;
            var location = document.getElementById("location").value;
            var password = document.getElementById("password").value;
            var confirmPassword = document.getElementById("confirmPassword").value;
            var robotCheck = document.getElementById("robotCheck").checked;
            var button = document.getElementById("button");

            // Implement your overall form validation logic, checking all fields
            // For example, check if all required fields are filled and meet validation criteria

            // If all validations pass, enable the submit button
            if (name.length >= 3 && name.length < 30 &&
                mobileNo.match(/^\d{10}$/) &&
                email.match(/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/) &&
                dobIsValid(dob) &&
                locationIsValid(location) &&
                passwordIsValid(password) &&
                confirmPassword === password &&
                robotCheck) {
                document.getElementById("valid").innerHTML = "<span style='color:blue'>Information is valid</span>";
                button.removeAttribute("disabled");
            } else {
                document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter valid information</span>";
                button.setAttribute("disabled", "");
            }
        }    }
    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
