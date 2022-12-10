/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModel.ChiTietSP;
import DomainModel.DanhMucSP;
import DomainModel.DongSP;
import DomainModel.GioHang;
import DomainModel.GioHangChiTiet;
import DomainModel.MauSac;
import DomainModel.NSX;
import Ultilities.SQLConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class GioHangChiTietReposition {

    public List<GioHangChiTiet> getall() {
        String querry = "";
        try ( Connection con = SQLConnection.getConnection();  PreparedStatement ps = con.prepareStatement(querry)) {
            List<GioHangChiTiet> listghct = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
