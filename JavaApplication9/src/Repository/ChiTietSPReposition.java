/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.ChiTietSP;
import java.util.List;
import DomainModel.ChucVu;
import DomainModel.DongSP;
import DomainModel.MauSac;
import DomainModel.NSX;
import DomainModel.DanhMucSP;
import Ultilities.SQLConnection;
import ViewModel.ViewModelChiTietSP;
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
public class ChiTietSPReposition {

    public List<ViewModelChiTietSP> getAll() {
        String query = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.NSX.Ma AS Expr1, dbo.NSX.Ten AS Expr2, dbo.MauSac.Ma AS Expr3, dbo.MauSac.Ten AS Expr4, dbo.DongSP.Ma AS Expr5, dbo.DongSP.Ten AS Expr6, dbo.ChiTietSP.NamBH, \n"
                + "                  dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, dbo.ChiTietSP.GiaBan, (dbo.ChiTietSP.SoLuongTon *  dbo.ChiTietSP.GiaBan) as 'ThanhTien'\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.DongSP ON dbo.ChiTietSP.IdDongSP = dbo.DongSP.Id INNER JOIN\n"
                + "                  dbo.MauSac ON dbo.ChiTietSP.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
                + "                  dbo.NSX ON dbo.ChiTietSP.IdNsx = dbo.NSX.Id INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            List<ViewModelChiTietSP> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMucSP sp = new DanhMucSP(rs.getString(2), rs.getString(3));
                NSX nsx = new NSX(rs.getString(4), rs.getString(5));
                MauSac ms = new MauSac(rs.getString(6), rs.getString(7));
                DongSP dsp = new DongSP(rs.getString(8), rs.getString(9));
                ViewModelChiTietSP vmctsp = new ViewModelChiTietSP(rs.getString(1), sp, nsx, ms, dsp, rs.getInt(10), rs.getString(11), rs.getInt(12), rs.getFloat(13), rs.getFloat(14), rs.getFloat(15));
                list.add(vmctsp);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<ViewModelChiTietSP> getSearch(String ten) {
        String query = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.NSX.Ma AS Expr1, dbo.NSX.Ten AS Expr2, dbo.MauSac.Ma AS Expr3, dbo.MauSac.Ten AS Expr4, dbo.DongSP.Ma AS Expr5, dbo.DongSP.Ten AS Expr6, dbo.ChiTietSP.NamBH, \n"
                + "                 dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, dbo.ChiTietSP.GiaBan, (dbo.ChiTietSP.SoLuongTon *  dbo.ChiTietSP.GiaBan) as 'ThanhTien'\n"
                + "                FROM     dbo.ChiTietSP INNER JOIN\n"
                + "               dbo.DongSP ON dbo.ChiTietSP.IdDongSP = dbo.DongSP.Id INNER JOIN\n"
                + "                dbo.MauSac ON dbo.ChiTietSP.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
                + "                    dbo.NSX ON dbo.ChiTietSP.IdNsx = dbo.NSX.Id INNER JOIN\n"
                + "               dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id \n"
                + "			   WHERE dbo.SanPham.Ten like ?";
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            List<ViewModelChiTietSP> list = new ArrayList<>();
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMucSP sp = new DanhMucSP(rs.getString(2), rs.getString(3));
                NSX nsx = new NSX(rs.getString(4), rs.getString(5));
                MauSac ms = new MauSac(rs.getString(6), rs.getString(7));
                DongSP dsp = new DongSP(rs.getString(8), rs.getString(9));
                ViewModelChiTietSP vmctsp = new ViewModelChiTietSP(rs.getString(1), sp, nsx, ms, dsp, rs.getInt(10), rs.getString(11), rs.getInt(12), rs.getFloat(13), rs.getFloat(14), rs.getFloat(15));
                list.add(vmctsp);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(ChiTietSP ctsp) {
        String query = "INSERT INTO [dbo].[ChiTietSP]\n"
                + "           ([IdSP]\n"
                + "           ,[IdNsx]\n"
                + "           ,[IdMauSac]\n"
                + "           ,[IdDongSP]\n"
                + "           ,[NamBH]\n"
                + "           ,[MoTa]\n"
                + "           ,[SoLuongTon]\n"
                + "           ,[GiaNhap]\n"
                + "           ,[GiaBan])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ctsp.getSanPham().getID());
            ps.setObject(2, ctsp.getNsx().getID());
            ps.setObject(3, ctsp.getMauSac().getID());
            ps.setObject(4, ctsp.getDongSanPham().getID());
            ps.setObject(5, ctsp.getNamBH());
            ps.setObject(6, ctsp.getMoTa());
            ps.setObject(7, ctsp.getSoLuongTon());
            ps.setObject(8, ctsp.getGiaNhap());
            ps.setObject(9, ctsp.getGiaBan());
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(ChiTietSP ctsp, String id) {
        String query = "UPDATE [dbo].[ChiTietSP]\n"
                + "   SET [IdSP] = ?"
                + "      ,[IdNsx] = ?"
                + "      ,[IdMauSac] = ?"
                + "      ,[IdDongSP] = ?"
                + "      ,[NamBH] = ?"
                + "      ,[MoTa] = ?"
                + "      ,[SoLuongTon] = ?"
                + "      ,[GiaNhap] =?"
                + "      ,[GiaBan] = ?"
                + " WHERE Id like ?";
        int check = 0;
        try (Connection con = SQLConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ctsp.getSanPham().getID());
            ps.setObject(2, ctsp.getNsx().getID());
            ps.setObject(3, ctsp.getMauSac().getID());
            ps.setObject(4, ctsp.getDongSanPham().getID());
            ps.setObject(5, ctsp.getNamBH());
            ps.setObject(6, ctsp.getMoTa());
            ps.setObject(7, ctsp.getSoLuongTon());
            ps.setObject(8, ctsp.getGiaNhap());
            ps.setObject(9, ctsp.getGiaBan());
            ps.setObject(10, id);
            check = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[ChiTietSP]\n"
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
