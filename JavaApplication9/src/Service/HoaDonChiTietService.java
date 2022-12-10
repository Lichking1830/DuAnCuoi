/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.ViewModelHoaDonCT;
import java.util.List;

/**
 *
 * @author HP
 */
public interface HoaDonChiTietService {

    List<ViewModelHoaDonCT> getAll();

    String insert(ViewModelHoaDonCT hoaDonChiTiet);

    String update(ViewModelHoaDonCT hoaDonChiTiet, String ma);

    String delete(String ma);
}
