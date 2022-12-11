/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import DomainModel.DongSP;

/**
 *
 * @author admin
 */
public class ViewModelSanPham {

    private String idSP;
    private DongSP lsp;
    private String maSP;
    private String tenSP;

    public ViewModelSanPham() {
    }

    public ViewModelSanPham(String idSP, DongSP lsp, String maSP, String tenSP) {
        this.idSP = idSP;
        this.lsp = lsp;
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

    

}
