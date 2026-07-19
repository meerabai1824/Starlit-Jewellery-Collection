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
import jakarta.servlet.http.HttpSession;

@WebServlet("/UserProfileServlet")
public class UserProfileServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		UserDTO user = (UserDTO) session.getAttribute("user");

		user.setUserName(request.getParameter("userName"));
		user.setEmail(request.getParameter("email"));
		user.setPhone(request.getParameter("phone"));
		user.setAddress(request.getParameter("address"));

		UserDAO dao = new UserDAOImp();

		boolean status = dao.updateUser(user);

		if (status) {

			session.setAttribute("user", user);

			response.sendRedirect("profile.jsp");

		} else {

			response.sendRedirect("profile.jsp");

		}

	}

}