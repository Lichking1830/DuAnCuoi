/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.DongSP;
import Repository.DongSPReposition;
import Service.DongSPService;
import java.util.List;

/**
 *
 * @author admin
 */
public class DongSPServiceImpl implements DongSPService {

    DongSPReposition dspre = new DongSPReposition();

    @Override
    public List<DongSP> getall() {
        return dspre.getAll();
    }

    @Override
    public DongSP getOne(String ten) {
        return dspre.getOne(ten);
    }

    @Override
    public String add(DongSP dsp) {
        boolean add = dspre.add(dsp);
        if (add) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = dspre.delete(id);
        if (delete) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String update(DongSP dsp, String id) {
        boolean update = dspre.update(dsp, id);
        if (update) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

}
