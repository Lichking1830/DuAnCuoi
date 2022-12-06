/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author HP
 */
public class HoaDonChiTiet {

    private ChiTietSanPham ctsp;
    private HoaDon hoaDon;
    private int soLuong;
    private int donGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(ChiTietSanPham ctsp, HoaDon hoaDon, int soLuong, int donGia) {
        this.ctsp = ctsp;
        this.hoaDon = hoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public ChiTietSanPham getCtsp() {
        return ctsp;
    }

    public void setCtsp(ChiTietSanPham ctsp) {
        this.ctsp = ctsp;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "ctsp=" + ctsp + ", hoaDon=" + hoaDon + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

    public Object[] showdata() {
        return new Object[]{ctsp, hoaDon, soLuong, donGia};
    }
}
