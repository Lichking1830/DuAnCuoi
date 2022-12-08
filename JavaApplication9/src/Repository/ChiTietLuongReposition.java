/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.ChiTietLuong;
import DomainModel.NhanVien;
import Ultilities.SQLConnection;
import ViewModel.ViewModelChiTietLuong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChiTietLuongReposition {

    public List<ViewModelChiTietLuong> getAll() {
        String query = "SELECT dbo.ChiTietLuong.Id, dbo.NhanVien.Ma, dbo.NhanVien.HoTen, dbo.ChiTietLuong.SoGioLam, dbo.ChiTietLuong.LuongCoBan, dbo.ChiTietLuong.LuongTinhTheoGio,  (dbo.ChiTietLuong.SoGioLam *dbo.ChiTietLuong.LuongTinhTheoGio) as 'LuongLamViec', (dbo.ChiTietLuong.SoGioLam *dbo.ChiTietLuong.LuongTinhTheoGio) + dbo.ChiTietLuong.LuongCoBan as'LuongThucTe'\n"
                + "FROM     dbo.ChiTietLuong INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.ChiTietLuong.IdNV = dbo.NhanVien.Id";
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            List<ViewModelChiTietLuong> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(2), rs.getString(3));
                ViewModelChiTietLuong vmctl = new ViewModelChiTietLuong(rs.getString(1), nv, rs.getFloat(4), rs.getFloat(5), rs.getFloat(6), rs.getFloat(7), rs.getFloat(8));
                list.add(vmctl);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public boolean update(ChiTietLuong ctl, String id) {
        String query = "UPDATE [dbo].[ChiTietLuong]\n"
                + "   SET [IdNV] = ?"
                + "      ,[SoGioLam] = ?"
                + "      ,[LuongCoBan] = ?"
                + "      ,[LuongTinhTheoGio] = ?"
                + " WHERE Id like ?";
        int check = 0;
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ctl.getNv().getID());
            ps.setObject(2, ctl.getSoGioLam());
            ps.setObject(3, ctl.getLuongCoBan());
            ps.setObject(4, ctl.getLuongTinhTheoGio());
            ps.setObject(5, id);
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }
}
