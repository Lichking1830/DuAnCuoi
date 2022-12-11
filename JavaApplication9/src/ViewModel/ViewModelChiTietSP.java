/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModel.DongSP;
import DomainModel.MauSac;
import DomainModel.NSX;
import DomainModel.DanhMucSP;

/**
 *
 * @author admin
 */
public class ViewModelChiTietSP {

    private String id;
    private DanhMucSP sanPham;
    private NSX nsx;
    private MauSac mauSac;
    private DongSP dongSanPham;
    private int namBH;
    private String moTa;
    private int soLuongTon;
    private float giaNhap;
    private float giaBan;
    private float tongTien;

    public ViewModelChiTietSP() {
    }

    public ViewModelChiTietSP(String id, DanhMucSP sanPham, NSX nsx, MauSac mauSac, DongSP dongSanPham, int namBH, String moTa, int soLuongTon, float giaNhap, float giaBan, float tongTien) {
        this.id = id;
        this.sanPham = sanPham;
        this.nsx = nsx;
        this.mauSac = mauSac;
        this.dongSanPham = dongSanPham;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.tongTien = tongTien;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DanhMucSP getSanPham() {
        return sanPham;
    }

    public void setSanPham(DanhMucSP sanPham) {
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

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

}
