package com.jewellery.controller;

import java.io.IOException;

import com.jewellery.dao.PaymentDAO;
import com.jewellery.daoimpl.PaymentDAOImp;
import com.jewellery.dto.PaymentDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int bookingDetailId = Integer.parseInt(request.getParameter("bookingDetailId"));

		String paymentMethod = request.getParameter("paymentMethod");

		double amount = Double.parseDouble(request.getParameter("amount"));

		PaymentDTO payment = new PaymentDTO();

		payment.setBookingDetailId(bookingDetailId);
		payment.setPaymentMethod(paymentMethod);
		payment.setAmount(amount);
		payment.setPaymentStatus("SUCCESS");

		PaymentDAO dao = new PaymentDAOImp();

		boolean status = dao.makePayment(payment);

		if (status) {

			response.sendRedirect("bookingHistory.jsp");

		} else {

			response.sendRedirect("payment.jsp");

		}

	}

}