/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.ChiTietLuong;
import Repository.ChiTietLuongReposition;
import Service.ChiTietLuongService;
import ViewModel.ViewModelChiTietLuong;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChiTietLuongServiceImpl implements ChiTietLuongService {

    private ChiTietLuongReposition ctlr = new ChiTietLuongReposition();

    @Override
    public List<ViewModelChiTietLuong> getAll() {
        return ctlr.getAll();
    }

    @Override
    public String update(ChiTietLuong ctl, String id) {
        boolean update = ctlr.update(ctl, id);
        if (update) {
            return "update thành công";
        } else {
            return "update thất bại";
        }
    }

}
