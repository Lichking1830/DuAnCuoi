/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author admin
 */
public class HoaDonChiTiet {

    private String idHoaDonChiTiet;
    private HoaDon hoaDon;
    private ChiTietSP chiTietSP;
    private int soLuong;
    private float donGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int soLuong, float donGia) {
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public HoaDonChiTiet(HoaDon hoaDon, int soLuong, float donGia) {
        this.hoaDon = hoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public HoaDonChiTiet(HoaDon hoaDon, ChiTietSP chiTietSP, int soLuong, float donGia) {
        this.hoaDon = hoaDon;
        this.chiTietSP = chiTietSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getIdHoaDonChiTiet() {
        return idHoaDonChiTiet;
    }

    public void setIdHoaDonChiTiet(String idHoaDonChiTiet) {
        this.idHoaDonChiTiet = idHoaDonChiTiet;
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

    public HoaDon getHd() {
        return hoaDon;
    }

    public void setHd(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public ChiTietSP getCtsp() {
        return chiTietSP;
    }

    public void setCtsp(ChiTietSP chiTietSP) {
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
        return "HoaDonChiTiet{" + "hoaDon=" + hoaDon + ", chiTietSP=" + chiTietSP + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

}
