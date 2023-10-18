<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserInfo</title>

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
	<style>
    /* Custom CSS Styles */
    .form {
        background-color: #f2f2f2;
        max-width: 400px;
        margin: 0 auto;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
    }
</style>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="https://www.x-workz.in/Logo.png" width="100" height="30" class="d-inline-block align-top" alt="Logo">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="home.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="aboutUs.jsp">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="gallery.jsp">Gallery</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="contact.jsp">Contact</a>
                </li>
            </ul>
        </div>
    </div>



		<form class="form-inline">
			<input class="form-control mr-2" type="search" placeholder="Search"
				aria-label="Search">
			<button class="btn btn-outline-success" type="submit">Search</button>
		</form>


		</li>
		<li class="nav-item"><a class="nav-link" href="profile.jsp">Profile
		</a></li>
	</nav>


	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<form action="Attach" method="post" class="form">
					<span style='color: blue;' id="N"></span>
					<div class="form-group">

						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter your name" onblur="handleName()" required>
					</div>
					<br>
					
					<span style='color: blue;' id="Nu"></span>
					<div class="form-group">

						<label for="mobile">Mobile Number</label> <input type="text"
							class="form-control" id="mobile" name="mobile"
							placeholder="Enter your mobile number" onblur="handleNumber()" required>
					</div>
					<br>
					<span style='color: blue;' id="E"></span>
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Email
							address</label> <input type="email" class="form-control"  onblur="Email()"name="email"
							id="exampleInputEmail1" aria-describedby="emailHelp" required>
						<div id="emailHelp" class="form-text">We'll never share your
							email with anyone else.</div>
						  
					</div>
					<br>
					<span style='color: blue;' id="D"></span>
					<div class="form-group">
						<label for="dob">Date of Birth</label> <input type="date"
							class="form-control" id="dob" name="dob"
							onblur="handleFromGroup()" required>
					</div>
					<br>
					<span style='color: blue;' id="C"></span>
					<div class="col-md-3">
						<label for="location" class="form-label" >Location</label>
						<select class="form-select" id="location" name="Location"onblur="handleLocation()" required>
							<option selected disabled value="">Choose your location here....</option>
							
    <option>Bagalkot</option>
    <option>Ballari (Bellary)</option>
    <option>Belagavi (Belgaum)</option>
    <option>Bengaluru (Bangalore) Rural</option>
    <option>Bengaluru (Bangalore) Urban</option>
    <option>Bidar</option>
    <option>Chamarajanagar</option>
    <option>Chikballapur</option>
    <option>Chikkamagaluru (Chikmagalur)</option>
    <option>Chitradurga</option>
    <option>Dakshina Kannada</option>
    <option>Davangere</option>
    <option>Dharwad</option>
    <option>Gadag</option>
    <option>Hassan</option>
    <option>Haveri</option>
    <option>Kalaburagi (Gulbarga)</option>
    <option>Kodagu</option>
    <option>Kolar</option>
    <option>Koppal</option>
    <option>Mandya</option>
    <option>Mysuru (Mysore)</option>
    <option>Raichur</option>
    <option>Ramanagara</option>
    <option>Shivamogga (Shimoga)</option>
    <option>Tumakuru (Tumkur)</option>
    <option>Udupi</option>
    <option>Uttara Kannada (Karwar)</option>
    <option>Vijayapura (Bijapur)</option>
    <option>Yadgir</option>


						</select>
					</div>
					<br>
					<span style='color: blue;' id="p"></span>
					<div class="form-group">
						<label for="password">Password</label> <input type="password"
							class="form-control" id="password" name="password"
							placeholder="Enter your password" onblur="handlePassword()" required>
					</div>
					<br>
					<span style='color: blue;' id="Pa"></span>
					<div class="form-group">
						<label for="confirmPassword">Confirm Password</label> <input
							type="password" class="form-control" id="confirmPassword"
							name="confirmPassword" placeholder="Confirm your password"
							onblur="handleConfirm()" required>
					</div>
					<br>
					<div class="g-recaptcha"
						data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"></div>
						<span>Copyright@2023</span>

					<br>


					<button type="submit" class="btn btn-primary">Cancel</button>

					<button type="submit" class="btn btn-primary" id="Submit" disabled>Submit</button>
					
				</form>
			</div>
		</div>
	</div>
	<script>
	function handleFromGroup(){
		const date=document.getElementById("dob").value;
		const button=document.getElementById("Submit");
		if(date===''){
			console.log("date is Invalid")
			document.getElementById("D").innerHTML="It is InValid";
			button.setAttribute("disabled","disabled");
			
		}else{
			console.log("Date is valid...")
			document.getElementById("D").innerHTML="It is valid";
			button.removeAttribute("disabled");
		}
		
	}
    function handleName(){
    	const Name=document.getElementById("name").value;
    	const button=document.getElementById("Submit");
    	if(Name.length>3 && Name.length<20){
    		console.log("Name is valid")
    		document.getElementById("N").innerHTML="It is Valid";
    		button.removeAttribute("disabled");
    		
    	}else{
    		console.log("Name is Invalid")
    		document.getElementById("N").innerHTML="It is InValid";
    		button.setAttribute("disabled","disabled");
    	}
    }
    function Email() {
        const emailInput = document.getElementById("exampleInputEmail1").value;
        const button = document.getElementById("Submit");
        const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

        if (emailPattern.test(emailInput)) {
            console.log("Email is Valid");
            document.getElementById("E").innerHTML = "It is Valid";
            button.removeAttribute("disabled");
        } else {
            console.log("Email is Invalid");
            document.getElementById("E").innerHTML = "It is Invalid";
            button.setAttribute("disabled", "disabled");
        }
    }

    function handleNumber(){
    	const Number=document.getElementById("mobile").value;
    	const button=document.getElementById("Submit");
    	if(Number>1000000000 && Number<9999999999)
    		{
    		console.log("Number is valid")
    		document.getElementById("Nu").innerHTML="It is Valid";
    		button.removeAttribute("disabled");
    		}else{
    			console.log("Number is Invalid")
    			document.getElementById("Nu").innerHTML="It is InValid";
    			button.setAttribute("disabled","disabled");
    			}
    }
    function handleLocation(){
    	const checkLocation=document.getElementById("location").value;
    	const button=document.getElementById("Submit");
    	if(checkLocation==='Choose...'){
    		console.log("Location is InValid")
    		button.setAttribute("disabled","disabled");
    		document.getElementById("C").innerHTML="It is InValid";
    	}else{
    		console.log("Location is Valid")
    		document.getElementById("C").innerHTML="It is Valid";
    		button.removeAttribute("disabled");
    	}
    }
    function handlePassword(){
    	const checkPassword=document.getElementById("password").value;
    	
    	const button=document.getElementById("Submit");
    	if(checkPassword.length>3&& checkPassword.length<20)
    		{
    		console.log("Password is valid")
    		document.getElementById("P").innerHTML="It  is Valid";
    		button.removeAttribute("disabled");
    		}else{
    			console.log("password is Invalid")
        		document.getElementById("P").innerHTML="It is Valid";
    			
    		}
    }
   function handleConfirm(){
	   const ConfirmPassword=document.getElementById("confirmPassword").value;
	   const checkPassword=document.getElementById("password").value;
   	const button=document.getElementById("Submit");
   	if(ConfirmPassword!=checkPassword)
   		{
   		console.log("ConfirmPassword is Invalid")
		document.getElementById("Pa").innerHTML="It is InValid";
   		button.setAttribute("disabled","disabled");
		}else{
			console.log("ConfirmPassword is valid")
    		document.getElementById("Pa").innerHTML="It is Valid";
			button.removeAttribute("disabled");
			
		}
   		
   }
    
    
    
    </script>
	<script src='https://www.google.com/recaptcha/api.js'></script>

	<!-- Add Bootstrap JS Links -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>