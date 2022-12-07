/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.MauSac;
import Repository.MauSacReposition;
import Service.MauSacService;
import java.util.List;

/**
 *
 * @author admin
 */
public class MauSacServiceImpl implements MauSacService {

    MauSacReposition msre = new MauSacReposition();

    @Override
    public List<MauSac> getall() {
        return msre.getAll();
    }

    @Override
    public MauSac getOne(String ten) {
        return msre.getOne(ten);
    }

    @Override
    public String add(MauSac ms) {
        boolean add = msre.add(ms);
        if (add) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = msre.delete(id);
        if (delete) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String update(MauSac ms, String id) {
        boolean update = msre.update(ms, id);
        if (update) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

}
