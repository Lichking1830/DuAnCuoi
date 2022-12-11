/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.MauSac;
import Repository.MauSacReposition;
import Service.MauSacService;
import java.util.List;

/**
 *
 * @author admin
 */
public class MauSacServiceImpl implements MauSacService {

    MauSacReposition msr = new MauSacReposition();

    @Override
    public MauSac getOne(String ten) {
        return msr.getOne(ten);
    }

    @Override
    public String add(MauSac ms) {
        boolean add = msr.add(ms);
        if (add) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = msr.delete(ma);
        if (delete) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String update(MauSac ms, String id) {
        boolean update = msr.update(ms, id);
        if (update) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public List<MauSac> getAll() {
        return msr.getAll();
    }

    @Override
    public List<MauSac> search(String ten) {
        return msr.search(ten);
    }

}
