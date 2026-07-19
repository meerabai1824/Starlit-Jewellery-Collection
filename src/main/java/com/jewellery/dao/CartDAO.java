package com.jewellery.dao;

import java.util.List;

import com.jewellery.dto.CartDTO;

public interface CartDAO {

    boolean addToCart(CartDTO cart);

    boolean removeFromCart(int cartId);

    boolean updateCartQuantity(int cartId, int quantity);

    List<CartDTO> getCartByUserId(int userId);

}