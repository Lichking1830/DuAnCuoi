/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.GioHang;
import DomainModel.KhachHang;
import DomainModel.NhanVien;
import Ultilities.SQLConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class GioHangRepository {

    public List<GioHang> getall() {
        String querry = "SELECT dbo.GioHang.Id AS Expr1, dbo.KhachHang.*, dbo.NhanVien.*, dbo.GioHang.Ma AS Expr2, dbo.GioHang.NgayTao, dbo.GioHang.NgayThanhToan, dbo.GioHang.TenNguoiNhan, dbo.GioHang.DiaChi AS Expr3, dbo.GioHang.Sdt, dbo.GioHang.TinhTrang\n"
                + "FROM   dbo.GioHang INNER JOIN\n"
                + "             dbo.KhachHang ON dbo.GioHang.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "             dbo.NhanVien ON dbo.GioHang.IdNV = dbo.NhanVien.Id";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(querry)) {
            List<GioHang> listgh = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getInt(14));
                KhachHang kh = new KhachHang(rs.getString(2), rs.getString(3), rs.getString(4));
                GioHang gh = new GioHang(rs.getString(1), kh, nv, rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getInt(21));
                listgh.add(gh);
            }
            return listgh;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<GioHang> listgh = new GioHangRepository().getall();
        for (GioHang gh : listgh) {
            System.out.println(gh);
        }
    }
}
