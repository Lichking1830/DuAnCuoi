/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

import java.util.Date;

/**
 *
 * @author admin
 */
public class NhanVien {

    private String ID;
    private ChucVu chucVu;
    private String maNV;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String Email;
    private String tenTK;
    private String matKhau;
    private int trangThai;

    public NhanVien() {
    }

    public NhanVien(String ID, ChucVu chucVu, String maNV, String hoTen, String ngaySinh, String gioiTinh, String diaChi, String Email, String tenTK, String matKhau, int trangThai) {
        this.ID = ID;
        this.chucVu = chucVu;
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.Email = Email;
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
    }

    public NhanVien(String maNV, String hoTen) {
        this.maNV = maNV;
        this.hoTen = hoTen;
    }

    public NhanVien(String ID, String maNV, String hoTen, String ngaySinh, String gioiTinh, String diaChi, String Email, String tenTK, String matKhau, int trangThai) {
        this.ID = ID;
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.Email = Email;
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
    }

    public NhanVien(String Ten, String chucvu, String email, String gender) {
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.Email = Email;
        this.ngaySinh = ngaySinh;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ID=" + ID + ", chucVu=" + chucVu + ", maNV=" + maNV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", Email=" + Email + ", tenTK=" + tenTK + ", matKhau=" + matKhau + ", trangThai=" + trangThai + '}';
    }

    public Object[] showdata() {
        return new Object[]{hoTen, chucVu.getTenChucVu(), gioiTinh, ngaySinh, Email};
    }
}
