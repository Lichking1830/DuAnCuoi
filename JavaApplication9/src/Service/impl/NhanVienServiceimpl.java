/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.NhanVien;
import Repository.NhanVienReposition;
import Service.NhanVienService;
import ViewModel.ViewModelNhanVien;
import java.util.List;

/**
 *
 * @author HP
 */
public class NhanVienServiceimpl implements NhanVienService {

    NhanVienReposition nvre = new NhanVienReposition();

    @Override
    public List<ViewModelNhanVien> getall() {
        return nvre.getAll();
    }

    @Override
    public ViewModelNhanVien getOne(String ten) {
        return nvre.getOne(ten);
    }

    @Override
    public String add(NhanVien nv) {
        boolean add = nvre.add(nv);
        if (add) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = nvre.delete(id);
        if (delete) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String update(NhanVien nv, String id) {
        boolean update = nvre.update(nv, id);
        if (update) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public boolean checkTKMK(String tk, String mk) {
        return nvre.check(tk, mk);
    }

}
