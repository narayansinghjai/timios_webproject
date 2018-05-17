<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>  
table, th, td {  
    
    border: 1px solid black;  
    border-collapse: collapse;  
}  
.main{
    
     
    align-content: center;
    -webkit-align-content: center;
   position: absolute;
    top: 50%;
    left: 50%;
    margin-right: -50%;
    transform: translate(-50%, -50%);
        
    
}
img {
    display: inline-block;
}
</style>
    </head>
    <body>
        <div class="main"> 
            <center><img src="2.png" height="100"/></center>
            <br>
        <table>
            <col width="200">
            <col width="200">
            <col width="200">
            <col width="150">
<tr>
    <td>Employee Name</td>
    <td><%out.println((String)session.getAttribute("name"));%></td>
    <td>Month</td>
    <td></td>
</tr>  
<tr>
    <td>Employee No</td>
    <td><%out.println((String)session.getAttribute("username"));%></td>
    <td>No.of days</td>
    <td></td>
</tr>  
<tr>
    <td>Location</td>
    <td><%out.println((String)session.getAttribute("address"));%></td>
    <td>Days Worked</td>
    <td></td>
</tr>  
<tr>
    <td>Designation</td>
    <td><%out.println((String)session.getAttribute("desg"));%></td>
    <td>Loss of pay</td>
    <td></td>
</tr>  
</table>
        
        <h3>Salary Details (Figures in INR)</h3> 
        
<table> 
    <col width="200">
    <col width="200">
    <col width="200">
    <col width="150">
            
<tr>
    <td><strong>Earnings</strong></td>
    <td></td>
    <td><strong>Deductions</strong></td>
    <td></td>
</tr>  
<tr>
    <td>Basic Salary</td>
    <td><%out.println((String)session.getAttribute("basicsalary"));%></td>
    <td>Other Deductions</td>
    <td><%out.println((String)session.getAttribute("deduction"));%></td>
</tr>  
<tr>
    <td>HRA</td>
    <td><%out.println((String)session.getAttribute("HRA"));%></td>
    <td>Professional Tax</td>
    <td><%out.println((String)session.getAttribute("pftax"));%></td>
</tr>  
<tr>
    <td>Conveyance Allowance</td>
    <td><%out.println((String)session.getAttribute("CONVEY_ALLOWANCE"));%></td>
    <td>Food Coupon Recovery</td>
    <td><%out.println((String)session.getAttribute("foodcoop"));%></td>
</tr>
<tr>
    <td>Medical Allowance</td>
    <td><%out.println((String)session.getAttribute("MEDICAL_ALLOWANCE"));%></td>
    <td>Others</td>
    <td></td>
</tr>
<tr>
    <td>CCA</td>
    <td><%out.println((String)session.getAttribute("CCA"));%></td>
    <td></td>
    <td></td>
</tr>
<tr>
    <td>Spl. Allowance</td>
    <td><%out.println((String)session.getAttribute("SPL_ALLOWANCE"));%></td>
    <td></td>
    <td></td>
</tr>
<tr>
    <td></td>
    <td></td>
    <td>Total Deductions</td>
    <td></td>
</tr>
<tr>
    <td>Gross</td>
    <td></td>
    <td>Net Pay</td>
    <td></td>
</tr>
</table>
        <h5><center>601 KKR Towers, Chanda Nagar, Hyderabad - 500049 | Ph: 040 - 42607899 | E-Mail: info@trimios.com</center></h5>
        
        <h3>Note: This is a computer generated report and no signature required</h3>
        </div>
    </body>
</html>