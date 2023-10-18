<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Info</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
    body {
        background-color: #f8f9fa;
        font-family: Arial, sans-serif;
    }

    .container {
        max-width: 600px;
        margin: 50px auto;
        padding: 20px;
        border: 1px solid #dcdcdc;
        border-radius: 5px;
        background-color: Blue;
        box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
    }

    h1 {
        font-size: 24px;
        margin: 10px 0;
    }

    h1 + h1 {
        border-top: 1px solid #dcdcdc;
        padding-top: 10px;
    }

    
    h1 {
        color: #333;
        font-weight: bold;
    }

    .container {
        background-color: #fff;
    }

   
</style>

</head>
<body>
    <div class="container">
        <h1>Name: ${name}</h1>
        <h1>Mobile: ${mobile}</h1>
        <h1>Email: ${email}</h1>
        <h1>Dob: ${dob}</h1>
        <h1>Location: ${location}</h1>
        <h1>Password: ${password}</h1>
        <h1>Confirm Password: ${confirmpassword}</h1>
    </div>
</body>
</html>
