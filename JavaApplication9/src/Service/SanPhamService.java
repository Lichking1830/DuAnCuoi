/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.DanhMucSP;
import java.util.List;

/**
 *
 * @author admin
 */
public interface SanPhamService {

    List<DanhMucSP> getall();

    DanhMucSP getOne(String ten);

    String delete(String id);

    String add(DanhMucSP sp);

    String update(DanhMucSP sp, String id);

}
