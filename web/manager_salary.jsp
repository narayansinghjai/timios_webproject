<%-- 
    Document   : hr_employee_update
    Created on : May 13, 2018, 10:26:28 AM
    Author     : Dharma
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

<!-- Page Container -->
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

          <form action="manager_request_update">
              
           ID<input type="text" id="empid" name="empid" value="<%out.println(session.getAttribute("salemp"));%>" >
           
           BASIC SALARY <input type="text" id="basicsalary" name="basicsalary" value="<%out.println(session.getAttribute("basicsalary"));%>">
           HRA <input type="text" id="hra" name="hra" value="<%out.println(session.getAttribute("hra"));%>">
           CONVEY ALLOWANCE<input type="text" id="convey_allowance" name="convey_allowance" value="<%out.println(session.getAttribute("convey_allowance"));%>">
            MEDICAL ALLOWANCE<input type="text" id="" name="medical_allowance" value="<%out.println(session.getAttribute("medical_allowance"));%>">
            CCA<input type="text" id="cca" name="cca" value="<%out.println(session.getAttribute("cca"));%>">
           SPECIAL ALLOWANCE <input type="text" id="spl_allowance" name="spl_allowance" value="<%out.println(session.getAttribute("spl_allowance"));%>">

            <input type="submit" value="REQUEST TO HR">
            </form>

        </div>

      </div>


    </div>


  </div>


</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

</body>


</html>

