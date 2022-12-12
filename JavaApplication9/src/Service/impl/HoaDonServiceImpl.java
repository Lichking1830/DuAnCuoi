/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.HoaDon;
import Repository.HoaDonReposition;
import Service.HoaDonChiTietService;
import Service.HoaDonService;
import ViewModel.ViewModelHoaDonCT;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonServiceImpl implements HoaDonService {

    HoaDonReposition hdr = new HoaDonReposition();

    @Override
    public List<HoaDon> getAll() {
        return hdr.getAll();
    }

    @Override
    public List<HoaDon> getAllHoaDon(String ngay, String thang, String nam) {
        return hdr.getAllHoaDon(ngay, thang, nam);
    }

    @Override
    public HoaDon getOne(String maHD) {
        return hdr.getOne(maHD);
    }

    @Override
    public boolean add(HoaDon hd) {
        return hdr.add(hd);
    }

    @Override
    public boolean update(HoaDon hd, String id) {
        return hdr.update(hd, id);
    }

    @Override
    public boolean delete(String id) {
        return hdr.delete(id);
    }

    @Override
    public List<HoaDon> getAll2() {
        return hdr.getAll2();
    }

}
