/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author HP
 */
public class GioHangChiTiet {

    private GioHang gioHang;
    private ChiTietSP ctsp;
    private int soLuong;
    private int donGia;

    public GioHangChiTiet() {
    }

    public GioHangChiTiet(GioHang gioHang, ChiTietSP ctsp, int soLuong, int donGia) {
        this.gioHang = gioHang;
        this.ctsp = ctsp;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public GioHang getGioHang() {
        return gioHang;
    }

    public void setGioHang(GioHang gioHang) {
        this.gioHang = gioHang;
    }

    public ChiTietSP getCtsp() {
        return ctsp;
    }

    public void setCtsp(ChiTietSP ctsp) {
        this.ctsp = ctsp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

}
