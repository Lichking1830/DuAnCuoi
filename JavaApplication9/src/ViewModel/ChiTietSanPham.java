/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModel.DongSP;
import DomainModel.MauSac;
import DomainModel.NSX;
import DomainModel.SanPham;

/**
 *
 * @author HP
 */
public class ChiTietSanPham {

    private String ID;
    private SanPham sanPham;
    private NSX nsx;
    private MauSac mauSac;
    private DongSP dongSanPham;
    private int namBH;
    private String moTa;
    private int soLuongTon;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String ID, SanPham sanPham, NSX nsx, MauSac mauSac, DongSP dongSanPham, int namBH, String moTa, int soLuongTon) {
        this.ID = ID;
        this.sanPham = sanPham;
        this.nsx = nsx;
        this.mauSac = mauSac;
        this.dongSanPham = dongSanPham;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    @Override
    public String toString() {
        return "Chi_Tiet_San_Pham{" + "ID=" + ID + ", sanPham=" + sanPham + ", nsx=" + nsx + ", mauSac=" + mauSac + ", dongSanPham=" + dongSanPham + ", namBH=" + namBH + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + '}';
    }

    public Object showdata() {
        return new Object[]{ID, sanPham, nsx, mauSac, dongSanPham, namBH, moTa, soLuongTon};
    }
}
