/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author HP
 */
public class DongSP {

    private String ID;
    private String maDSP;
    private String tenDSP;

    public DongSP() {
    }

    public DongSP(String ID, String maDSP, String tenDSP) {
        this.ID = ID;
        this.maDSP = maDSP;
        this.tenDSP = tenDSP;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaDSP() {
        return maDSP;
    }

    public void setMaDSP(String maDSP) {
        this.maDSP = maDSP;
    }

    public String getTenDSP() {
        return tenDSP;
    }

    public void setTenDSP(String tenDSP) {
        this.tenDSP = tenDSP;
    }

    @Override
    public String toString() {
        return "Dong_SP{" + "ID=" + ID + ", maDSP=" + maDSP + ", tenDSP=" + tenDSP + '}';
    }

    public Object[] showdata() {
        return new Object[]{ID, maDSP, tenDSP};
    }
}
