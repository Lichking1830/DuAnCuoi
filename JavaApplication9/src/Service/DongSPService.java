/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.DongSP;
import java.util.List;

/**
 *
 * @author admin
 */
public interface DongSPService {

    List<DongSP> getall();

    DongSP getOne(String ten);

    String add(DongSP dsp);

    String delete(String ma);

    String update(DongSP dsp, String id);
}
