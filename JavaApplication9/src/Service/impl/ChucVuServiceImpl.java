/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.ChucVu;
import Repository.ChucVuRepositon;
import Service.ChucVuService;
import java.util.List;

/**
 *
 * @author admin
 */
public class ChucVuServiceImpl implements ChucVuService {
    
    private ChucVuRepositon cvr = new ChucVuRepositon();
    
    @Override
    public List<ChucVu> getAll() {
        return cvr.getAll();
    }
    
    @Override
    public ChucVu getOne(String tenCV) {
        return cvr.getOne(tenCV);
    }
    
    @Override
    public String add(ChucVu cv) {
        boolean add = cvr.add(cv);
        if (add) {
            return "Add Thành Công";
        } else {
            return "Add Thất Bại";
        }
    }
    
    @Override
    public String update(ChucVu cv, String idCV) {
        boolean update = cvr.update(cv, idCV);
        if (update) {
            return "Update Thành Công";
        } else {
            return "Update Thất Bại";
        }
    }
    
    @Override
    public String delete(String idCV) {
        boolean delete = cvr.delete(idCV);
        if (delete) {
            return "Xóa Thành Công";
        } else {
            return "Xóa Thất Bại";
        }
    }
    
}
