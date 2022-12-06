/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author HP
 */
public class ThongKe {

    private String ID;
    private ChiTietSanPham ctsp;
    private HoaDon hoaDon;
    private String doanhThu;
    private int soLuongHoaDon;
    private String trangThai;

    public ThongKe() {
    }

    public ThongKe(String ID, ChiTietSanPham ctsp, HoaDon hoaDon, String doanhThu, int soLuongHoaDon, String trangThai) {
        this.ID = ID;
        this.ctsp = ctsp;
        this.hoaDon = hoaDon;
        this.doanhThu = doanhThu;
        this.soLuongHoaDon = soLuongHoaDon;
        this.trangThai = trangThai;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ChiTietSanPham getCtsp() {
        return ctsp;
    }

    public void setCtsp(ChiTietSanPham ctsp) {
        this.ctsp = ctsp;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public String getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(String doanhThu) {
        this.doanhThu = doanhThu;
    }

    public int getSoLuongHoaDon() {
        return soLuongHoaDon;
    }

    public void setSoLuongHoaDon(int soLuongHoaDon) {
        this.soLuongHoaDon = soLuongHoaDon;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "ThongKe{" + "ID=" + ID + ", ctsp=" + ctsp + ", hoaDon=" + hoaDon + ", doanhThu=" + doanhThu + ", soLuongHoaDon=" + soLuongHoaDon + ", trangThai=" + trangThai + '}';
    }

    public Object[] showdata() {
        return new Object[]{ID, ctsp, hoaDon, doanhThu, soLuongHoaDon, trangThai};
    }
}
