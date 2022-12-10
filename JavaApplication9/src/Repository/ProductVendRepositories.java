/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.ChiTietSP;
import DomainModels.SanPham;
import Ultilities.SQLConnection;
import ViewModel.ProductVendViewModels;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HieuTran
 */
public class ProductVendRepositories {

    public List<ProductVendViewModels> getTableProducts() {
        String query = "SELECT    dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaBan, dbo.ChiTietSP.MoTa\n"
                + "FROM         dbo.ChiTietSP INNER JOIN\n"
                + "                      dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<ProductVendViewModels> listProductVendViewModelses = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sanPham = new SanPham(rs.getString(1), rs.getString(2));
                ChiTietSP chiTietSP = new ChiTietSP(sanPham, rs.getInt(3), rs.getString(6), rs.getInt(4), rs.getDouble(5));
                ProductVendViewModels productVendViewModels = new ProductVendViewModels(chiTietSP);
                listProductVendViewModelses.add(productVendViewModels);
            }
            return listProductVendViewModelses;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<ProductVendViewModels> getSearch(String ma) {
        String query = "SELECT    dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaBan, dbo.ChiTietSP.MoTa\n"
                + "FROM         dbo.ChiTietSP INNER JOIN\n"
                + "                      dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id\n"
                + "WHERE dbo.SanPham.Ma like ?";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<ProductVendViewModels> listProductVendViewModelses = new ArrayList<>();
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sanPham = new SanPham(rs.getString(1), rs.getString(2));
                ChiTietSP chiTietSP = new ChiTietSP(sanPham, rs.getInt(3), rs.getString(6), rs.getInt(4), rs.getDouble(5));
                ProductVendViewModels productVendViewModels = new ProductVendViewModels(chiTietSP);
                listProductVendViewModelses.add(productVendViewModels);
            }
            return listProductVendViewModelses;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        String t = "SP09";
        List<ProductVendViewModels> list = new ProductVendRepositories().getSearch(t);
        for (ProductVendViewModels productVendViewModels : list) {
            System.out.println(productVendViewModels.toString());
        }
    }
}
