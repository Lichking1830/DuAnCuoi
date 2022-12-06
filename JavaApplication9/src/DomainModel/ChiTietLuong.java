/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

import ViewModel.NhanVien;

/**
 *
 * @author HP
 */
public class ChiTietLuong {

    private String ID;
    private NhanVien nhanVien;
    private ChucVu chucVu;
    private int soGioLam;
    private int luongCB;

    public ChiTietLuong() {
    }

    public ChiTietLuong(String ID, NhanVien nhanVien, ChucVu chucVu, int soGioLam, int luongCB) {
        this.ID = ID;
        this.nhanVien = nhanVien;
        this.chucVu = chucVu;
        this.soGioLam = soGioLam;
        this.luongCB = luongCB;
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

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    @Override
    public String toString() {
        return "ChiTietLuong{" + "ID=" + ID + ", nhanVien=" + nhanVien + ", chucVu=" + chucVu + ", soGioLam=" + soGioLam + ", luongCB=" + luongCB + '}';
    }

}
