<%-- 
    Document   : profile
    Created on : 12 May, 2018, 11:37:21 AM
    Author     : kpa
--%>

<!DOCTYPE html>
<html>
<title>Profile</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="static/css/logincss.css" rel="stylesheet" type="text/css" media="all">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
<style>
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif}

input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    widtah: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

.pic {
  border-radius: 50%;
  background-color: #cccccc;
  width: 2em;
  height: 2em;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 48px;
  color: #ffffff;
  box-shadow: 0px 0px 6px rgba(20, 20, 20, 0.6);
}


</style>
<body class="w3-light-grey">
    <div class="top">
<!-- Page Container -->
<div class="wrapper row0">
  <div id="topbar" class="hoc clear">
    <div class="fl_left">
      <ul class="nospace">
        <li><i class="fa fa-phone"></i> +91 9876543210</li>
        <li><i class="fa fa-envelope-o"></i> info@trimos.com</li>
      </ul>
    </div>
    <div class="fl_right">
      <ul class="nospace">
        <li><a href="index.html"><i class="fa fa-lg fa-home"></i></a></li>
        <li><a href="about.html" target="_self">About</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
    </div>
  </div>
</div>
<div class="wrapper row1">
  <header id="header" class="hoc clear">
    <div id="logo" class="fl_left">

     <h1><a href="mainpageemp.jsp"><img src="customLogo.png" style="width:128px;height:50px;"></img></a></h1>
    </div>
    <nav id="mainav" class="fl_right">
      <ul class="clear">
        <li class="active"><a href="index.html">Home</a></li>
        <li><a class="drop" href="#">Pages</a>

		  <ul>
            <li><a href="" id="id1">PROFILE</a></li>
            <li><a href="" id="id1">LEAVE</a></li>
            <li><a href="" id="id1">SALARY</a></li>
            <li><a href="" id="id1">HR</a></li>

		  </ul>

        </li>
    </nav>
  </header>
</div>


    </div>

<div class="w3-content w3-margin-top" style="max-width:1400px;">

  <!-- The Grid -->
  <div class="w3-row-padding">

    <!-- Left Column -->
    <div class="w3-third">

      <div class="w3-white w3-text-grey w3-card-4">
        <div class="w3-container">
<!-- <div class="w3-container w3-margin-left"> -->
  <!-- <image id="profileImage" src="http://lorempixel.com/100/100" /> -->
   <div class="pic">PIC</div>

<!-- </div> -->
        <div class="w3-container">
          <!-- <p><i class="fa fa-envelope fa-fw w3-margin-right w3-large w3-text-teal"></i></p>
          <p><i class="fa fa-phone fa-fw w3-margin-right w3-large w3-texteal"></i></p> -->
          <hr>

        </div>
        </div>
      </div><br>


    </div>


    <div class="w3-twothird">


      <div class="w3-container w3-card w3-white">
        <h2 class="w3-text-grey w3-padding-16"></h2>
        <div class="w3-container">
          <hr>

          <form action="profileaft">
              <input type="text" id="empid" name="empid" placeholder="Emp id" value="<%out.println((String)session.getAttribute("username"));%>" disabled="disable">
              <input type="text" id="name" name="name" placeholder="Name" value="<%out.println((String)session.getAttribute("name"));%>" disabled="disable">
              <input type="text" id="email" name="email" placeholder="email" value="<%out.println((String)session.getAttribute("email"));%>">
              <input type="text" id="gender" name="gender" placeholder="gender" value="<%out.println((String)session.getAttribute("gender"));%>" disabled="disable">
              <input type="text" id="phno" name="phno" placeholder="phno" value="<%out.println((String)session.getAttribute("phone"));%>">
              <input type="text" id="dob" name="dob" placeholder="dob"value="<%out.println((String)session.getAttribute("dob"));%>" disabled="disabled">
              <input type="text" id="address" name="address" placeholder="address" value="<%out.println((String)session.getAttribute("address"));%>">
              <input type="text" name="password" value="<%out.println((String)session.getAttribute("password"));%>" />
              <input type="submit" value="update" />

           <!-- <input type="submit" value="Submit"> -->
            </form>

        </div>

      </div>


    </div>


  </div>


</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="layout/scripts/jquery.min.js"></script>
<script src="layout/scripts/jquery.backtotop.js"></script>
<script src="layout/scripts/jquery.mobilemenu.js"></script>
<script src="layout/scripts/jquery.flexslider-min.js"></script>
<script src="layout/scripts/jquery.toptobottom.js"></script>
</body>


</html>