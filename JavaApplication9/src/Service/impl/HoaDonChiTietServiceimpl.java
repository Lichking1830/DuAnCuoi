/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repository.HoaDonCTReposition;
import Service.HoaDonChiTietService;
import ViewModel.ViewModelHoaDonCT;
import java.util.List;

/**
 *
 * @author HP
 */
public class HoaDonChiTietServiceimpl implements HoaDonChiTietService {

    HoaDonCTReposition hdctre = new HoaDonCTReposition();

    @Override
    public List<ViewModelHoaDonCT> getAll() {
        return hdctre.getAll();
    }

    @Override
    public String insert(ViewModelHoaDonCT hoaDonChiTiet) {
        boolean insert = hdctre.insert(hoaDonChiTiet);
        if (insert) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String update(ViewModelHoaDonCT hoaDonChiTiet, String ma) {
        boolean update = hdctre.update(hoaDonChiTiet, ma);
        if (update) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = hdctre.delete(ma);
        if (delete) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

}
