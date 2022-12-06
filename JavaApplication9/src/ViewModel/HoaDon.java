/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModel.KhachHang;

/**
 *
 * @author HP
 */
public class HoaDon {

    private String ID;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private String maHD;
    private int ngayTao;
    private int ngayThanhToan;
    private String tinhTrang;

    public HoaDon() {
    }

    public HoaDon(String ID, KhachHang khachHang, NhanVien nhanVien, String maHD, int ngayTao, int ngayThanhToan, String tinhTrang) {
        this.ID = ID;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tinhTrang = tinhTrang;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public int getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(int ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(int ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "ID=" + ID + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", maHD=" + maHD + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", tinhTrang=" + tinhTrang + '}';
    }

    public Object[] showdata() {
        return new Object[]{ID, khachHang, nhanVien, maHD, ngayTao, ngayThanhToan, tinhTrang};
    }
}
