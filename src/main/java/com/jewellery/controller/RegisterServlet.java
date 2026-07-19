package com.jewellery.controller;

import java.io.IOException;

import com.jewellery.dao.UserDAO;
import com.jewellery.daoimpl.UserDAOImp;
import com.jewellery.dto.UserDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Read form data
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String address = request.getParameter("address");

		// Create DTO object
		UserDTO user = new UserDTO();
		user.setUserName(userName);
		user.setEmail(email);
		user.setPhone(phone);
		user.setPassword(password);
		user.setAddress(address);

		// Call DAO
		UserDAO dao = new UserDAOImp();

		boolean status = dao.registerUser(user);

		// Redirect
		if (status) {

			response.sendRedirect("login.jsp");

		} else {

			response.sendRedirect("register.jsp");

		}

	}

}