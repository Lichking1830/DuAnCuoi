/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class KhachHang {

    private String idKhachHang;
    private String maKhachHang;
    private String tenKhachHang;
    private String ngaySinh;
    private String CCCD;
    private String diaChi;
    private boolean gioiTinh;
    private String queQuan;

    public KhachHang() {
    }

    public KhachHang(String idKhachHang, String maKhachHang, String tenKhachHang, String ngaySinh, String CCCD, String diaChi, boolean gioiTinh, String queQuan) {
        this.idKhachHang = idKhachHang;
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.ngaySinh = ngaySinh;
        this.CCCD = CCCD;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }

    public KhachHang(String maKhachHang, String tenKhachHang) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "idKhachHang=" + idKhachHang + ", maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", ngaySinh=" + ngaySinh + ", CCCD=" + CCCD + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", queQuan=" + queQuan + '}';
    }

}
