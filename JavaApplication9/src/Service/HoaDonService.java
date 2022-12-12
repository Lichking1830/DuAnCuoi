/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.ChucVu;
import DomainModel.HoaDon;
import DomainModel.KhachHang;
import DomainModel.NhanVien;
import Repository.HoaDonReposition;
import Ultilities.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface HoaDonService {

    List<HoaDon> getAll();

    List<HoaDon> getAllHoaDon(String ngay, String thang, String nam);

    HoaDon getOne(String maHD);

    boolean add(HoaDon hd);

    boolean update(HoaDon hd, String id);

    boolean delete(String id);
    
    List<HoaDon> getAll2();

}
