/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModels.ChiTietSP;
import DomainModels.GioHangChiTiet;

/**
 *
 * @author HieuTran
 */
public class CartVendViewModel {

    private ChiTietSP chiTietSP;
    private GioHangChiTiet gioHangChiTiet;

    public CartVendViewModel() {
    }

    public CartVendViewModel(ChiTietSP chiTietSP, GioHangChiTiet gioHangChiTiet) {
        this.chiTietSP = chiTietSP;
        this.gioHangChiTiet = gioHangChiTiet;
    }

    public ChiTietSP getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(ChiTietSP chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

    public GioHangChiTiet getGioHangChiTiet() {
        return gioHangChiTiet;
    }

    public void setGioHangChiTiet(GioHangChiTiet gioHangChiTiet) {
        this.gioHangChiTiet = gioHangChiTiet;
    }

    @Override
    public String toString() {
        return "CartVendViewModel{" + "chiTietSP=" + chiTietSP + ", gioHangChiTiet=" + gioHangChiTiet + '}';
    }

}
