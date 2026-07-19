package com.jewellery.dto;

public class CartDTO {

    private int cartId;
    private int userId;
    private int jewelleryId;
    private int quantity;

    public CartDTO() {

    }

    public CartDTO(int cartId, int userId, int jewelleryId, int quantity) {
        this.cartId = cartId;
        this.userId = userId;
        this.jewelleryId = jewelleryId;
        this.quantity = quantity;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getJewelleryId() {
        return jewelleryId;
    }

    public void setJewelleryId(int jewelleryId) {
        this.jewelleryId = jewelleryId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartDTO [cartId=" + cartId + ", userId=" + userId
                + ", jewelleryId=" + jewelleryId + ", quantity=" + quantity + "]";
    }
}