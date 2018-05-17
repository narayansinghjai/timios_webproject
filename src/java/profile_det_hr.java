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
@WebServlet(urlPatterns = {"/profile_det_hr"})
public class profile_det_hr extends HttpServlet {

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
            out.println("<title>Servlet proile_det_hr</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet proile_det_hr at " + request.getContextPath() + "</h1>");
            HttpSession session=request.getSession();
            //String s1=(String)session.getAttribute("id2");
            String empid=request.getParameter("value");
            out.println(empid);
             try{
             String DRIVER="oracle.jdbc.driver.OracleDriver";  
             String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";  
             String USERNAME="system";  
             String PASSWORD="180180180";  
             
             Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
            PreparedStatement ps=con.prepareStatement(  
    "select * from profile where empid=? ");
            //+ "//where username=? and passwordq=?");  

        ps.setString(1,empid);  
         //ps.setString(2, password);  
              
         ResultSet rs=ps.executeQuery();  

//                boolean status=rs.next();
             rs.next();
           
             
       session.setAttribute("name", rs.getString(1));
       session.setAttribute("phone", rs.getString(2));
       session.setAttribute("address", rs.getString(3));
       session.setAttribute("email", rs.getString(4));
        session.setAttribute("dob", rs.getString(5));
       session.setAttribute("dept", rs.getString(6));
       session.setAttribute("gender", rs.getString(7));
       session.setAttribute("proemp", empid);
      //
      String own=(String)session.getAttribute("employee");
      out.println(own);
      
     
       PreparedStatement ps1=con.prepareStatement(  
    "select * from earnings1 where empid=? ");
       

        ps1.setString(1,empid); 
         ResultSet rs1=ps1.executeQuery();  
             rs1.next();
              out.println("y");
               out.println((String)session.getAttribute("s1"));
       session.setAttribute("basicsalary", rs1.getString(2));
       session.setAttribute("hra", rs1.getString(3));
       session.setAttribute("convey_allowance", rs1.getString(4));
       session.setAttribute("medical_allowance", rs1.getString(5));
       session.setAttribute("cca", rs1.getString(6));
       session.setAttribute("spl_allowance", rs1.getString(7));
       response.sendRedirect("hr_employee_update.jsp");
      
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
