/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author HieuTran
 */
public class Revenue {

    private String id;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private String maHD;
    private String ngayTao;
    private String ngayThanhToan;
    private String ngayShip;
    private String ngayNhan;
    private int trangThai;
    private String tenNguoiNhan;
    private String diaChi;
    private String sdt;
    private HoaDonChiTiet hoaDonChiTiet;
    private HoaDon hoaDon;
    private ChiTietSP chiTietSP;
    private int soLuong;
    private float donGia;

    public Revenue() {
    }

    public Revenue(NhanVien nhanVien, String maHD, String ngayTao, int trangThai, HoaDonChiTiet hoaDonChiTiet) {
        this.nhanVien = nhanVien;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.hoaDonChiTiet = hoaDonChiTiet;
    }

    public Revenue(KhachHang khachHang, NhanVien nhanVien, String maHD, String ngayTao, String ngayThanhToan, String ngayShip, String ngayNhan, int trangThai, String tenNguoiNhan, String diaChi, String sdt) {
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.trangThai = trangThai;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public Revenue(String id, KhachHang khachHang, NhanVien nhanVien, String maHD, String ngayTao, String ngayThanhToan, String ngayShip, String ngayNhan, int trangThai, String tenNguoiNhan, String diaChi, String sdt, HoaDonChiTiet hoaDonChiTiet) {
        this.id = id;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.trangThai = trangThai;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.hoaDonChiTiet = hoaDonChiTiet;
    }

    public Revenue(String id, KhachHang khachHang, NhanVien nhanVien, String maHD, String ngayTao, String ngayThanhToan, String ngayShip, String ngayNhan, int trangThai, String tenNguoiNhan, String diaChi, String sdt) {
        this.id = id;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.trangThai = trangThai;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public Revenue(HoaDon hoaDon, ChiTietSP chiTietSP, int soLuong, float donGia) {
        this.hoaDon = hoaDon;
        this.chiTietSP = chiTietSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public Revenue(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(String ngayShip) {
        this.ngayShip = ngayShip;
    }

    public String getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(String ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public HoaDonChiTiet getHoaDonChiTiet() {
        return hoaDonChiTiet;
    }

    public void setHoaDonChiTiet(HoaDonChiTiet hoaDonChiTiet) {
        this.hoaDonChiTiet = hoaDonChiTiet;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public ChiTietSP getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(ChiTietSP chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Revenue{" + "id=" + id + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", maHD=" + maHD + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", ngayShip=" + ngayShip + ", ngayNhan=" + ngayNhan + ", trangThai=" + trangThai + ", tenNguoiNhan=" + tenNguoiNhan + ", diaChi=" + diaChi + ", sdt=" + sdt + ", hoaDonChiTiet=" + hoaDonChiTiet + ", hoaDon=" + hoaDon + ", chiTietSP=" + chiTietSP + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
}
