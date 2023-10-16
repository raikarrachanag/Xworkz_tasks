<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Application</title>
</head>
<body>
<h1>Loan Application Form</h1>

<form action="loan" method="POST">

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="amount">Amount:</label>
        <input type="text" id="amount" name="amount" required><br><br>

		<label for="working">Working:</label>
        <input type="text" id="working" name="working" required><br><br>
        
        <label for="interest">Interest:</label>
        <input type="text" id="interest" name="interest"required ><br><br>
        
        <label for="surety">Surety:</label>
        <input type="text" id="surety" name="surety" required><br><br>
        
        <label for="company">Company:</label>
        <input type="text" id="company" name="company" required><br><br>
        
        <label for="loanTenure">Loan Tenure:</label>
        <input type="text" id="loanTenure" name="loanTenure" required><br><br>
        
        <label for="loanType">Loan Type:</label>
        <input type="text" id="loanType" name="loanType" required><br><br>
        
        <label>
        <input type="checkbox" id="surety" name="surety" required> By clicking here, I acknowledge that I have read, understand, and agree to abide by the terms and conditions outlined in this loan agreement. I am aware that this agreement represents a legally binding contract between myself and Manager.
        </label>
        <br><br>
        <button>Submit</button>
       
</form>
</body>
</html>