package com.jewellery.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jewellery.dao.CartDAO;
import com.jewellery.dto.CartDTO;
import com.jewellery.util.DBConnection;

public class CartDAOImp implements CartDAO {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	@Override
	public boolean addToCart(CartDTO cart) {

		try {

			con = DBConnection.getConnection();

			String query = "INSERT INTO cart(user_id,jewellery_id,quantity) VALUES(?,?,?)";

			ps = con.prepareStatement(query);

			ps.setInt(1, cart.getUserId());
			ps.setInt(2, cart.getJewelleryId());
			ps.setInt(3, cart.getQuantity());

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean removeFromCart(int cartId) {

		try {

			con = DBConnection.getConnection();

			String query = "DELETE FROM cart WHERE cart_id=?";

			ps = con.prepareStatement(query);

			ps.setInt(1, cartId);

			return ps.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<CartDTO> getCartByUserId(int userId) {

		List<CartDTO> cartList = new ArrayList<>();

		try {

			con = DBConnection.getConnection();

			String query = "SELECT * FROM cart WHERE user_id=?";

			ps = con.prepareStatement(query);

			ps.setInt(1, userId);

			rs = ps.executeQuery();

			while (rs.next()) {

				CartDTO cart = new CartDTO();

				cart.setCartId(rs.getInt("cart_id"));
				cart.setUserId(rs.getInt("user_id"));
				cart.setJewelleryId(rs.getInt("jewellery_id"));
				cart.setQuantity(rs.getInt("quantity"));

				cartList.add(cart);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cartList;
	}

}