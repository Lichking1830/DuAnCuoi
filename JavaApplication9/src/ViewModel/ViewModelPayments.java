/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;


import DomainModels.ChiTietSP;
import DomainModels.HoaDon;
import DomainModels.HoaDonChiTiet;
import DomainModels.KhachHang;
import DomainModels.NhanVien;

/**
 *
 * @author HieuTran
 */
public class ViewModelPayments {

    private HoaDon hoaDon;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private ChiTietSP chiTietSP;
    private HoaDonChiTiet hoaDonChiTiet;

    public ViewModelPayments() {
    }

    public ViewModelPayments(HoaDonChiTiet hoaDonChiTiet) {
        this.hoaDonChiTiet = hoaDonChiTiet;
    }
    
    public ViewModelPayments(HoaDon hoaDon, HoaDonChiTiet hoaDonChiTiet) {
        this.hoaDon = hoaDon;
        this.hoaDonChiTiet = hoaDonChiTiet;
    }
    
    public ViewModelPayments(HoaDon hoaDon, KhachHang khachHang, NhanVien nhanVien) {
        this.hoaDon = hoaDon;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
    }

    public ViewModelPayments(HoaDon hoaDon, ChiTietSP chiTietSP, HoaDonChiTiet hoaDonChiTiet) {
        this.hoaDon = hoaDon;
        this.chiTietSP = chiTietSP;
        this.hoaDonChiTiet = hoaDonChiTiet;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public ChiTietSP getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(ChiTietSP chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

    public HoaDonChiTiet getHoaDonChiTiet() {
        return hoaDonChiTiet;
    }

    public void setHoaDonChiTiet(HoaDonChiTiet hoaDonChiTiet) {
        this.hoaDonChiTiet = hoaDonChiTiet;
    }

    @Override
    public String toString() {
        return "ViewModelPayments{" + "hoaDon=" + hoaDon + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", chiTietSP=" + chiTietSP + ", hoaDonChiTiet=" + hoaDonChiTiet + '}';
    }

}
