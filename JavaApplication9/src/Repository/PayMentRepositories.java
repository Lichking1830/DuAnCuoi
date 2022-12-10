/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.ChiTietSP;
import DomainModels.HoaDon;
import DomainModels.HoaDonChiTiet;
import DomainModels.KhachHang;
import DomainModels.NhanVien;
import Ultilities.SQLConnection;
import ViewModel.ViewModelPayments;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HieuTran
 */
public class PayMentRepositories {

    public List<ViewModelPayments> getTablePayMents(int trangThai) {
        String query = "SELECT    dbo.HoaDon.Id, dbo.KhachHang.Ma, dbo.KhachHang.HoTen, dbo.NhanVien.Ma AS Expr1, dbo.NhanVien.HoTen AS Expr2, dbo.HoaDon.Ma AS Expr3, dbo.HoaDon.NgayTao, dbo.HoaDon.NgayThanhToan, \n"
                + "                      dbo.HoaDon.TinhTrang\n"
                + "FROM         dbo.HoaDon INNER JOIN\n"
                + "                      dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                      dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id\n"
                + "WHERE dbo.HoaDon.TinhTrang = ?";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<ViewModelPayments> listViewModelPaymentses = new ArrayList<>();
            ps.setObject(1, trangThai);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang khachHang = new KhachHang(rs.getString(2), rs.getString(3));
                NhanVien nhanVien = new NhanVien(rs.getString(4), rs.getString(5));
                HoaDon hoaDon = new HoaDon(rs.getString(1), khachHang, nhanVien, rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9));
                ViewModelPayments payments = new ViewModelPayments(hoaDon, khachHang, nhanVien);
                listViewModelPaymentses.add(payments);
            }
            return listViewModelPaymentses;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;

    }

    public List<ViewModelPayments> sortNgayTao() {
        String query = "SELECT    dbo.HoaDon.Id, dbo.KhachHang.Ma, dbo.KhachHang.HoTen, dbo.NhanVien.Ma AS Expr1, dbo.NhanVien.HoTen AS Expr2, dbo.HoaDon.Ma AS Expr3, dbo.HoaDon.NgayTao, dbo.HoaDon.NgayThanhToan, \n"
                + "                      dbo.HoaDon.TinhTrang\n"
                + "FROM         dbo.HoaDon INNER JOIN\n"
                + "                      dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
                + "                      dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id ORDER BY dbo.HoaDon.NgayTao DESC, dbo.HoaDon.TinhTrang DESC";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<ViewModelPayments> listHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang khachHang = new KhachHang(rs.getString(2), rs.getString(3));
                NhanVien nhanVien = new NhanVien(rs.getString(4), rs.getString(5));
                HoaDon hoaDon = new HoaDon(rs.getString(1), khachHang, nhanVien, rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9));
                ViewModelPayments payments = new ViewModelPayments(hoaDon, khachHang, nhanVien);
                listHD.add(payments);
            }
            return listHD;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean updateThanhToan(String ma) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [TinhTrang] = 0"
                + " WHERE Ma like ?";
        int check = 0;
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<ViewModelPayments> getHDCT(String idHD) {
        String query = "SELECT    dbo.HoaDon.Id, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia\n"
                + "FROM         dbo.HoaDon INNER JOIN dbo.HoaDonChiTiet ON dbo.HoaDon.Id = dbo.HoaDonChiTiet.IdHoaDon\n"
                + "WHERE dbo.HoaDon.Id like ?";
        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, idHD);
            ResultSet rs = ps.executeQuery();
            List<ViewModelPayments> list = new ArrayList<>();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon(rs.getString(1));
                HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet(hoaDon, rs.getInt(2), rs.getFloat(3));
                ViewModelPayments viewModelPayments = new ViewModelPayments(hoaDonChiTiet);
                list.add(viewModelPayments);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        List<ViewModelPayments> list = new PayMentRepositories().getHDCT("FDB99408-4607-49FC-83D4-7C0F5D97920A");
        for (ViewModelPayments payments : list) {
            System.out.println(payments.toString());
        }
    }
}
