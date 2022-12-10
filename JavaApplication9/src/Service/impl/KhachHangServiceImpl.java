/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.KhachHang;
import Repository.KhachHangReposition;
import Service.KhachHangService;
import java.util.List;

/**
 *
 * @author admin
 */
public class KhachHangServiceImpl implements KhachHangService {

    private KhachHangReposition khr = new KhachHangReposition();

    @Override
    public List<KhachHang> getAll() {
        return khr.getAll();
    }

    @Override
    public KhachHang getOne(String tenKH) {
        return khr.getOne(tenKH);
    }

    @Override
    public String update(KhachHang kh, String id) {
        boolean update = khr.update(kh, id);
        if (update) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = khr.delete(id);
        if (delete) {
            return "delete thanh cong";
        } else {
            return "delete that bai";
        }
    }

}
