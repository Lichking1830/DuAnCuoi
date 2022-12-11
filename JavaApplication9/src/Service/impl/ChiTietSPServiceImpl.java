/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.ChiTietSP;
import DomainModel.DanhMucSP;
import Repository.ChiTietSPReposition;
import Service.ChiTietSPService;
import ViewModel.ViewModelChiTietSP;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChiTietSPServiceImpl implements ChiTietSPService {

    private ChiTietSPReposition ctspr = new ChiTietSPReposition();

    @Override
    public List<ViewModelChiTietSP> getAll() {
        return ctspr.getAll();
    }

    @Override
    public String add(ChiTietSP ctsp) {
        boolean add = ctspr.add(ctsp);
        if (add) {
            return "add thành công";
        } else {
            return "add thất bại";
        }
    }

    @Override
    public String update(ChiTietSP ctsp, String id) {
        boolean update = ctspr.update(ctsp, id);
        if (update) {
            return "update thành công";
        } else {
            return "update thất bại";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = ctspr.delete(id);
        if (delete) {
            return "delete thành công";
        } else {
            return "delete thất bại";
        }
    }

    @Override
    public List<ViewModelChiTietSP> getSearch(String ten) {
        return ctspr.getSearch(ten);
    }

}
