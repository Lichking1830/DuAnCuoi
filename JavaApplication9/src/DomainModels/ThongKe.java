/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author HieuTran
 */
public class ThongKe {

    private String idThongKe;
    private ChiTietSP chiTietSP;
    private HoaDon hoaDon;
    private Double doanhThu;
    private int soLuongBan;
    private Double tongTien;

    public ThongKe() {
    }

    public ThongKe(String idThongKe, ChiTietSP chiTietSP, HoaDon hoaDon, Double doanhThu, int soLuongBan, Double tongTien) {
        this.idThongKe = idThongKe;
        this.chiTietSP = chiTietSP;
        this.hoaDon = hoaDon;
        this.doanhThu = doanhThu;
        this.soLuongBan = soLuongBan;
        this.tongTien = tongTien;
    }

    public String getIdThongKe() {
        return idThongKe;
    }

    public void setIdThongKe(String idThongKe) {
        this.idThongKe = idThongKe;
    }

    public ChiTietSP getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(ChiTietSP chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public Double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(Double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "ThongKe{" + "idThongKe=" + idThongKe + ", chiTietSP=" + chiTietSP + ", hoaDon=" + hoaDon + ", doanhThu=" + doanhThu + ", soLuongBan=" + soLuongBan + ", tongTien=" + tongTien + '}';
    }

}
