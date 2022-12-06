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
    private int ngaySinh;
    private String CCCD;
    private String diaChi;
    private boolean gioiTinh;
    private String queQuan;

    public KhachHang() {
    }

    public KhachHang(String ID, String maKhachHang, String hoVaTen, int ngaySinh, String CCCD, String diaChi, boolean gioiTinh, String queQuan) {
        this.ID = ID;
        this.maKhachHang = maKhachHang;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.CCCD = CCCD;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
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

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
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
        return "Khach_Hang{" + "ID=" + ID + ", maKhachHang=" + maKhachHang + ", hoVaTen=" + hoVaTen + ", ngaySinh=" + ngaySinh + ", CCCD=" + CCCD + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", queQuan=" + queQuan + '}';
    }

    public Object[] showdata() {
        return new Object[]{ID, maKhachHang, hoVaTen, ngaySinh, CCCD, diaChi, gioiTinh, queQuan};
    }
}
