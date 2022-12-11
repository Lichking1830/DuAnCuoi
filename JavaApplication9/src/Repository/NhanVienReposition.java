/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.ChucVu;
import DomainModel.NhanVien;
import Ultilities.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author admin
 */
public class NhanVienReposition {

    public List<NhanVien> getAll() {
        String query = "SELECT dbo.NhanVien.Id, dbo.ChucVu.Id, dbo.ChucVu.Ma, dbo.ChucVu.Ten, dbo.NhanVien.Ma AS Expr1, dbo.NhanVien.HoTen, dbo.NhanVien.NgaySinh, dbo.NhanVien.GioiTinh, dbo.NhanVien.DiaChi, dbo.NhanVien.Email, dbo.NhanVien.TenTaiKhoan, \n"
                + "                  dbo.NhanVien.MatKhau, dbo.NhanVien.TrangThai\n"
                + "FROM     dbo.ChucVu INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.ChucVu.Id = dbo.NhanVien.IdCV";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<NhanVien> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(2), rs.getString(3), rs.getString(4));
                NhanVien nv = new NhanVien(rs.getString(1), cv, rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13));
                list.add(nv);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public NhanVien getOne(String ten) {
        String query = "SELECT dbo.NhanVien.Id, dbo.ChucVu.Id, dbo.ChucVu.Ma, dbo.ChucVu.Ten, dbo.NhanVien.Ma AS Expr1, dbo.NhanVien.HoTen, dbo.NhanVien.NgaySinh, dbo.NhanVien.GioiTinh, dbo.NhanVien.DiaChi, dbo.NhanVien.Email, dbo.NhanVien.TenTaiKhoan, \n"
                + "                  dbo.NhanVien.MatKhau, dbo.NhanVien.TrangThai\n"
                + "FROM     dbo.ChucVu INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.ChucVu.Id = dbo.NhanVien.IdCV WHERE dbo.NhanVien.HoTen like ?";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(2), rs.getString(3), rs.getString(4));
                NhanVien nv = new NhanVien(rs.getString(1), cv, rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13));
                return nv;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<NhanVien> getNVOnline() {
        String query = "SELECT dbo.NhanVien.Id, dbo.ChucVu.Id, dbo.ChucVu.Ma, dbo.ChucVu.Ten, dbo.NhanVien.Ma AS Expr1, dbo.NhanVien.HoTen, dbo.NhanVien.NgaySinh, dbo.NhanVien.GioiTinh, dbo.NhanVien.DiaChi, dbo.NhanVien.Email, dbo.NhanVien.TenTaiKhoan, \n"
                + "                  dbo.NhanVien.MatKhau, dbo.NhanVien.TrangThai\n"
                + "FROM     dbo.ChucVu INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.ChucVu.Id = dbo.NhanVien.IdCV WHERE dbo.NhanVien.TrangThai = 0";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<NhanVien> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(2), rs.getString(3), rs.getString(4));
                NhanVien nv = new NhanVien(rs.getString(1), cv, rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13));
                list.add(nv);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(NhanVien nv) {
        String query = "INSERT INTO [dbo].[NhanVien]\n"
                + "           ([IdCV]\n"
                + "           ,[Ma]\n"
                + "           ,[HoTen]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[GioiTinh]\n"
                + "           ,[DiaChi]\n"
                + "           ,[Email]\n"
                + "           ,[TenTaiKhoan]\n"
                + "           ,[MatKhau]\n"
                + "           ,[TrangThai])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, nv.getChucVu().getID());
            ps.setObject(2, nv.getMaNV());
            ps.setObject(3, nv.getHoTen());
            ps.setObject(4, nv.getNgaySinh());
            ps.setObject(5, nv.getGioiTinh());
            ps.setObject(6, nv.getDiaChi());
            ps.setObject(7, nv.getEmail());
            ps.setObject(8, nv.getTenTK());
            ps.setObject(9, nv.getMatKhau());
            ps.setObject(10, nv.getTrangThai());
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(NhanVien nv) {
        String query = "UPDATE [dbo].[NhanVien]\n"
                + "   SET [IdCV] = ?"
                + "      ,[Ma] = ?"
                + "      ,[HoTen] =?"
                + "      ,[NgaySinh] = ?"
                + "      ,[GioiTinh] = ?"
                + "      ,[DiaChi] =?"
                + "      ,[Email] = ?"
                + "      ,[TenTaiKhoan] = ?"
                + "      ,[MatKhau] = ?"
                + "      ,[TrangThai] = ?"
                + " WHERE Id LIKE ?";
        int check = 0;
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, nv.getChucVu().getID());
            ps.setObject(2, nv.getMaNV());
            ps.setObject(3, nv.getHoTen());
            ps.setObject(4, nv.getNgaySinh());
            ps.setObject(5, nv.getGioiTinh());
            ps.setObject(6, nv.getDiaChi());
            ps.setObject(7, nv.getEmail());
            ps.setObject(8, nv.getTenTK());
            ps.setObject(9, nv.getMatKhau());
            ps.setObject(10, nv.getTrangThai());
            ps.setObject(11, nv.getID());
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ten) {
        String query = "DELETE FROM [dbo].[NhanVien]\n"
                + "      WHERE ten like ?";
        int check = 0;
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ten);
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

    public NhanVien check(String tk, String mk) {
        String querry = "SELECT dbo.NhanVien.Id, dbo.ChucVu.Id, dbo.ChucVu.Ma, dbo.ChucVu.Ten, dbo.NhanVien.Ma AS Expr1, dbo.NhanVien.HoTen, dbo.NhanVien.NgaySinh, dbo.NhanVien.GioiTinh, dbo.NhanVien.DiaChi, dbo.NhanVien.Email, dbo.NhanVien.TenTaiKhoan,\n"
                + " dbo.NhanVien.MatKhau, dbo.NhanVien.TrangThai\n"
                + " FROM dbo.ChucVu INNER JOIN\n"
                + " dbo.NhanVien ON dbo.ChucVu.Id = dbo.NhanVien.IdCV WHERE dbo.NhanVien.TenTaiKhoan LIKE ? and dbo.NhanVien.MatKhau = ?";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(querry)) {
            ps.setObject(1, tk);
            ps.setObject(2, mk);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(2), rs.getString(3), rs.getString(4));
                NhanVien nv = new NhanVien(rs.getString(1), cv, rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13));
                return nv;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
