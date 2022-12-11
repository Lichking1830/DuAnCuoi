/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.DanhMucSP;
import Ultilities.SQLConnection;
import ViewModel.ViewModelChiTietSP;
import ViewModel.ViewModelHoaDonCT;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class HoaDonCTReposition {

    public List<ViewModelHoaDonCT> getAll() {
        String query = "SELECT dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.ChiTietSP.Id = dbo.HoaDonChiTiet.IdChiTietSP INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<ViewModelHoaDonCT> listHDVM = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMucSP sanPham = new DanhMucSP(rs.getString(1), rs.getString(2));
                ViewModelChiTietSP chiTietSP = new ViewModelChiTietSP(sanPham);
                ViewModelHoaDonCT chiTietHoaDonViewModel = new ViewModelHoaDonCT(chiTietSP, rs.getInt(3), rs.getFloat(4));
                listHDVM.add(chiTietHoaDonViewModel);
            }
            return listHDVM;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean insert(ViewModelHoaDonCT hoaDonChiTiet) {
        int check = 0;
        String query = "INSERT INTO [dbo].[HoaDonChiTiet]\n"
                + "           ([IdHoaDon]\n"
                + "           ,[IdChiTietSP]\n"
                + "           ,[SoLuong]\n"
                + "           ,[DonGia])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, hoaDonChiTiet.getHoaDon().getID());
            ps.setObject(2, hoaDonChiTiet.getCtsp().getID());
            ps.setObject(3, hoaDonChiTiet.getSoLuong());
            ps.setObject(4, hoaDonChiTiet.getDonGia());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(ViewModelHoaDonCT hoaDonChiTiet, String ma) {
        int check = 0;
        String query = "UPDATE [dbo].[HoaDonChiTiet]\n"
                + "   SET [IdHoaDon] = ?"
                + "      ,[IdChiTietSP] = ?"
                + "      ,[SoLuong] = ?"
                + "      ,[DonGia] = ?"
                + " WHERE Id = ?";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, hoaDonChiTiet.getHoaDon().getID());
            ps.setObject(2, hoaDonChiTiet.getCtsp().getID());
            ps.setObject(3, hoaDonChiTiet.getSoLuong());
            ps.setObject(4, hoaDonChiTiet.getDonGia());
            ps.setObject(5, ma);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        int check = 0;
        String query = "DELETE FROM [dbo].[HoaDonChiTiet]\n"
                + "      WHERE Id = ?";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(5, ma);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        List<ViewModelHoaDonCT> listHoaDonCTs = new HoaDonCTReposition().getAll();
        for (ViewModelHoaDonCT viewModelHoaDonCT : listHoaDonCTs) {
            System.out.println(viewModelHoaDonCT.toString());
        }
    }
}
