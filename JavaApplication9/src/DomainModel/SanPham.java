/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

import ViewModel.*;
import DomainModel.DongSP;

/**
 *
 * @author admin
 */
public class SanPham {

    private String idSP;
    private DongSP lsp;
    private String maSP;
    private String tenSP;

    public SanPham() {
    }

    public SanPham(String idSP, DongSP lsp, String maSP, String tenSP) {
        this.idSP = idSP;
        this.lsp = lsp;
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public SanPham(DongSP lsp, String maSP, String tenSP) {
        this.lsp = lsp;
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public SanPham(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public DongSP getLsp() {
        return lsp;
    }

    public void setLsp(DongSP lsp) {
        this.lsp = lsp;
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

    public Object[] toDataRow() {
        return new Object[]{idSP, lsp.getTenDSP(), maSP, tenSP};
    }

}
