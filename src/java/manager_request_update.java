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

/**
 *
 * @author kpa
 */
@WebServlet(urlPatterns = {"/manager_request_update"})
public class manager_request_update extends HttpServlet {

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
            out.println("<title>Servlet manager_request_update</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet manager_request_update at " + request.getContextPath() + "</h1>");
            String s1=request.getParameter("empid");
            String s8=request.getParameter("basicsalary");
            String s9=request.getParameter("hra");
            String s10=request.getParameter("convey_allowance");
            String s11=request.getParameter("medical_allowance");
            String s12=request.getParameter("cca");
            String s13=request.getParameter("spl_allowance");
            try{
             String DRIVER="oracle.jdbc.driver.OracleDriver";  
             String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";  
             String USERNAME="system";  
             String PASSWORD="180180180";  
             
             Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD); 
         PreparedStatement ps1=con.prepareStatement(  
    "insert into manger_salary values(?,?,?,?,?,?,?,?)");
            //+ "//where username=? and passwordq=?");  
            ps1.setString(1,s1);
            ps1.setString(2,s8);
            ps1.setString(3,s9);
            ps1.setString(4,s10);
            ps1.setString(5,s11);
            ps1.setString(6,s12);
            ps1.setString(7,s13);
            ps1.setString(8,"PENDING");
          
            ResultSet rs1=ps1.executeQuery();  
             rs1.next();
            
           
            
            response.sendRedirect("managermain.jsp");
            
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
