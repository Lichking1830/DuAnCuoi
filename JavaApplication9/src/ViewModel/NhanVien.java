/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModel.ChucVu;

/**
 *
 * @author HP
 */
public class NhanVien {

    private String ID;
    private ChucVu chucVu;
    private String maNV;
    private String hoTen;
    private int ngaySinh;
    private boolean gioiTinh;
    private String diaChi;
    private int SDT;
    private String tenTK;
    private String matKhau;
    private String trangThai;

    public NhanVien() {
    }

    public NhanVien(String ID, ChucVu chucVu, String maNV, String hoTen, int ngaySinh, boolean gioiTinh, String diaChi, int SDT, String tenTK, String matKhau, String trangThai) {
        this.ID = ID;
        this.chucVu = chucVu;
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Nhan_Vien{" + "ID=" + ID + ", chucVu=" + chucVu + ", maNV=" + maNV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", SDT=" + SDT + ", tenTK=" + tenTK + ", matKhau=" + matKhau + ", trangThai=" + trangThai + '}';
    }

    public Object[] showdata() {
        return new Object[]{ID, chucVu, maNV, hoTen, ngaySinh, gioiTinh, diaChi, SDT, tenTK, matKhau, trangThai};
    }
}
