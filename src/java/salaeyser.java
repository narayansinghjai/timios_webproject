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
@WebServlet(urlPatterns = {"/salaeyser"})
public class salaeyser extends HttpServlet {

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
            out.println("<title>Servlet salaeyser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet salaeyser at " + request.getContextPath() + "</h1>");
           try{
             String DRIVER="oracle.jdbc.driver.OracleDriver";  
             String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";  
             String USERNAME="system";  
             String PASSWORD="180180180";  
             
             Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
        HttpSession session = request.getSession();
         String username=(String)session.getAttribute("username");
         out.println(username);
            PreparedStatement ps=con.prepareStatement(  
         "select * from earnings1 where empid=?");  
         ps.setString(1,username);
         
         ResultSet rs1=ps.executeQuery();
              boolean s=rs1.next();
           session.setAttribute("basicsalary",rs1.getString(2));
           session.setAttribute("HRA", rs1.getString(3));
           session.setAttribute("CONVEY_ALLOWANCE", rs1.getString(4));
           session.setAttribute("MEDICAL_ALLOWANCE", rs1.getString(5));
           session.setAttribute("CCA", rs1.getString(6));
           session.setAttribute("SPL_ALLOWANCE", rs1.getString(7));
           
        PreparedStatement ps1=con.prepareStatement(  
         "select * from deductions1 where empid=?");  
         ps1.setString(1,username);
         
         ResultSet rs2=ps1.executeQuery();
              boolean s1=rs2.next();
           
           session.setAttribute("deduction",rs1.getString(2));
           session.setAttribute("pftax", rs1.getString(3));
           session.setAttribute("foodcoop", rs1.getString(4));
           
           
           response.sendRedirect("salary.jsp");
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
