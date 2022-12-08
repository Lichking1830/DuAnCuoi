/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author HP
 */
public class SanPham {

    private String ID;
    private String maSP;
    private String tenSP;

    public SanPham() {
    }

    public SanPham(String ID, String maSP, String tenSP) {
        this.ID = ID;
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public SanPham(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    @Override
    public String toString() {
        return "SanPham{" + "ID=" + ID + ", maSP=" + maSP + ", tenSP=" + tenSP + '}';
    }

    public Object[] showdata() {
        return new Object[]{ID, maSP, tenSP};
    }
}
