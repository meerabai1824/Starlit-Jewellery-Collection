package com.jewellery.dto;

public class BookingDetailsDTO {

    private int bookingDetailId;
    private int userId;
    private int jewelleryId;
    private int quantity;
    private double totalPrice;

    public BookingDetailsDTO() {

    }

    public BookingDetailsDTO(int bookingDetailId, int userId,
            int jewelleryId, int quantity, double totalPrice) {

        this.bookingDetailId = bookingDetailId;
        this.userId = userId;
        this.jewelleryId = jewelleryId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public int getBookingDetailId() {
        return bookingDetailId;
    }

    public void setBookingDetailId(int bookingDetailId) {
        this.bookingDetailId = bookingDetailId;
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "BookingDetailsDTO [bookingDetailId=" + bookingDetailId
                + ", userId=" + userId
                + ", jewelleryId=" + jewelleryId
                + ", quantity=" + quantity
                + ", totalPrice=" + totalPrice + "]";
    }
}