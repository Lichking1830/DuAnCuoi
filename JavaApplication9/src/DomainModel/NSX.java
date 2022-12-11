/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author HP
 */
public class NSX {

    private String ID;
    private String maNSX;
    private String tenNSX;

    public NSX() {
    }

    public NSX(String ID, String maNSX, String tenNSX) {
        this.ID = ID;
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
    }

    public NSX(String maNSX, String tenNSX) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    @Override
    public String toString() {
        return "NSX{" + "ID=" + ID + ", maNSX=" + maNSX + ", tenNSX=" + tenNSX + '}';
    }

    public Object[] showdata() {
        return new Object[]{ID, maNSX, tenNSX};
    }
}
