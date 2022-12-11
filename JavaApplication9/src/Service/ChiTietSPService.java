/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.ChiTietSP;
import DomainModel.DanhMucSP;
import ViewModel.ViewModelChiTietSP;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ChiTietSPService {

    List<ViewModelChiTietSP> getAll();

    String add(ChiTietSP ctsp);

    String update(ChiTietSP ctsp, String id);

    String delete(String id);
    
    List<ViewModelChiTietSP> getSearch(String ten);
}
