/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.HoaDon;
import DomainModel.KhachHang;
import DomainModel.NhanVien;
import Ultilities.SQLConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class HoaDonReposition {

    List<HoaDon> getall() {
        String querry = "SELECT dbo.HoaDon.Id AS Expr1, dbo.KhachHang.*, dbo.NhanVien.*, dbo.HoaDon.Ma AS Expr2, dbo.HoaDon.NgayTao, dbo.HoaDon.NgayThanhToan, dbo.HoaDon.TinhTrang\n"
                + "FROM   dbo.HoaDon INNER JOIN\n"
                + "             dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "             dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(querry)) {
            List<HoaDon> listhd = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang khachHang = new KhachHang(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                NhanVien nhanVien = new NhanVien(rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getInt(19));
                HoaDon hd = new HoaDon(rs.getString(1), khachHang, nhanVien, rs.getString(20), rs.getString(21), rs.getString(22), rs.getInt(23));
                listhd.add(hd);
            }
            return listhd;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<HoaDon> listhd = new HoaDonReposition().getall();
        for (HoaDon hd : listhd) {
            System.out.println(hd);
        }
    }
}
