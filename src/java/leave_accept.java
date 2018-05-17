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
@WebServlet(urlPatterns = {"/leave_accept"})
public class leave_accept extends HttpServlet {

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
            String leaveid=request.getParameter("value");
            try{
             String DRIVER="oracle.jdbc.driver.OracleDriver";  
             String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";  
             String USERNAME="system";  
             String PASSWORD="180180180";  
             
             Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
            PreparedStatement ps=con.prepareStatement(  
    "update leaves_apply1 set approval=? where empid=?");
             ps.setString(1,"a");
             ps.setString(2,leaveid);
             ResultSet rs=ps.executeQuery();
             rs.next();
            // request.getRequestDispacher("hr_leave_response").forward(request,response);
           
           String type= (String)session.getAttribute("leavetype");
           int count=Integer.parseInt((String)session.getAttribute("count"));
          String empid=request.getParameter((String)session.getAttribute("leaveid"));
           
           PreparedStatement ps2=con.prepareStatement(  
    "select * from leaves1 where empid=?");
            
             ps2.setString(1,leaveid);
             ResultSet rs2=ps2.executeQuery();
             rs2.next();
           int slused=Integer.parseInt(rs2.getString(3));
           int plused=Integer.parseInt(rs2.getString(5));
         out.println(slused);
          out.println(slused);  
           if(type.equals("SL")){
              PreparedStatement ps1=con.prepareStatement(  
    "update leaves1 set SL_USED=? where empid=?");
              count=count+slused;
              out.println(count);
              String c=Integer.toString(count);
             ps1.setString(1,c);
             ps1.setString(2,leaveid);
             ResultSet rs1=ps1.executeQuery();
             rs1.next();
           }
           if(type.equals("PL")){
              PreparedStatement ps1=con.prepareStatement(  
    "update leaves1 set pl_used=? where empid=?");
              count=count+plused;
              out.println(count);
              String c=Integer.toString(count);
             ps1.setString(1,c);
             ps1.setString(2,leaveid);
             ResultSet rs1=ps1.executeQuery();
             rs1.next();
           }
          hr_leave_response hr=new hr_leave_response();
          hr.processRequest(request, response);
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
