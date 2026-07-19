package com.jewellery.controller;

import java.io.IOException;

import com.jewellery.dao.BookingDetailsDAO;
import com.jewellery.daoimpl.BookingDetailsDAOImp;
import com.jewellery.dto.BookingDetailsDTO;
import com.jewellery.dto.UserDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		UserDTO user = (UserDTO) session.getAttribute("user");

		int jewelleryId = Integer.parseInt(request.getParameter("jewelleryId"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		double totalPrice = Double.parseDouble(request.getParameter("totalPrice"));

		BookingDetailsDTO booking = new BookingDetailsDTO();

		booking.setUserId(user.getUserId());
		booking.setJewelleryId(jewelleryId);
		booking.setQuantity(quantity);
		booking.setTotalPrice(totalPrice);

		BookingDetailsDAO dao = new BookingDetailsDAOImp();

		boolean status = dao.addBooking(booking);

		if (status) {

			response.sendRedirect("payment.jsp");

		} else {

			response.sendRedirect("cart.jsp");

		}

	}

}