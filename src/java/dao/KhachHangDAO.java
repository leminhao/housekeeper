
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.KhachHang;
/**
 *
 * @author haoba
 */
public class KhachHangDAO {
     public boolean checkTaiKhoan(String taiKhoan) {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM khachhang WHERE taiKhoan = '" + taiKhoan + "'";
        PreparedStatement ps;
        try {
            ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                connection.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
      // phương thức thêm tài khoản
    public boolean insertKhachHang(KhachHang k) {
        Connection connection = DBConnect.getConnection();
        String sql = "INSERT INTO khachhang VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setString(1, k.getTaiKhoan());
            ps.setString(2, k.getMatKhau());
            ps.setString(3, k.getSoDienThoai());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // kiểm tra đăng nhập
    public KhachHang login(String taiKhoan, String matKhau) {
        Connection con = DBConnect.getConnection();
        String sql = "select * from khachhang where taiKhoan='" + taiKhoan + "' and matkhau='" + matKhau + "'";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                KhachHang k = new KhachHang();
                k.setTaiKhoan(rs.getString("taiKhoan"));
                k.getMatKhau(rs.getString("matKhau"));
                con.close();
                return k;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
