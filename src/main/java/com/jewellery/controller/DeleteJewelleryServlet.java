package com.jewellery.controller;

import java.io.IOException;

import com.jewellery.dao.JewelleryDAO;
import com.jewellery.daoimpl.JewelleryDAOImp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteJewelleryServlet")
public class DeleteJewelleryServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int jewelleryId = Integer.parseInt(request.getParameter("jewelleryId"));

		JewelleryDAO dao = new JewelleryDAOImp();

		boolean status = dao.deleteJewellery(jewelleryId);

		if (status) {

			response.sendRedirect("JewelleryServlet");

		} else {

			response.sendRedirect("adminDashboard.jsp");
			

		}

	}

}