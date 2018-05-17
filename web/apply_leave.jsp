<%-- 
    Document   : apply_leave
    Created on : 12 May, 2018, 1:44:48 PM
    Author     : kpa
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="static/css/logincss.css" rel="stylesheet" type="text/css" media="all">

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




</style>
<body class="w3-light-grey">

<!-- Page Container -->
<div class="w3-content w3-margin-top" style="max-width:1400px;">

  <!-- The Grid -->
  <div class="w3-row-padding">

    

    <div class="w3-card">


      <div class="w3-container w3-card w3-white">
        <h2 class="w3-text-grey w3-padding-16"></h2>
        <div class="w3-container">
        <div class="w3-container">

            <center><h2 class="w3-opacity"> <img src="customLogo.png"></img></h2></center>
        </div>
        <title>JSP Page</title>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker({ beforeShowDay: $.datepicker.noWeekends });
     $( "#datepicker1" ).datepicker({ beforeShowDay: $.datepicker.noWeekends });
  } );
  </script>
    </head>

    <body>
        <h1>Apply Leave</h1>
        <br><br><br>
        <form action="leavesser">
       
        Type :<select name="type">
            <option>SL</option>
            <option>PL</option>
        </select>
        <br><br>
       <p>From Date: <input type="text" id="datepicker" name="from"></p>
       <p>TO Date: <input type="text" id="datepicker1" name="to"></p>
 
        
        <br><br>
        <input type="submit" value="Apply" name="apply" />
        </form>
        </div>
        </div>
        </div>
  </div>
</div>  
  </body>
 
</html>
