package com.jewellery.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jewellery.dao.UserDAO;
import com.jewellery.dto.UserDTO;
import com.jewellery.util.DBConnection;

public class UserDAOImp implements UserDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean registerUser(UserDTO user) {

        boolean status = false;

        try {

            con = DBConnection.getConnection();

            String query = "INSERT INTO users(user_name,email,phone,password,address) VALUES(?,?,?,?,?)";

            ps = con.prepareStatement(query);

            ps.setString(1, user.getUserName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getAddress());

            int result = ps.executeUpdate();

            if (result > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    @Override
    public UserDTO loginUser(String email, String password) {

        UserDTO user = null;

        try {

            con = DBConnection.getConnection();

            String query = "SELECT * FROM users WHERE email=? AND password=?";

            ps = con.prepareStatement(query);

            ps.setString(1, email);
            ps.setString(2, password);

            rs = ps.executeQuery();

            if (rs.next()) {

                user = new UserDTO();

                user.setUserId(rs.getInt("user_id"));
                user.setUserName(rs.getString("user_name"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public boolean updateUser(UserDTO user) {

        boolean status = false;

        try {

            con = DBConnection.getConnection();

            String query = "UPDATE users SET user_name=?, email=?, phone=?, address=? WHERE user_id=?";

            ps = con.prepareStatement(query);

            ps.setString(1, user.getUserName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getAddress());
            ps.setInt(5, user.getUserId());

            int result = ps.executeUpdate();

            if (result > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    @Override
    public UserDTO getUserById(int userId) {

        UserDTO user = null;

        try {

            con = DBConnection.getConnection();

            String query = "SELECT * FROM users WHERE user_id=?";

            ps = con.prepareStatement(query);

            ps.setInt(1, userId);

            rs = ps.executeQuery();

            if (rs.next()) {

                user = new UserDTO();

                user.setUserId(rs.getInt("user_id"));
                user.setUserName(rs.getString("user_name"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

}
