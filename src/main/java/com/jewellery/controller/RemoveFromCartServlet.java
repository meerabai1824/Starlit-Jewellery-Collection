package com.jewellery.controller;

import java.io.IOException;

import com.jewellery.dao.CartDAO;
import com.jewellery.daoimpl.CartDAOImp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RemoveFromCartServlet")
public class RemoveFromCartServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int cartId = Integer.parseInt(request.getParameter("cartId"));

		CartDAO dao = new CartDAOImp();

		boolean status = dao.removeFromCart(cartId);

		if (status) {

			response.sendRedirect("CartServlet");

		} else {

			response.sendRedirect("cart.jsp");

		}

	}

}