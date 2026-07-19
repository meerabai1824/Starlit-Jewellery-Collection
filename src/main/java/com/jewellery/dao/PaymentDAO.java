package com.jewellery.dao;

import com.jewellery.dto.PaymentDTO;

public interface PaymentDAO {

    boolean makePayment(PaymentDTO payment);

    PaymentDTO getPaymentByBookingId(int bookingDetailId);

}