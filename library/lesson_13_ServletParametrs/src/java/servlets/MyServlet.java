/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mega
 */
public class MyServlet extends HttpServlet {
    
    int count = 0; // счетчик
    
    // выводит параметр инициализации из web.xml
    @Override
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        System.out.println(config.getInitParameter("textParam"));
    }

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
        
        request.getSession().setAttribute("counter", count);
        
        // получить инфо обо всех параметрах идущих в request (хранятся в Enumeration)
//        Enumeration en = request.getParameterNames();
//        while(en.hasMoreElements()) {
//            System.out.println(en.nextElement());
//        }
        Enumeration en2= request.getParameterNames();
        
        try (PrintWriter out = response.getWriter()) {            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            // печать счетчика на странице
//            out.print("<h1>" + count + "</h1>"); // не правильно
            out.print("<h1>" + request.getSession().getAttribute("counter") + "</h1>"); // правильно
            count++;
            
//            out.println("<h1>Parametr p =  " + request.getParameter("p") + "</h1>");
            
            //вывести на странице инфо обо всех параметрах идущих в request              
        while(en2.hasMoreElements()) {
            String parametr = en2.nextElement().toString();
            out.println("<p> Param " + parametr + " = " + request.getParameter(parametr) + "</p>");
        }
                      
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
