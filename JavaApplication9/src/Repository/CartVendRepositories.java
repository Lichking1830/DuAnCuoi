/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.ChiTietSP;
import DomainModels.GioHangChiTiet;
import DomainModels.SanPham;
import Ultilities.SQLConnection;
import ViewModel.CartVendViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HieuTran
 */
public class CartVendRepositories {

    public List<CartVendViewModel> getTableCart() {
        String query = "SELECT    dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.GioHangChiTiet.SoLuong, dbo.GioHangChiTiet.DonGia\n" +
"FROM         dbo.ChiTietSP INNER JOIN dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id AND dbo.ChiTietSP.IdSP = dbo.SanPham.Id\n" +
"						   INNER JOIN dbo.GioHangChiTiet ON dbo.ChiTietSP.Id = dbo.GioHangChiTiet.IdChiTietSP";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<CartVendViewModel> listViewModelses = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sanPham = new SanPham(rs.getString(1), rs.getString(2));
                ChiTietSP chiTietSP = new ChiTietSP(sanPham);
                GioHangChiTiet gioHangChiTiet = new GioHangChiTiet(chiTietSP, rs.getInt(3), rs.getDouble(4));
                CartVendViewModel vendViewModels = new CartVendViewModel(chiTietSP, gioHangChiTiet);
                listViewModelses.add(vendViewModels);
            }
            return listViewModelses;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        List<CartVendViewModel> listViewModelses = new CartVendRepositories().getTableCart();
        for (CartVendViewModel listViewModelse : listViewModelses) {
            System.out.println(listViewModelse.toString());
        }
    }

}
