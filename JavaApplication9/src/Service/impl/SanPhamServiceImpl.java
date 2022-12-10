/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.SanPham;
import Repository.SanPhamReposition;
import Service.SanPhamService;
import java.util.List;

/**
 *
 * @author admin
 */
public class SanPhamServiceImpl implements SanPhamService {

    SanPhamReposition spre = new SanPhamReposition();

    @Override
    public List<SanPham> getall() {
        return spre.getAll();
    }

    @Override
    public SanPham getOne(String ten) {
        return spre.getOne(ten);
    }

    @Override
    public String delete(String id) {
        boolean delete = spre.delete(id);
        if (delete) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String add(SanPham sp) {
        boolean add = spre.add(sp);
        if (add) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String update(SanPham sp, String id) {
        boolean update = spre.update(sp, id);
        if (update) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

}
