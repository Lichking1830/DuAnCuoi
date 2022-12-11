/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.HoaDon;
import DomainModel.KhachHang;
import DomainModel.NhanVien;
import Ultilities.SQLConnection;
import ViewModel.ViewModelHoaDon;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class HoaDonReposition {

    public List<ViewModelHoaDon> getAll() {
        String query = "SELECT  dbo.HoaDon.Id, dbo.KhachHang.Ma, dbo.KhachHang.HoTen, dbo.NhanVien.Ma AS Expr1, dbo.NhanVien.HoTen AS Expr2, dbo.HoaDon.Ma AS Expr3, dbo.HoaDon.NgayTao, dbo.HoaDon.NgayThanhToan, dbo.HoaDon.TinhTrang\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id";
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            List<ViewModelHoaDon> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2), rs.getString(3));
                NhanVien nv = new NhanVien(rs.getString(4), rs.getString(5));
                ViewModelHoaDon hd = new ViewModelHoaDon(rs.getString(1), kh, nv, rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9));
                list.add(hd);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public ViewModelHoaDon getOne(String maHD) {
        String query = "SELECT  dbo.HoaDon.Id, dbo.KhachHang.Ma, dbo.KhachHang.HoTen, dbo.NhanVien.Ma AS Expr1, dbo.NhanVien.HoTen AS Expr2, dbo.HoaDon.Ma AS Expr3, dbo.HoaDon.NgayTao, dbo.HoaDon.NgayThanhToan, dbo.HoaDon.TinhTrang\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id WHERE dbo.HoaDon.Ma like ? ";
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, maHD);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2), rs.getString(3));
                NhanVien nv = new NhanVien(rs.getString(4), rs.getString(5));
                ViewModelHoaDon hd = new ViewModelHoaDon(rs.getString(1), kh, nv, rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9));
                return hd;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(HoaDon hd) {
        String query = "INSERT INTO [dbo].[HoaDon]\n"
                + "           ([IdKH]\n"
                + "           ,[IdNV]\n"
                + "           ,[Ma]\n"
                + "           ,[NgayTao]\n"
                + "           ,[NgayThanhToan]\n"
                + "           ,[TinhTrang])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        int check = 0;
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, hd.getKhachHang().getID());
            ps.setObject(2, hd.getNhanVien().getID());
            ps.setObject(3, hd.getMaHD());
            ps.setObject(4, hd.getNgayTao());
            ps.setObject(5, hd.getNgayThanhToan());
            ps.setObject(6, hd.getTinhTrang());
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(HoaDon hd, String id) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [IdKH] = ?"
                + "      ,[IdNV] = ?"
                + "      ,[Ma] = ?"
                + "      ,[NgayTao] =?"
                + "      ,[NgayThanhToan] = ?"
                + "      ,[TinhTrang] =?"
                + " WHERE Id like ?";
        int check = 0;
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, hd.getKhachHang().getID());
            ps.setObject(2, hd.getNhanVien().getID());
            ps.setObject(3, hd.getMaHD());
            ps.setObject(4, hd.getNgayTao());
            ps.setObject(5, hd.getNgayThanhToan());
            ps.setObject(6, hd.getTinhTrang());
            ps.setObject(7, id);
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[HoaDon]\n"
                + "      WHERE Id like ?";
        int check = 0;
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

}
