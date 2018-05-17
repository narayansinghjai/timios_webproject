<%-- 
    Document   : emp_detais
    Created on : May 12, 2018, 4:23:19 PM
    Author     : Dharma
--%>



<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  List list1;
            
     list1=(List)session.getAttribute("e_details");
     //out.println(list1);
    
    %>
<!DOCTYPE html>
<html>
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
    
    #customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
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

     <h1><a href="index.html"><img src="customLogo.png" style="width:128px;height:50px;"></img></a></h1>
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

<center><h2>Employees</h2></center>
<table id="customers">
  <tr>
    <th><center>EMPLOYEE ID</center></th>
    <th><center>EMPLOYEE NAME</center></th>
    <th><center>PHONE NUM</center></th>
    <th><center>CITY</center></th>
    <th><center>EMAIL</center></th>
    <th><center>DOB</center></th>
    <th><center>TYPE</center></th>
   <th><center>GENDER</center></th>
   <th><center>MANAGER ID</center></th>
   <th><center>UPDATE</center></th>

  </tr>
  <%for(int i=0;i<list1.size();i++)
  {
        List list2;
    //list1.get(row);
    list2=(List)list1.get(i);
  if(list2.size()!=0){%>
     
  
      
  <tr>
    <td><%out.println(list2.get(7));%></td>
    <td><%out.println(list2.get(0));%></td>
    <td><%out.println(list2.get(1));%></td>
    <td><%out.println(list2.get(2));%></td>
    <td><%out.println(list2.get(3));%></td>
    <td><%out.println(list2.get(4));%></td>
    <td><%out.println(list2.get(5));%></td>
    <td><%out.println(list2.get(6));%></td>
     <td><%out.println(list2.get(8));%></td>
    <td><a href="manager_update_profile?value=<%out.println(list2.get(7));%>">VIEW</a>
  </tr>
  <%}}%>
</table>
   
<TABLE>

</TABLE>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="layout/scripts/jquery.min.js"></script>
<script src="layout/scripts/jquery.backtotop.js"></script>
<script src="layout/scripts/jquery.mobilemenu.js"></script>
<script src="layout/scripts/jquery.flexslider-min.js"></script>
<script src="layout/scripts/jquery.toptobottom.js"></script>
</html>
