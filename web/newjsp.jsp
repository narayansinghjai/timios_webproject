<%-- 
    Document   : newjsp
    Created on : May 12, 2018, 2:34:13 PM
    Author     : Dharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="">
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="static/css/logincss.css" rel="stylesheet" type="text/css" media="all">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
<style>
    
    .dropbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}

.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}

.dropdown:hover .dropbtn {
    background-color: #3e8e41;
}
    </style>

</head>
<body id="top">
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
        <li><a href="index.html">Logout</a></li>
      </ul>
    </div>
  </div>
</div>
<div class="wrapper row1">
  <header id="header" class="hoc clear">
    <div id="logo" class="fl_left">

     <h1><a href="index.html"><img src="customLogo.png" style="width:128px;height:50px;"></img></a></h1>
    </div>
    <nav id="mainav" class="fl_right">
      <ul class="clear">
        <li class="active"><a href="index.html">Home</a></li>
        <li><a class="drop" href="#">Pages</a>

		  <ul>
            <li><a href="" id="id1">EMPLOYEE DETAILS</a></li>
            <li><a href="" id="id1">LEAVES</a></li>
            <li><a href="" id="id1">COMPLAINTS</a></li>
            <li><a href="" id="id1">SALARY</a></li>

		  </ul>

        </li>
      </ul>
    </nav>
  </header>
</div>


<div class="bgded overlay" style="background-image:url('images/demo/backgrounds/blur1.jpg');">
    <div id="pageintro" class="hoc clear">

      <article>
        <div>
          <h2 class="heading">WELCOME</h2>

          <p class="heading"><%String name=(String)session.getAttribute("name");
        out.println(name);%></p>



        </div>
        <footer>
          <ul class="nospace inline pushright">
       <div class="dropdown">
  <li><a class="btn inverse" href="hr_employee" >EMPLOYEE DETAILS</a></li>
  <div class="dropdown-content">
    <a href="hr_employee">ALL</a>
    <a href="dept_search.jsp">DEPARTMENT SEARCH</a>
    <a href="emp_search.jsp">SEARCH BY EMPLOYEE ID</a>
  </div>
</div>
   
       
            <li><a class="btn inverse" href="hr_leave_response">LEAVES</a></li>
            <li><a class="btn inverse" href="complaintser" target="_self">COMPLAINTS</a></li>
            <li><a class="btn inverse" href="hr_salary_response" target="_self">SALARY</a></li>
</ul>
        </footer>
      </article>

    </div>
</div>




<script src="layout/scripts/jquery.min.js"></script>
<script src="layout/scripts/jquery.backtotop.js"></script>
<script src="layout/scripts/jquery.mobilemenu.js"></script>
<script src="layout/scripts/jquery.flexslider-min.js"></script>
<script src="layout/scripts/jquery.toptobottom.js"></script>
</body>
</html>
