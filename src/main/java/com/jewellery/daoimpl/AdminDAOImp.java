package com.jewellery.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jewellery.dao.AdminDAO;
import com.jewellery.util.DBConnection;

public class AdminDAOImp implements AdminDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean loginAdmin(String email, String password) {

        boolean status = false;

        try {

            con = DBConnection.getConnection();

            String query = "SELECT * FROM admins WHERE email=? AND password=?";

            ps = con.prepareStatement(query);

            ps.setString(1, email);
            ps.setString(2, password);

            rs = ps.executeQuery();

            if (rs.next()) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

}
