/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kpa
 */
@WebServlet(urlPatterns = {"/hr_employee"})
public class hr_employee extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet database</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet database at " + request.getContextPath() + "</h1>");
            ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
           List<ArrayList<String >> list1=new ArrayList<>();
          // List<String> list1=new ArrayList<>();
             //ArrayList<> temp=new ArrayList<ArrayList>();
             
            String username="tri002";
                    //request.getParameter("empid");
            String password="1234";
                    //request.getParameter("password");
   try{
             String DRIVER="oracle.jdbc.driver.OracleDriver";  
             String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";  
             String USERNAME="system";  
             String PASSWORD="180180180";  
             
             Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
            PreparedStatement ps=con.prepareStatement(  
    "select * from profile ");
            //+ "//where username=? and passwordq=?");  
  out.println("hii");
        //ps.setString(1,username);  
         //ps.setString(2, password);  
              
         ResultSet rs=ps.executeQuery();  

//                boolean status=rs.next();
 

while(rs.next()){
    ArrayList<String> list2=new ArrayList<>();
      if(rs.getString(6).equals("hr")){
           
       }
       else{
 for(int i=1;i<=rs.getMetaData().getColumnCount();i++){
       
      
       list2.add(rs.getString(i));
 }
   }
    list1.add(list2);
    
                }
out.println(list1);
   HttpSession session = request.getSession();
                 
   session.setAttribute("e_details", list1);                 
                
                //out.print("emoy");
                
                  if(true){  
out.println("You r successfully logged in");

  /* PreparedStatement ps1=con.prepareStatement(  
    "select name from login where username=?");  
   ps1.setString(1,username);  
   HttpSession session = request.getSession();
   
   ResultSet rs1=ps1.executeQuery();
   boolean s=rs1.next();
   
   String name=rs1.getString(1);
   session.setAttribute("name", name);
   session.setAttribute("username", username);
   session.setAttribute("password", password);
   
   
   
   PreparedStatement ps2=con.prepareStatement(  
         "select * from profile where empid=?");  
         ps2.setString(1,username);
         
           ResultSet rs3=ps2.executeQuery();
           boolean s3=rs3.next();
           
         session.setAttribute("address", rs3.getString(3));
         session.setAttribute("desg", rs3.getString(6));
    out.println("he");
         
         PreparedStatement ps4=con.prepareStatement(  
    "select * from leaves1 where empid=?"); 
     ps4.setString(1,username); 
     
      out.println("go");
     ResultSet rs2=ps4.executeQuery();
      boolean s1=rs2.next();
      int pltot=20;
      int sltot=10;
      String slused1=rs2.getString(3);
      int slused=Integer.parseInt(slused1);
      String plused1=rs2.getString(5);
       int plused=Integer.parseInt(plused1);
      int slavi=sltot-slused;
      int plavi=pltot-plused;
      
       session.setAttribute("slused", slused);
       session.setAttribute("plused", plused);
       session.setAttribute("slavi", slavi);
       session.setAttribute("plavi", plavi);
       session.setAttribute("slpend", rs2.getString(6));
       session.setAttribute("plpend", rs2.getString(7));
      /* PreparedStatement ps3=con.prepareStatement(  
    "select fromdate,todate from leavedates where username=?"); 
        ps3.setString(1,username); 
         ResultSet rs3=ps3.executeQuery();
          boolean s2=rs3.next();
          String from=rs3.getString(1);
          String to=rs3.getString(2);
         // session.setAttribute("from", from);
          //session.setAttribute("to", to);
                



  */
 response.sendRedirect("emp_detais.jsp");
}
                  
else  
{  
out.print("Sorry, email or password error");  
}
            }catch(Exception e){out.println(e);}  
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}