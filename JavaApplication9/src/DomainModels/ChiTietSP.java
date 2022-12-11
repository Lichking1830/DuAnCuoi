/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author HieuTran
 */
public class ChiTietSP {

    private String idChiTietSP;
    private SanPham sanPham;
    private NSX nsx;
    private MauSac mauSac;
    private DongSP dongSP;
    private int namBH;
    private String moTa;
    private int soLuongTon;
    private Double giaNhap;
    private Double giaBan;

    public ChiTietSP() {
    }

    public ChiTietSP(String idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public ChiTietSP(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public ChiTietSP(SanPham sanPham, int namBH, String moTa, int soLuongTon, Double giaBan) {
        this.sanPham = sanPham;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaBan = giaBan;
    }

    public ChiTietSP(String idChiTietSP, SanPham sanPham, NSX nsx, MauSac mauSac, DongSP dongSP, int namBH, String moTa, int soLuongTon, Double giaNhap, Double giaBan) {
        this.idChiTietSP = idChiTietSP;
        this.sanPham = sanPham;
        this.nsx = nsx;
        this.mauSac = mauSac;
        this.dongSP = dongSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(String idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public NSX getNsx() {
        return nsx;
    }

    public void setNsx(NSX nsx) {
        this.nsx = nsx;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public DongSP getDongSP() {
        return dongSP;
    }

    public void setDongSP(DongSP dongSP) {
        this.dongSP = dongSP;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public Double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

//    private String id;
//    private SanPham sanPham;
//    private NSX nSX;
//    private MauSac mauSac;
//    private DongSP dongSP;
//    private int namBH;
//    private String moTa;
//    private int soLuongTon;
//    private float giaNhap;
//    private float giaBan;
//    public ChiTietSP() {
//    }
//
//    public ChiTietSP(SanPham sanPham, int soLuongTon, float giaBan) {
//        this.sanPham = sanPham;
//        this.soLuongTon = soLuongTon;
//        this.giaBan = giaBan;
//    }
//    
//    public ChiTietSP(String id, SanPham sanPham, NSX nSX, MauSac mauSac, DongSP dongSP, int namBH, String moTa, int soLuongTon, float giaNhap, float giaBan) {
//        this.id = id;
//        this.sanPham = sanPham;
//        this.nSX = nSX;
//        this.mauSac = mauSac;
//        this.dongSP = dongSP;
//        this.namBH = namBH;
//        this.moTa = moTa;
//        this.soLuongTon = soLuongTon;
//        this.giaNhap = giaNhap;
//        this.giaBan = giaBan;
//    }
//
//    public ChiTietSP(SanPham sanPham, NSX nSX, MauSac mauSac, DongSP dongSP, int namBH, String moTa, int soLuongTon, float giaNhap, float giaBan) {
//        this.sanPham = sanPham;
//        this.nSX = nSX;
//        this.mauSac = mauSac;
//        this.dongSP = dongSP;
//        this.namBH = namBH;
//        this.moTa = moTa;
//        this.soLuongTon = soLuongTon;
//        this.giaNhap = giaNhap;
//        this.giaBan = giaBan;
//    }
//
//    public ChiTietSP(String id) {
//        this.id = id;
//    }
//
//    public ChiTietSP(SanPham sanPham) {
//        this.sanPham = sanPham;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public SanPham getSanPham() {
//        return sanPham;
//    }
//
//    public void setSanPham(SanPham sanPham) {
//        this.sanPham = sanPham;
//    }
//
//    public NSX getnSX() {
//        return nSX;
//    }
//
//    public void setnSX(NSX nSX) {
//        this.nSX = nSX;
//    }
//
//    public MauSac getMauSac() {
//        return mauSac;
//    }
//
//    public void setMauSac(MauSac mauSac) {
//        this.mauSac = mauSac;
//    }
//
//    public DongSP getDongSP() {
//        return dongSP;
//    }
//
//    public void setDongSP(DongSP dongSP) {
//        this.dongSP = dongSP;
//    }
//
//    public int getNamBH() {
//        return namBH;
//    }
//
//    public void setNamBH(int namBH) {
//        this.namBH = namBH;
//    }
//
//    public String getMoTa() {
//        return moTa;
//    }
//
//    public void setMoTa(String moTa) {
//        this.moTa = moTa;
//    }
//
//    public int getSoLuongTon() {
//        return soLuongTon;
//    }
//
//    public void setSoLuongTon(int soLuongTon) {
//        this.soLuongTon = soLuongTon;
//    }
//
//    public float getGiaNhap() {
//        return giaNhap;
//    }
//
//    public void setGiaNhap(float giaNhap) {
//        this.giaNhap = giaNhap;
//    }
//
//    public float getGiaBan() {
//        return giaBan;
//    }
//
//    public void setGiaBan(float giaBan) {
//        this.giaBan = giaBan;
//    }
    @Override
    public String toString() {
        return "ChiTietSP{" + "idChiTietSP=" + idChiTietSP + ", sanPham=" + sanPham + ", nsx=" + nsx + ", mauSac=" + mauSac + ", dongSP=" + dongSP + ", namBH=" + namBH + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }

}
