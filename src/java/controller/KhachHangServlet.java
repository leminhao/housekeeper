/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.KhachHangDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.KhachHang;

/**
 *
 * @author haoba
 */
@WebServlet(name = "KhachHangServlet", urlPatterns = {"/KhachHangServlet"})
public class KhachHangServlet extends HttpServlet {
    
    KhachHangDAO khachhangDAO = new KhachHangDAO();
    
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String command = request.getParameter("command");
        String url = "";
        KhachHang khachhang = new KhachHang();
        HttpSession session = request.getSession();
        switch (command) {
            case "insert":
                khachhang.setTaiKhoan(request.getParameter("taiKhoan"));
                khachhang.setMatKhau(request.getParameter(("matKhau")));
                khachhangDAO.insertKhachHang(khachhang);
                session.setAttribute("khachhang", khachhang);
                url = "/Nhanvien.jsp";
                break;
            case "login":
                khachhang = khachhangDAO.login(request.getParameter("taiKhoan"),(request.getParameter("matKhau")));
                if (khachhang != null) {
                    session.setAttribute("taikhoan", khachhang);
                    url = "/index.jsp";
                }else{
                    request.setAttribute("error", "Error email or password!");
                    url = "/login.jsp";
                }
                break;
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);

    }

}
