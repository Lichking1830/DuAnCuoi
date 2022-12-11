/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.ChiTietLuong;
import ViewModel.ViewModelChiTietLuong;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ChiTietLuongService {

    List<ViewModelChiTietLuong> getAll();

    String update(ChiTietLuong ctl, String id);
}
