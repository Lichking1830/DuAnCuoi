/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.GioHang;
import Repository.GioHangReposition;
import Service.GioHangService;
import java.util.List;

/**
 *
 * @author HP
 */
public class GioHangServiceimpl implements GioHangService {

    GioHangReposition ghre = new GioHangReposition();

    @Override
    public List<GioHang> getall() {
        return ghre.getall();
    }

}
