/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModel.NhanVien;

/**
 *
 * @author admin
 */
public class ViewModelChiTietLuong {

    private String ID;
    private NhanVien nhanVien;
    private float soGioLam;
    private float luongCoBan;
    private float luongTinhTheoGio;

    public ViewModelChiTietLuong() {
    }

    public ViewModelChiTietLuong(String ID, NhanVien nhanVien, float soGioLam, float luongCoBan, float luongTinhTheoGio) {
        this.ID = ID;
        this.nhanVien = nhanVien;
        this.soGioLam = soGioLam;
        this.luongCoBan = luongCoBan;
        this.luongTinhTheoGio = luongTinhTheoGio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public float getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(float soGioLam) {
        this.soGioLam = soGioLam;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public float getLuongTinhTheoGio() {
        return luongTinhTheoGio;
    }

    public void setLuongTinhTheoGio(float luongTinhTheoGio) {
        this.luongTinhTheoGio = luongTinhTheoGio;
    }

}
