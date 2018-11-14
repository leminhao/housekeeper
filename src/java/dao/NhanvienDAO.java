//package dao;
//
//import connect.DBConnect;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import model.Nhanvien;
//
///**
// *
// * @author haoba
// */
//public class NhanvienDAO {
//    //hiển thị chi tiết nhân viên
//    public Nhanvien getNhanvien(long maNhanVien) throws SQLException {
//        Connection connection = DBConnect.getConnection();
//        String sql = "SELECT * FROM product WHERE maNhanVien = '" + maNhanVien + "'";
//        PreparedStatement ps = connection.prepareCall(sql);
//        ResultSet rs = ps.executeQuery();
//        Nhanvien nhanvien = new Nhanvien();
//        while (rs.next()){
//            nhanvien.setMaNhanVien(rs.getLong("maNhanVien"));
//            nhanvien.setTenNhanVien(rs.getString("tenNhanVien"));
//            nhanvien.setChuyenMon(rs.getString("chuyenMon"));
//            nhanvien.setMucLuong(rs.getString("mucLuong"));
//            nhanvien.setKinhNghiem(rs.getString("kinhNghiem"));
//            nhanvien.setDanhGia(rs.getString("danhGia"));
//        }
//        return nhanvien;
//            
//            
//        }
// 
//            
//    
//}
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import connect.DBConnect;
import model.Nhanvien;

public class NhanvienDAO implements ObjectDAO{
	public static ArrayList<Nhanvien> dsNhanvien = new ArrayList<>();
	public static Set<String > dschuyenMonNhanVien = new TreeSet<>();
	public NhanvienDAO(){
		dsNhanvien.removeAll(dsNhanvien);
	}
	@Override
	public ArrayList<Nhanvien> getDanhSach() {
		ResultSet rs;
		try {
			rs = new DBConnect().chonDuLieuTuDTB("select * from nhanvien");
			while(rs.next()){
				dsNhanvien.add(new Nhanvien(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return dsNhanvien;
	}
	@Override
	public Set<String> getDanhSachTheochuyenMon() {
		ResultSet rs;
		try {
			rs = new DBConnect().chonDuLieuTuDTB("select * from nhanvien");
			while(rs.next()){
				dschuyenMonNhanVien.add(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return dschuyenMonNhanVien;
	}
	public ArrayList<Nhanvien> locDanhSach(String ho){
		ArrayList<Nhanvien> ds = new ArrayList<>();
		ResultSet rs;
		try {
                    String chuyenMon = null;
			rs = new DBConnect().chonDuLieuTuDTB("select * from nhanvien where chuyenMon='"+chuyenMon+"'");
			while(rs.next()){
				ds.add(new Nhanvien(rs.getLong(1), rs.getString(2), rs.getString(4), rs.getString(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return ds;
	}

    public Set<String> getDanhSachChuyenMon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
