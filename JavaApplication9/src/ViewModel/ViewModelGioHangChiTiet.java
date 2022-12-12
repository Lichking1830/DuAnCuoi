/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModel.DongSP;
import DomainModel.GioHangChiTiet;
import DomainModel.MauSac;
import DomainModel.NSX;
import DomainModel.SanPham;

/**
 *
 * @author ADMIN
 */
public class ViewModelGioHangChiTiet {

    private SanPham sanPham;
    private NSX nsx;
    private MauSac mauSac;
    private DongSP dongSanPham;
    private int soLuong;
    private float donGia;

    public ViewModelGioHangChiTiet() {
    }

    public ViewModelGioHangChiTiet(SanPham sanPham, NSX nsx, MauSac mauSac, DongSP dongSanPham, int soLuong, float donGia) {
        this.sanPham = sanPham;
        this.nsx = nsx;
        this.mauSac = mauSac;
        this.dongSanPham = dongSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public NSX getNsx() {
        return nsx;
    }

    public void setNsx(NSX nsx) {
        this.nsx = nsx;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public DongSP getDongSanPham() {
        return dongSanPham;
    }

    public void setDongSanPham(DongSP dongSanPham) {
        this.dongSanPham = dongSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public Object[] toDataRow() {
        return new Object[]{sanPham.getTenSP(), nsx.getTenNSX(), mauSac.getTenMS(), dongSanPham.getTenDSP(), soLuong, donGia};
    }
}
