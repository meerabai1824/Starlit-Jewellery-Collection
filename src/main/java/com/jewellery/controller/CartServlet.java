package com.jewellery.controller;

import java.io.IOException;
import java.util.List;

import com.jewellery.dao.CartDAO;
import com.jewellery.daoimpl.CartDAOImp;
import com.jewellery.dto.CartDTO;
import com.jewellery.dto.UserDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		UserDTO user = (UserDTO) session.getAttribute("user");

		CartDAO dao = new CartDAOImp();

		List<CartDTO> cartList = dao.getCartByUserId(user.getUserId());

		request.setAttribute("cartList", cartList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp");

		dispatcher.forward(request, response);

	}

}