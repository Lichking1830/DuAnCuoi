/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.NhanVien;
import java.util.List;

/**
 *
 * @author HP
 */
public interface NhanVienService {

    List<NhanVien> getall();

    NhanVien getOne(String ten);

    String add(NhanVien nv);

    String delete(String id);

    String update(NhanVien nv);

    NhanVien checkTKMK(String tk, String mk);
    
    List<NhanVien> getNVOnline();
}
