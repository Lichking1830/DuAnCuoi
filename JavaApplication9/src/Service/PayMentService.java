/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.ViewModelPayments;
import java.util.List;

/**
 *
 * @author HieuTran
 */
public interface PayMentService {

    List<ViewModelPayments> getTablePayMents(int trangThai);

    List<ViewModelPayments> sortNgayTao();

    String updateThanhToan(String ma);

    List<ViewModelPayments> getHDCT(String idHD);
}
