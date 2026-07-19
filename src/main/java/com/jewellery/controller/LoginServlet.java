package com.jewellery.controller;

import java.io.IOException;

import com.jewellery.dao.AdminDAO;
import com.jewellery.dao.UserDAO;
import com.jewellery.daoimpl.AdminDAOImp;
import com.jewellery.daoimpl.UserDAOImp;
import com.jewellery.dto.UserDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String role = request.getParameter("role");

		HttpSession session = request.getSession();

		if (role.equalsIgnoreCase("user")) {

			UserDAO userDAO = new UserDAOImp();

			UserDTO user = userDAO.loginUser(email, password);

			if (user != null) {

				session.setAttribute("user", user);

				response.sendRedirect("home.jsp");

			} else {

				response.sendRedirect("login.jsp");

			}

		} else {

			AdminDAO adminDAO = new AdminDAOImp();

			boolean status = adminDAO.loginAdmin(email, password);

			if (status) {

				session.setAttribute("admin", email);

				response.sendRedirect("adminDashboard.jsp");

			} else {

				response.sendRedirect("login.jsp");

			}

		}

	}

}
