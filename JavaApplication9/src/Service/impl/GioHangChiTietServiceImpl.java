/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.GioHangChiTiet;
import Repository.GioHangChiTietRepository;
import Repository.GioHangRepository;
import Service.GioHangChiTietService;
import ViewModel.ViewModelGioHangChiTiet;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class GioHangChiTietServiceImpl implements GioHangChiTietService {

    GioHangChiTietRepository ghctr = new GioHangChiTietRepository();

    @Override
    public List<ViewModelGioHangChiTiet> getAll() {
        return ghctr.getAll();
    }

    @Override
    public boolean add(GioHangChiTiet ghct) {
        return ghctr.add(ghct);
    }

}
