/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author HP
 */
public class ChucVu {

    private String ID;
    private String maChucVu;
    private String tenChucVu;

    public ChucVu() {
    }

    public ChucVu(String ID, String maChucVu, String tenChucVu) {
        this.ID = ID;
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
    }

    public ChucVu(String maChucVu, String tenChucVu) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    @Override
    public String toString() {
        return "ChucVu{" + "ID=" + ID + ", maChucVu=" + maChucVu + ", tenChucVu=" + tenChucVu + '}';
    }

}
