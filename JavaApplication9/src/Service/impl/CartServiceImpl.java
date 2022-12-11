/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repository.CartVendRepositories;
import Service.CartService;
import ViewModel.CartVendViewModel;
import java.util.List;

/**
 *
 * @author HieuTran
 */
public class CartServiceImpl implements CartService {

    private CartVendRepositories vendRepositories = new CartVendRepositories();

    @Override
    public List<CartVendViewModel> getTableCart() {
        return vendRepositories.getTableCart();
    }

}
