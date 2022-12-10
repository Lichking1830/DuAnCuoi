/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.NSX;
import java.util.List;

/**
 *
 * @author admin
 */
public interface NSXService {

    List<NSX> getAll();

    NSX getOne(String tenNSX);

    String delete(String ma);

    String add(NSX nsx);

    String update(NSX nsx, String idNSX);

    List<NSX> search(String ten);
}
