/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.MauSac;
import com.sun.tools.javac.Main;
import java.util.List;

/**
 *
 * @author admin
 */
public interface MauSacService {

    List<MauSac> getall();

    MauSac getOne(String ten);

    String add(MauSac ms);

    String delete(String id);

    String update(MauSac ms, String id);
}
