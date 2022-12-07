/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.SanPham;
import java.util.List;

/**
 *
 * @author admin
 */
public interface SanPhamService {

    List<SanPham> getall();

    SanPham getOne(String ten);

    String delete(String id);

    String add(SanPham sp);

    String update(SanPham sp, String id);

}
