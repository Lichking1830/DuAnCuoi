/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author HieuTran
 */
public class ChiTietLuong {

    private String idChiTietLuong;
    private NhanVien nhanVien;
    private int soGioLam;
    private float luongCoBan;
    private float luongThucTe;

    public ChiTietLuong() {
    }

    public ChiTietLuong(String idChiTietLuong, NhanVien nhanVien, int soGioLam, float luongCoBan, float luongThucTe) {
        this.idChiTietLuong = idChiTietLuong;
        this.nhanVien = nhanVien;
        this.soGioLam = soGioLam;
        this.luongCoBan = luongCoBan;
        this.luongThucTe = luongThucTe;
    }

    public String getIdChiTietLuong() {
        return idChiTietLuong;
    }

    public void setIdChiTietLuong(String idChiTietLuong) {
        this.idChiTietLuong = idChiTietLuong;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public float getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(float luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public float getLuongThucTe() {
        return luongThucTe;
    }

    public void setLuongThucTe(float luongThucTe) {
        this.luongThucTe = luongThucTe;
    }

    @Override
    public String toString() {
        return "ChiTietLuong{" + "idChiTietLuong=" + idChiTietLuong + ", nhanVien=" + nhanVien + ", soGioLam=" + soGioLam + ", luongCoBan=" + luongCoBan + ", luongThucTe=" + luongThucTe + '}';
    }

}
