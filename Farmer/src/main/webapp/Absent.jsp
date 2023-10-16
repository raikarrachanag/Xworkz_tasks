<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- index.html -->
<!DOCTYPE html>
<html>
<head>
    <title>Absent Student Information</title>
    <style>
        /* Style for the navigation bar */
        ul.navbar {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        }

        li.navitem {
            float: left;
        }

        li.navitem a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li.navitem a:hover {
            background-color: #ddd;
            color: black;
        }
    </style>
</head>
<body>
    <ul class="navbar">
        <li class="navitem"><a href="/home">Home</a></li>
        <li class="navitem"><a href="/farmer">Farmer</a></li>
        <li class="navitem"><a href="/Absent.jsp">Absent</a></li>
    </ul>
    <h1>Absents list</h1>
    <form action="Attach" method="POST">
        <label for="studentName">Student Name:</label>
        <input type="text" id="studentName" name="studentName" required><br><br>
        
        <label for="fromDate">From Date:</label>
        <input type="date" id="fromDate" name="fromDate" required><br>

		<label for="toDate">To Date:</label>
        <input type="date" id="toDate" name="toDate" required><br>
        
        <label for="reason">Reason:</label>
        <input type="text" id="reason" name="reason"required ><br>
        
        <label for="inform">Informed:</label>
        <input type="radio" id="inform" name="inform" required><br>
        
        

        <input type="submit" value="Save" style="background-color: blue; color: white;">
    </form>
</body>
</html>
