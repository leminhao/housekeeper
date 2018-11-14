package controller;


import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.NhanvienDAO;
import model.Nhanvien;


@WebServlet("/XuLyLoc")
public class XuLyLoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public XuLyLoc() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chuyenMon = request.getParameter("chuyenMon");
		HttpSession session = request.getSession();
		ArrayList<Nhanvien> dsLoc = new NhanvienDAO().locDanhSach(chuyenMon);
		if(chuyenMon.equals("")||chuyenMon == null){
//			dsLoc=new ThanhVienDAO().getDanhSach();
//			session.setAttribute("dsThanhVien", dsLoc);
			response.sendRedirect("Nhanvien.jsp");
		}else{
			session.setAttribute("dsLoc", dsLoc);
			response.sendRedirect("TimkiemNV.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
