package com.jewellery.controller;

import java.io.IOException;

import com.jewellery.dao.JewelleryDAO;
import com.jewellery.daoimpl.JewelleryDAOImp;
import com.jewellery.dto.JewelleryDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UpdateJewelleryServlet")
public class UpdateJewelleryServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int jewelleryId = Integer.parseInt(request.getParameter("jewelleryId"));
		String jewelleryName = request.getParameter("jewelleryName");
		double price = Double.parseDouble(request.getParameter("price"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		String material = request.getParameter("material");
		String imageUrl = request.getParameter("imageUrl");
		int stockQuantity = Integer.parseInt(request.getParameter("stockQuantity"));

		JewelleryDTO jewellery = new JewelleryDTO();

		jewellery.setJewelleryId(jewelleryId);
		jewellery.setJewelleryName(jewelleryName);
		jewellery.setPrice(price);
		jewellery.setWeight(weight);
		jewellery.setMaterial(material);
		jewellery.setImageUrl(imageUrl);
		jewellery.setStockQuantity(stockQuantity);

		JewelleryDAO dao = new JewelleryDAOImp();

		boolean status = dao.updateJewellery(jewellery);

		if (status) {

			response.sendRedirect("JewelleryServlet");

		} else {

			response.sendRedirect("adminDashboard.jsp");

		}

	}

}
