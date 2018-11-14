package controller;

import dao.NhanvienDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author haoba
 */
@WebServlet(name = "NhanvienServlet", urlPatterns = {"/NhanvienServlet"})
public class NhanvienServlet extends HttpServlet {
    private final NhanvienDAO nhanvienDAO = new NhanvienDAO();
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String maNhanvien = request.getParameter("maNhanvien");
     }
}
    
 

