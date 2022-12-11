/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.GioHang;
import Repository.GioHangRepository;
import Service.GioHangService;
import java.util.List;

/**
 *
 * @author HP
 */
public class GioHangServiceimpl implements GioHangService {

    GioHangRepository ghre = new GioHangRepository();

    @Override
    public List<GioHang> getall() {
        return ghre.getall();
    }

}
