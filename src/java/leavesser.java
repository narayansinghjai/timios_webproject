/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
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
@WebServlet(urlPatterns = {"/leavesser"})
public class leavesser extends HttpServlet {

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
            out.println("<title>Servlet leavesser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet leavesser at " + request.getContextPath() + "</h1>");
            
             try{
             String DRIVER="oracle.jdbc.driver.OracleDriver";  
             String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";  
             String USERNAME="system";  
             String PASSWORD="180180180";  
             String fdate=request.getParameter("from");
             String tdate=request.getParameter("to");
             String type=request.getParameter("type");
             Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
        HttpSession session = request.getSession();
         String name=(String)session.getAttribute("username");
          
         
        String[] fdate1=fdate.split("/");
        String[] tdate1=fdate.split("/");
        
     
      
        SimpleDateFormat myFormat=new SimpleDateFormat("mm/dd/yyyy");
         String dateBeforeString =fdate;
	 String dateAfterString =tdate;

                java.util.Date dateBefore = myFormat.parse(dateBeforeString);
	       java.util.Date  dateAfter =  myFormat.parse(dateAfterString);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	       int daysBetween =(int)(difference / (1000*60*60*24));
               String days=Integer.toString(daysBetween);
  //HttpSession session = request.getSession();
               session.setAttribute("dayscount",daysBetween);
         // HttpSession session = request.getSession();
           PreparedStatement ps=con.prepareStatement(  
         "insert into leaves_apply1 values(?,?,?,?,?,?)");  
         ps.setString(1,name);
         ps.setString(2,fdate); 
         ps.setString(3,tdate);
         ps.setString(4,"p");
         ps.setString(5,type);
         ps.setString(6,days);
          ResultSet rs=ps.executeQuery();
          boolean s1=rs.next(); 
         
           response.sendRedirect("mainpageemp.jsp");
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