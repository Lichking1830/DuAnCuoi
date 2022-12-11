/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModels.ChiTietSP;


/**
 *
 * @author HieuTran
 */
public class ProductVendViewModels {

    private String id;
    private ChiTietSP chiTietSP;

    public ProductVendViewModels() {
    }

    public ProductVendViewModels(ChiTietSP chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChiTietSP getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(ChiTietSP chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

    @Override
    public String toString() {
        return "ProductVendViewModels{" + "id=" + id + ", chiTietSP=" + chiTietSP + '}';
    }

}
