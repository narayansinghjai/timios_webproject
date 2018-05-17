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
@WebServlet(urlPatterns = {"/hr_update_profile"})
public class hr_update_profile extends HttpServlet {

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
            out.println("<title>Servlet hr_update_profile</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet hr_update_profile at " + request.getContextPath() + "</h1>");
            
            HttpSession session=request.getSession();
            
            String s1=request.getParameter("empid");
            String s2=request.getParameter("name");
            String s3=request.getParameter("email");
            String s4=request.getParameter("gender");
            String s5=request.getParameter("phno");
             String s14=request.getParameter("dept");
            String s6=request.getParameter("dob");
            String s7=request.getParameter("address");
            String s8=request.getParameter("basicsalary");
            String s9=request.getParameter("hra");
            String s10=request.getParameter("convey_allowance");
            String s11=request.getParameter("medical_allowance");
            String s12=request.getParameter("cca");
            String s13=request.getParameter("spl_allowance");
            
            out.println(s1);
            try{
             String DRIVER="oracle.jdbc.driver.OracleDriver";  
             String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";  
             String USERNAME="system";  
             String PASSWORD="180180180";  
             
             Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
       
            PreparedStatement ps=con.prepareStatement(  
    "update profile set name=?,phone=?,address=?,email=?,gender=? where empid=? ");
            //+ "//where username=? and passwordq=?");  

            ps.setString(1,s2);
            ps.setString(2,s5);
            ps.setString(3,s7);
            ps.setString(4,s3);
            ps.setString(5,s4);
            ps.setString(6,s1);
            ResultSet rs=ps.executeQuery();  
             rs.next();
            
             
            /*  PreparedStatement ps1=con.prepareStatement(  
    "update earnings1 set basicsalary=?,hra=?,convey_allowance=?,medical_allowance=?,cca=?,spl_allowance=? where empid=? ");
            //+ "//where username=? and passwordq=?");  

            ps1.setString(1,s8);
            ps1.setString(2,s9);
            ps1.setString(3,s10);
            ps1.setString(4,s11);
            ps1.setString(5,s12);
            ps1.setString(6,s13);
            ps1.setString(7,(String)session.getAttribute("id"));
            ResultSet rs1=ps1.executeQuery();  
             rs1.next();
            
            */
            
            response.sendRedirect("newjsp.jsp");
            
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
