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
 * @author Dharma
 */
@WebServlet(urlPatterns = {"/hr_emp_search"})
public class hr_emp_search extends HttpServlet {

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
            out.println("<title>Servlet hr_emp_search</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet hr_emp_search at " + request.getContextPath() + "</h1>");
              ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
            List<ArrayList<String >> list1=new ArrayList<>();
           String username=request.getParameter("profileselect");
            String charc=request.getParameter("empid");
           try{
             String DRIVER="oracle.jdbc.driver.OracleDriver";  
             String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";  
             String USERNAME="system";  
             String PASSWORD="180180180";  
             out.println(username);
             Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD); 
        out.println(username);
        if(username.equals("EMPLOYEE ID")){
                        out.println("hii1");

            PreparedStatement ps=con.prepareStatement(  
    "select * from profile where empid=? ");
            //+ "//where username=? and passwordq=?");  
  out.println("hii");
        ps.setString(1,charc);  
         //ps.setString(2, password);  
              
         ResultSet rs=ps.executeQuery();  

//                boolean status=rs.next();
 

while(rs.next()){
    ArrayList<String> list2=new ArrayList<>();
                 
   for(int i=1;i<=rs.getMetaData().getColumnCount();i++){
      
       
       list2.add(rs.getString(i));
       
   }
    list1.add(list2);
    
                }
out.println(list1);
   HttpSession session = request.getSession();
                 
   session.setAttribute("e_details", list1);                 
                
                //out.print("emoy");
                
                  if(true){  
out.println("You r successfully logged in");
 response.sendRedirect("emp_detais.jsp");
}
        }
        
        else if(username.equals("NAME")){
            out.println("hii1");
              PreparedStatement ps=con.prepareStatement(  
    "select * from profile where name=? ");
            //+ "//where username=? and passwordq=?");  
  out.println("hii");
        ps.setString(1,charc);  
         //ps.setString(2, password);  
              
         ResultSet rs=ps.executeQuery();  

//                boolean status=rs.next();
 

while(rs.next()){
    ArrayList<String> list2=new ArrayList<>();
                 
   for(int i=1;i<=rs.getMetaData().getColumnCount();i++){
       
       list2.add(rs.getString(i));
   }
    list1.add(list2);
    
                }
out.println(list1);
   HttpSession session = request.getSession();
                 
   session.setAttribute("e_details", list1);                 
                
                //out.print("emoy");
                
                  if(true){  
out.println("You r successfully logged in");
 response.sendRedirect("emp_detais.jsp");
}
        }
             
        
        else if(username.equals("PHONE NUMBER")){
            out.println("hii1");
              PreparedStatement ps=con.prepareStatement(  
    "select * from profile where phone=? ");
            //+ "//where username=? and passwordq=?");  
  out.println("hii");
        ps.setString(1,charc);  
         //ps.setString(2, password);  
              
         ResultSet rs=ps.executeQuery();  

//                boolean status=rs.next();
 

while(rs.next()){
    ArrayList<String> list2=new ArrayList<>();
                 
   for(int i=1;i<=rs.getMetaData().getColumnCount();i++){
       
       list2.add(rs.getString(i));
   }
    list1.add(list2);
    
                }
out.println(list1);
   HttpSession session = request.getSession();
                 
   session.setAttribute("e_details", list1);                 
                
                //out.print("emoy");
                
                  if(true){  
out.println("You r successfully logged in");
 response.sendRedirect("emp_detais.jsp");
}
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
