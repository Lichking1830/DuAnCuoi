/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author HieuTran
 */
public class NhanVien {

    private String idNhanVien;
    private ChucVu chucVu;
    private String maNhanVien;
    private String hoTenNhanVien;
    private String ngaySinh;
    private boolean gioiTinh;
    private String diaChi;
    private String soDienThoai;
    private String tenTaiKhoan;
    private String matKhau;
    private int trangThai;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoTenNhanVien) {
        this.maNhanVien = maNhanVien;
        this.hoTenNhanVien = hoTenNhanVien;
    }

    public NhanVien(String idNhanVien, ChucVu chucVu, String maNhanVien, String hoTenNhanVien, String ngaySinh, boolean gioiTinh, String diaChi, String soDienThoai, String tenTaiKhoan, String matKhau, int trangThai) {
        this.idNhanVien = idNhanVien;
        this.chucVu = chucVu;
        this.maNhanVien = maNhanVien;
        this.hoTenNhanVien = hoTenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
    }

    public NhanVien(String idNhanVien, String maNhanVien, String hoTenNhanVien, String ngaySinh, boolean gioiTinh, String diaChi, String soDienThoai, String tenTaiKhoan, String matKhau, int trangThai) {
        this.idNhanVien = idNhanVien;
        this.maNhanVien = maNhanVien;
        this.hoTenNhanVien = hoTenNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTenNhanVien() {
        return hoTenNhanVien;
    }

    public void setHoTenNhanVien(String hoTenNhanVien) {
        this.hoTenNhanVien = hoTenNhanVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
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

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
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
        return "NhanVien{" + "idNhanVien=" + idNhanVien + ", chucVu=" + chucVu + ", maNhanVien=" + maNhanVien + ", hoTenNhanVien=" + hoTenNhanVien + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + ", trangThai=" + trangThai + '}';
    }

}
