/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author HP
 */
public class GioHang {

    private String ID;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private String maGH;
    private String ngayTao;
    private String ngayThanhToan;
    private String tenNguoiNhan;
    private String diaChi;
    private String SDT;
    private int tinhTrang;

    public GioHang() {
    }

    public GioHang(String ID, KhachHang khachHang, NhanVien nhanVien, String maGH, String ngayTao, String ngayThanhToan, String tenNguoiNhan, String diaChi, String SDT, int tinhTrang) {
        this.ID = ID;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.maGH = maGH;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.SDT = SDT;
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

    public String getMaGH() {
        return maGH;
    }

    public void setMaGH(String maGH) {
        this.maGH = maGH;
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

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "GioHang{" + "ID=" + ID + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", maGH=" + maGH + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", tenNguoiNhan=" + tenNguoiNhan + ", diaChi=" + diaChi + ", SDT=" + SDT + ", tinhTrang=" + tinhTrang + '}';
    }

}
