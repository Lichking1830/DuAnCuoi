/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.ProductVendViewModels;
import java.util.List;

/**
 *
 * @author HieuTran
 */
public interface ProductVendService {

    List<ProductVendViewModels> getTableProducts();

    List<ProductVendViewModels> getSearch(String ma);
}
