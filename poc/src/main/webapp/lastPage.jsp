<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Address Page</title>
</head>
<style>
body {background-color : powderblue;}
h2{
color:green;
}

        .success-message {
            color: green;
            font-size: 40px;
        }
        .topnav{
        overflow: hidden;
        background-color: #333;
        }
        .topnav a {
        float: left;
        color: #f2f2f2;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        font-size: 17px;
        }
        .topnav a:hover {
        background-color: #ddd;
        color: black;
        }
        .topnav a.active{
        background-color: #04AA6D;
        color: white;
        }
    
</style>
<body>
<div class="topnav">
<a href="index.jsp">Home</a>
</div>
    <h1>Address Page</h1>
    

        <h2>Address sent Successfully!!</h2>
        
        <h3>Address Information:</h3>
        
        <p>no: ${no}</p>
        <p>street: ${street}</p>
        <p>state: ${state}</p>
        <p>country: ${country}</p>
        <p>city: ${city}</p>
  
  
    
    
</body>
</html>



