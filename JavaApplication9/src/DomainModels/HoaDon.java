/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.util.Date;

/**
 *
 * @author admin
 */
public class HoaDon {

    private String idHoaDon;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private String maHoaDon;
    private String ngayTao;
    private String ngayThanhToan;
    private int tinhTrang;

    public HoaDon() {
    }
    
    public HoaDon(String idHoaDon, KhachHang khachHang, NhanVien nhanVien, String maHoaDon, String ngayTao, String ngayThanhToan, int tinhTrang) {
        this.idHoaDon = idHoaDon;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.maHoaDon = maHoaDon;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tinhTrang = tinhTrang;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
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

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
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

    @Override
    public String toString() {
        return "HoaDon{" + "idHoaDon=" + idHoaDon + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", maHoaDon=" + maHoaDon + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", tinhTrang=" + tinhTrang + '}';
    }

}
