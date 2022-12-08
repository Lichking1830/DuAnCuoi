/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.KhachHang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface KhachHangService {

    List<KhachHang> getAll();

    KhachHang getOne(String tenKH);

    String update(KhachHang kh, String id);

    String delete(String id);
}
