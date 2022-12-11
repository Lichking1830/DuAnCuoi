/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author HieuTran
 */
public class Payments {

    String t = "SELECT    dbo.HoaDon.Id, dbo.KhachHang.Ma, dbo.KhachHang.HoTen, dbo.NhanVien.Ma AS Expr1, dbo.NhanVien.HoTen AS Expr2, dbo.HoaDon.Ma AS Expr3, dbo.HoaDon.NgayTao, dbo.HoaDon.NgayThanhToan, \n"
            + "                      dbo.HoaDon.TinhTrang\n";
    private HoaDon hoaDon;
    private KhachHang khachHang;
    private NhanVien nhanVien;

    public Payments() {
    }

    public Payments(HoaDon hoaDon, KhachHang khachHang, NhanVien nhanVien) {
        this.hoaDon = hoaDon;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
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

    @Override
    public String toString() {
        return "Payments{" + "t=" + t + ", hoaDon=" + hoaDon + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + '}';
    }

}
