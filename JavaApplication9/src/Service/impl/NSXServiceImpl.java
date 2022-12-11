/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.NSX;
import Repository.NSXReposition;
import Service.NSXService;
import java.util.List;

/**
 *
 * @author admin
 */
public class NSXServiceImpl implements NSXService {

    NSXReposition nsxre = new NSXReposition();

    @Override
    public List<NSX> getAll() {
        return nsxre.getAll();
    }

    @Override
    public NSX getOne(String tenNSX) {
        return nsxre.getOne(tenNSX);
    }

    @Override
    public String delete(String ma) {
        boolean delete = nsxre.delete(ma);
        if (delete) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String add(NSX nsx) {
        boolean add = nsxre.add(nsx);
        if (add) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public String update(NSX nsx, String idNSX) {
        boolean update = nsxre.update(nsx, idNSX);
        if (update) {
            return "thanh cong";
        } else {
            return "ko thanh cong";
        }
    }

    @Override
    public List<NSX> search(String ten) {
        return nsxre.search(ten);
    }

}
