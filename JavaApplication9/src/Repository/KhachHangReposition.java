/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.KhachHang;
import Ultilities.SQLConnection;
import ViewModel.ViewModelChiTietSP;
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
public class KhachHangReposition {

    public List<KhachHang> getAll() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[HoTen]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[CCCD]\n"
                + "      ,[DiaChi]\n"
                + "      ,[GioiTinh]\n"
                + "      ,[QueQuan]\n"
                + "  FROM [dbo].[KhachHang]";
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            List<KhachHang> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(query, query, query, query, query, query, query, query);
                list.add(kh);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public KhachHang getOne(String tenKH) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[HoTen]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[CCCD]\n"
                + "      ,[DiaChi]\n"
                + "      ,[GioiTinh]\n"
                + "      ,[QueQuan]\n"
                + "  FROM [dbo].[KhachHang] WHERE HoTen like ?";
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, tenKH);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                return kh;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public boolean update(KhachHang kh, String id) {
        String query = "UPDATE [dbo].[KhachHang]\n"
                + "   SET [Ma] = ?"
                + "      ,[HoTen] = ?"
                + "      ,[NgaySinh] =?"
                + "      ,[CCCD] = ?"
                + "      ,[DiaChi] = ?"
                + "      ,[GioiTinh] = ?"
                + "      ,[QueQuan] =?"
                + " WHERE Id like ?";
        int check = 0;
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, kh.getMaKhachHang());
            ps.setObject(2, kh.getHoVaTen());
            ps.setObject(3, kh.getNgaySinh());
            ps.setObject(4, kh.getCCCD());
            ps.setObject(5, kh.getDiaChi());
            ps.setObject(6, kh.getGioiTinh());
            ps.setObject(7, kh.getQueQuan());
            ps.setObject(8, id);
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[KhachHang]\n"
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
