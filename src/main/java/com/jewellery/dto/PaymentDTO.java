package com.jewellery.dto;

public class PaymentDTO {

    private int paymentId;
    private int bookingDetailId;
    private String paymentMethod;
    private double amount;
    private String paymentStatus;

    public PaymentDTO() {

    }

    public PaymentDTO(int paymentId, int bookingDetailId,
            String paymentMethod, double amount,
            String paymentStatus) {

        this.paymentId = paymentId;
        this.bookingDetailId = bookingDetailId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getBookingDetailId() {
        return bookingDetailId;
    }

    public void setBookingDetailId(int bookingDetailId) {
        this.bookingDetailId = bookingDetailId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "PaymentDTO [paymentId=" + paymentId
                + ", bookingDetailId=" + bookingDetailId
                + ", paymentMethod=" + paymentMethod
                + ", amount=" + amount
                + ", paymentStatus=" + paymentStatus + "]";
    }
}