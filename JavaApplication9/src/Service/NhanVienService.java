/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.NhanVien;
import ViewModel.ViewModelNhanVien;
import java.util.List;

/**
 *
 * @author HP
 */
public interface NhanVienService {

    List<ViewModelNhanVien> getall();

    ViewModelNhanVien getOne(String ten);

    String add(NhanVien nv);

    String delete(String id);

    String update(NhanVien nv, String id);

    boolean checkTKMK(String tk, String mk);
}
