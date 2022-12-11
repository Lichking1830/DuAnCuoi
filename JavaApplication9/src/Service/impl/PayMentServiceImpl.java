/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;


import Repository.PayMentRepositories;
import Service.PayMentService;
import ViewModel.ViewModelPayments;
import java.util.List;

/**
 *
 * @author HieuTran
 */
public class PayMentServiceImpl implements PayMentService {

    private PayMentRepositories thongKeRepositories = new PayMentRepositories();

    @Override
    public List<ViewModelPayments> getTablePayMents(int trangThai) {
        return thongKeRepositories.getTablePayMents(trangThai);
    }

    @Override
    public List<ViewModelPayments> sortNgayTao() {
        return thongKeRepositories.sortNgayTao();
    }

    @Override
    public String updateThanhToan(String ma) {
        if (thongKeRepositories.updateThanhToan(ma)) {
            return "Thanh toán thành công";
        } else {
            return "Thanh toán thất bại";
        }
    }

    @Override
    public List<ViewModelPayments> getHDCT(String idHD) {
        return thongKeRepositories.getHDCT(idHD);
    }

}
