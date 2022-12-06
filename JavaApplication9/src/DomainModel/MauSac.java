/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author ADMIN
 */
public class MauSac {

    private String ID;
    private String maMS;
    private String tenMS;

    public MauSac() {
    }

    public MauSac(String ID, String maMS, String tenMS) {
        this.ID = ID;
        this.maMS = maMS;
        this.tenMS = tenMS;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaMS() {
        return maMS;
    }

    public void setMaMS(String maMS) {
        this.maMS = maMS;
    }

    public String getTenMS() {
        return tenMS;
    }

    public void setTenMS(String tenMS) {
        this.tenMS = tenMS;
    }

    @Override
    public String toString() {
        return "Mau_Sac{" + "ID=" + ID + ", maMS=" + maMS + ", tenMS=" + tenMS + '}';
    }

    public Object[] showdata() {
        return new Object[]{ID, maMS, tenMS};
    }
}
