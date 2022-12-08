/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author HP
 */
public class KhachHang {

    private String ID;
    private String maKhachHang;
    private String hoVaTen;
    private String ngaySinh;
    private String CCCD;
    private String diaChi;
    private String gioiTinh;
    private String queQuan;

    public KhachHang() {
    }

    public KhachHang(String ID, String maKhachHang, String hoVaTen,  String ngaySinh, String CCCD, String diaChi, String gioiTinh, String queQuan) {
        this.ID = ID;
        this.maKhachHang = maKhachHang;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.CCCD = CCCD;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }

    public KhachHang(String maKhachHang, String hoVaTen) {
        this.maKhachHang = maKhachHang;
        this.hoVaTen = hoVaTen;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public  String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh( String ngaySinh) {
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

}
