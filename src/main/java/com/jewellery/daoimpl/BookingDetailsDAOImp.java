package com.jewellery.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jewellery.dao.BookingDetailsDAO;
import com.jewellery.dto.BookingDetailsDTO;
import com.jewellery.util.DBConnection;

public class BookingDetailsDAOImp implements BookingDetailsDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean addBooking(BookingDetailsDTO booking) {

        try {

            con = DBConnection.getConnection();

            String query = "INSERT INTO booking_details(user_id,jewellery_id,quantity,total_price) VALUES(?,?,?,?)";

            ps = con.prepareStatement(query);

            ps.setInt(1, booking.getUserId());
            ps.setInt(2, booking.getJewelleryId());
            ps.setInt(3, booking.getQuantity());
            ps.setDouble(4, booking.getTotalPrice());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public BookingDetailsDTO getBookingById(int bookingDetailId) {

        BookingDetailsDTO booking = null;

        try {

            con = DBConnection.getConnection();

            String query = "SELECT * FROM booking_details WHERE booking_detail_id=?";

            ps = con.prepareStatement(query);

            ps.setInt(1, bookingDetailId);

            rs = ps.executeQuery();

            if (rs.next()) {

                booking = new BookingDetailsDTO();

                booking.setBookingDetailId(rs.getInt("booking_detail_id"));
                booking.setUserId(rs.getInt("user_id"));
                booking.setJewelleryId(rs.getInt("jewellery_id"));
                booking.setQuantity(rs.getInt("quantity"));
                booking.setTotalPrice(rs.getDouble("total_price"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return booking;
    }

    @Override
    public List<BookingDetailsDTO> getBookingHistory(int userId) {

        List<BookingDetailsDTO> list = new ArrayList<>();

        try {

            con = DBConnection.getConnection();

            String query = "SELECT * FROM booking_details WHERE user_id=?";

            ps = con.prepareStatement(query);

            ps.setInt(1, userId);

            rs = ps.executeQuery();

            while (rs.next()) {

                BookingDetailsDTO booking = new BookingDetailsDTO();

                booking.setBookingDetailId(rs.getInt("booking_detail_id"));
                booking.setUserId(rs.getInt("user_id"));
                booking.setJewelleryId(rs.getInt("jewellery_id"));
                booking.setQuantity(rs.getInt("quantity"));
                booking.setTotalPrice(rs.getDouble("total_price"));

                list.add(booking);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}
