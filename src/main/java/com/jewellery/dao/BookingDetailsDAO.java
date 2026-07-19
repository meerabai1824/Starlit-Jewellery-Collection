package com.jewellery.dao;

import java.util.List;

import com.jewellery.dto.BookingDetailsDTO;

public interface BookingDetailsDAO {

    boolean addBooking(BookingDetailsDTO booking);

    BookingDetailsDTO getBookingById(int bookingDetailId);

    List<BookingDetailsDTO> getBookingHistory(int userId);

}