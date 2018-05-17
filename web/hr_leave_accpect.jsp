<%-- 
    Document   : hr_leave_accpect
    Created on : May 13, 2018, 12:40:15 PM
    Author     : Dharma
--%>

<%@page import="java.util.List"%>
<%  List list1;
            
     list1=(List)session.getAttribute("leave_res");
     // out.println(list1);
    
    %>
<!DOCTYPE html>


<html>
    <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<head>
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
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="static/css/logincss.css" rel="stylesheet" type="text/css" media="all">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
</head>
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

<table id="customers">
  <tr>
    <th><center>EMPLOYEE ID</center></th>
   <!--<th><center>EMPLOYEE NAME</center></th>-->
    <th><center>FROM</center></th>
    <th><center>TO</center></th>
    <th><center>TYPE</center></th>
    <th><center>APPROVAL</center></th>
  </tr>
  <%for(int i=0;i<list1.size();i++)
  {
        List list2;
    //list1.get(row);
    list2=(List)list1.get(i);%>
     
  
      
  <tr>
    <td><%out.println(list2.get(0));%><%session.setAttribute("leaveid",list2.get(0));%></td>
   <!-- <td></td>-->
    <td><%out.println(list2.get(1));%></td>
    <td><%out.println(list2.get(2));%></td>
<td><%out.println(list2.get(4));%><%session.setAttribute("leavetype",list2.get(4));%></td><%session.setAttribute("count",list2.get(5));%>
<td><a href="leave_accept?value=<%out.println(list2.get(0));%>">accept</a><a href="leave_reject?value=<%out.println(list2.get(0));%>">reject</a></td>
  </tr>
  <%}%>

</table>
<script src="layout/scripts/jquery.min.js"></script>
<script src="layout/scripts/jquery.backtotop.js"></script>
<script src="layout/scripts/jquery.mobilemenu.js"></script>
<script src="layout/scripts/jquery.flexslider-min.js"></script>
<script src="layout/scripts/jquery.toptobottom.js"></script>

</body>

</html>
