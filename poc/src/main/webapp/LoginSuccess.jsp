<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
    <style>
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
</head>
<body>
<div class="topnav">
<a href="Adress.jsp">Address</a>
</div>
    <h1>Welcome Page</h1>
    
    <%-- Retrieve the user's ID from the session or request attribute --%>
    <%
        String userId = (String) request.getAttribute("userId");
    %>
     <p class="success-message">Login Success</p>
    
    
    
</body>
</html>
