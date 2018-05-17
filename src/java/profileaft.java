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
@WebServlet(urlPatterns = {"/profileaft"})
public class profileaft extends HttpServlet {

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
            out.println("<title>Servlet profileaft</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet profileaft at " + request.getContextPath() + "</h1>");
             String email=request.getParameter("email");
             String phno=request.getParameter("phno");
             String address=request.getParameter("address");
             String password=request.getParameter("password");
                try{
             String DRIVER="oracle.jdbc.driver.OracleDriver";  
             String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";  
             String USERNAME="system";  
             String PASSWORD="180180180";  
             
             Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
        HttpSession session = request.getSession();
         String name=(String)session.getAttribute("username");
            PreparedStatement ps=con.prepareStatement(  
         "update profile set phone=?,address=?,email=? where empid=?");  
         ps.setString(1,phno);
         ps.setString(2,address);
         ps.setString(3,email);
         ps.setString(4,name);
         
          ResultSet rs=ps.executeQuery();
          boolean s1=rs.next();

          
           PreparedStatement ps1=con.prepareStatement(  
         "update login set password1=? where username=?");  
         ps1.setString(1,password);
        
         ps1.setString(2,name);
         
          ResultSet rs1=ps1.executeQuery();
          boolean s2=rs1.next();
            }catch(Exception e){out.println(e);} 
                
                
                
          out.println("alert('Profile is updated');");
         response.setHeader("Refresh", "1; URL=mainpageemp.jsp");
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
