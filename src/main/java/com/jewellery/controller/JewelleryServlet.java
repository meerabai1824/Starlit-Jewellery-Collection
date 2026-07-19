package com.jewellery.controller;

import java.io.IOException;
import java.util.List;

import com.jewellery.dao.JewelleryDAO;
import com.jewellery.daoimpl.JewelleryDAOImp;
import com.jewellery.dto.JewelleryDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/JewelleryServlet")
public class JewelleryServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		JewelleryDAO dao = new JewelleryDAOImp();

		List<JewelleryDTO> jewelleryList = dao.getAllJewellery();

		request.setAttribute("jewelleryList", jewelleryList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("jewellery.jsp");

		dispatcher.forward(request, response);

	}

}