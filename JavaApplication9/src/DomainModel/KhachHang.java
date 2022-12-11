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
   
    public KhachHang() {
    }

    public KhachHang(String ID, String maKhachHang, String hoVaTen) {
        this.ID = ID;
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

    public KhachHang(String maKhachHang, String hoVaTen) {
        this.maKhachHang = maKhachHang;
        this.hoVaTen = hoVaTen;
    }

    
}
