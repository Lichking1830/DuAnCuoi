/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModel.ChucVu;
import DomainModel.NhanVien;

/**
 *
 * @author admin
 */
public class ViewModelChiTietLuong {

    private String IdLuong;
    private NhanVien nv;
    private float soGioLam;
    private float luongCoBan;
    private float luongTinhTheoGio;
    private float luongLamViec;
    private float luongThucTe;

    public ViewModelChiTietLuong() {
    }

    public ViewModelChiTietLuong(String IdLuong, NhanVien nv, float soGioLam, float luongCoBan, float luongTinhTheoGio, float luongLamViec, float luongThucTe) {
        this.IdLuong = IdLuong;
        this.nv = nv;
        this.soGioLam = soGioLam;
        this.luongCoBan = luongCoBan;
        this.luongTinhTheoGio = luongTinhTheoGio;
        this.luongLamViec = luongLamViec;
        this.luongThucTe = luongThucTe;
    }

    public String getIdLuong() {
        return IdLuong;
    }

    public void setIdLuong(String IdLuong) {
        this.IdLuong = IdLuong;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
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

    public float getLuongLamViec() {
        return luongLamViec;
    }

    public void setLuongLamViec(float luongLamViec) {
        this.luongLamViec = luongLamViec;
    }

    public float getLuongThucTe() {
        return luongThucTe;
    }

    public void setLuongThucTe(float luongThucTe) {
        this.luongThucTe = luongThucTe;
    }

    
}
