/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModels.KhachHang;
import DomainModels.NhanVien;

/**
 *
 * @author admin
 */
public class ViewModelHoaDon {

    private String ID;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private String maHD;
    private String ngayTao;
    private String ngayThanhToan;
    private int tinhTrang;

    public ViewModelHoaDon() {
    }

    public ViewModelHoaDon(String ID, KhachHang khachHang, NhanVien nhanVien, String maHD, String ngayTao, String ngayThanhToan, int tinhTrang) {
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

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

}
