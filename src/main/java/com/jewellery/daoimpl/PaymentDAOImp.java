package com.jewellery.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jewellery.dao.PaymentDAO;
import com.jewellery.dto.PaymentDTO;
import com.jewellery.util.DBConnection;

public class PaymentDAOImp implements PaymentDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean makePayment(PaymentDTO payment) {

        try {

            con = DBConnection.getConnection();

            String query = "INSERT INTO payments(booking_detail_id,payment_method,amount,payment_status) VALUES(?,?,?,?)";

            ps = con.prepareStatement(query);

            ps.setInt(1, payment.getBookingDetailId());
            ps.setString(2, payment.getPaymentMethod());
            ps.setDouble(3, payment.getAmount());
            ps.setString(4, payment.getPaymentStatus());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public PaymentDTO getPaymentByBookingId(int bookingDetailId) {

        PaymentDTO payment = null;

        try {

            con = DBConnection.getConnection();

            String query = "SELECT * FROM payments WHERE booking_detail_id=?";

            ps = con.prepareStatement(query);

            ps.setInt(1, bookingDetailId);

            rs = ps.executeQuery();

            if (rs.next()) {

                payment = new PaymentDTO();

                payment.setPaymentId(rs.getInt("payment_id"));
                payment.setBookingDetailId(rs.getInt("booking_detail_id"));
                payment.setPaymentMethod(rs.getString("payment_method"));
                payment.setAmount(rs.getDouble("amount"));
                payment.setPaymentStatus(rs.getString("payment_status"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return payment;
    }

}
