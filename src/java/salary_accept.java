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
 * @author Dharma
 */
@WebServlet(urlPatterns = {"/salary_accept"})
public class salary_accept extends HttpServlet {

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
            out.println("<title>Servlet leave_accept</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet leave_accept at " + request.getContextPath() + "</h1>");
            HttpSession session=request.getSession();
            String empid=request.getParameter("value");
            try{
             String DRIVER="oracle.jdbc.driver.OracleDriver";  
             String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";  
             String USERNAME="system";  
             String PASSWORD="180180180";  
             
             Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
        
        
             PreparedStatement ps4=con.prepareStatement(  
    "delete manger_salary where  status='APPROVED'");
             
            // ps4.setString(1,empid);
             ResultSet rs5=ps4.executeQuery();
             rs5.next();
             
             
            PreparedStatement ps=con.prepareStatement(  
    "update manger_salary set status=? where empid=?");
             ps.setString(1,"APPROVED");
             ps.setString(2,empid);
             ResultSet rs=ps.executeQuery();
             rs.next();
            // request.getRequestDispacher("hr_leave_response").forward(request,response);
           
          
           
           
              PreparedStatement ps1=con.prepareStatement(  
    "select * from manger_salary where empid=?" );
             ps1.setString(1,empid);
            
             ResultSet rs1=ps1.executeQuery();
             rs1.next();
             String bs=rs1.getString(2);
             String hra=rs1.getString(3);
             String ca=rs1.getString(4);
             String ma=rs1.getString(5);
             String cca=rs1.getString(6); 
             String sa=rs1.getString(7);
             
              ResultSet rs2=ps1.executeQuery();
             rs2.next();
             out.println("go");
             out.println(cca);
             
            
             PreparedStatement ps2=con.prepareStatement(  
    "update earnings1 set basicsalary=?,hra=?,convey_allowance=?,medical_allowance=?,cca=?,spl_allowance=? where empid=?" );
         
             ps2.setString(1,bs);
             ps2.setString(2,hra);
             ps2.setString(3,ca);
             ps2.setString(4,ma);
             ps2.setString(5,cca);
             ps2.setString(6,sa);
             ps2.setString(7,empid);
             ResultSet rs3=ps2.executeQuery();
             rs3.next();
             
             
         
            response.sendRedirect("hr_salary_response");
    
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
