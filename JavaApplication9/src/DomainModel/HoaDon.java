/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author admin
 */
public class HoaDon {

    private String ID;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private String maHD;
    private int ngayTao;
    private int ngayThanhToan;
    private int tinhTrang;

    public HoaDon() {
    }

    public HoaDon(String ID, KhachHang khachHang, NhanVien nhanVien, String maHD, int ngayTao, int ngayThanhToan, int tinhTrang) {
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

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

}
