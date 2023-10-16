<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Address Page</title>
</head>
<style>
body {background-color : powderblue;}
*{
    margin: 0;
    padding: 0;
    font-family: sans-serif;
}

.hero {
    height: 100%;
    width: 100%;
    background-image: linear-gradient(rgba(0,0,0,0.4), rgba(0,0,0,0.4)), url('./bg1.jpg');
    background-position: center;
    background-size: cover;
    position: absolute;
}

.form-box{
    width: 380px;
    height: 480px;
    position: relative;
    margin: 6% auto;
    background: #fff;
    padding: 5px;
    overflow: hidden;
}

.btn-box {
    width: 220px;
    margin: 35px auto;
    position: relative;
    box-shadow: 0 0 20px 9px #ff61241f;
    border-radius: 30px;
}

.toggle-btn {
    padding: 10px 30px;
    cursor: pointer;
    background: transparent;
    border: 0;
    outline: none;
    position: relative;
}

#btn {
    top: 0;
    left: 0;
    position: absolute;
    width: 110px;
    height: 100%;
    background: linear-gradient(to right, #ff105f, #ffad06);
    border-radius: 30px;
    transition: 0.5s;
}

.social-icons {
    margin: 30px auto;
    text-align: center;
}


.social-icons img {
    width: 30px;
    margin: 0 12px;
    box-shadow: 0 0 20px 0 #7f7f7f3d;
    cursor: pointer;
    border-radius: 50%;
}

.input-group{
    top: 180px;
    position: absolute;
    width: 280px;
    transition: 0.5s;
}

.input-field{
    width: 100%;
    padding: 10px 0;
    margin: 5px 0;
    border-left: 0;
    border-top: 0;
    border-right: 0;
    border-bottom: 1px solid #999;
    outline: none;
    background: transparent;
}

.submit-btn {
    width: 85%;
    padding: 10px 30px;
    cursor: pointer;
    display: block;
    margin: auto;
    background: linear-gradient(to right, #ff105f, #ffad06);
    border: 0;
    outline: none;
    border-radius: 30px;
}

.checkbox {
    margin: 30px 10px 30px 0;
}

span{
    color: #777;
    font-size: 12px;
    bottom: 68px;
    position: absolute;
}

#login{

    left: 50px;
}


#register{
    left:450px;
}</style>
<body>

  <div class="hero">
        <div class="form-box">
            <div class="btn-box">
                <div id="btn">
                    
                </div>
                <button type="button" class="toggle-btn" >Address</button>
                    </div>
            
            <form id="login" class="input-group" action="Success" method="post">
                <input type="text" class="input-field" placeholder="no:" required name="no">
                <input type="text" class="input-field" placeholder="street" required name="street">
               <input type="text" class="input-field" placeholder="city:" required name="city">
                <input type="text" class="input-field" placeholder="state:" required name="state">
                <input type="text" class="input-field" placeholder="country:" required name="country">
               
                <button type="submit" class="submit-btn" >Send</button>
            </form>
            

        </div>
        
    </div>
    
</body>
</html>
