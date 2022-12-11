/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

import java.awt.Point;

/**
 *
 * @author admin
 */
public class DanhMucSP {

    private String ID;
    private String maSP;
    private String tenSP;

    public DanhMucSP() {
    }

    public DanhMucSP(String ID, String maSP, String tenSP) {
        this.ID = ID;
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public DanhMucSP(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public DanhMucSP(Point locationOnScreen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public Object[] showdata() {
        return new Object[]{maSP, tenSP};
    }

}
