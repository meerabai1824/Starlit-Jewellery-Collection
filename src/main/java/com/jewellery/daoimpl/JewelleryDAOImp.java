package com.jewellery.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jewellery.dao.JewelleryDAO;
import com.jewellery.dto.JewelleryDTO;
import com.jewellery.util.DBConnection;

public class JewelleryDAOImp implements JewelleryDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean addJewellery(JewelleryDTO jewellery) {

        try {

            con = DBConnection.getConnection();

            String query = "INSERT INTO jewellery(jewellery_name,price,weight,material,image_url,stock_quantity) VALUES(?,?,?,?,?,?)";

            ps = con.prepareStatement(query);

            ps.setString(1, jewellery.getJewelleryName());
            ps.setDouble(2, jewellery.getPrice());
            ps.setDouble(3, jewellery.getWeight());
            ps.setString(4, jewellery.getMaterial());
            ps.setString(5, jewellery.getImageUrl());
            ps.setInt(6, jewellery.getStockQuantity());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean updateJewellery(JewelleryDTO jewellery) {

        try {

            con = DBConnection.getConnection();

            String query = "UPDATE jewellery SET jewellery_name=?,price=?,weight=?,material=?,image_url=?,stock_quantity=? WHERE jewellery_id=?";

            ps = con.prepareStatement(query);

            ps.setString(1, jewellery.getJewelleryName());
            ps.setDouble(2, jewellery.getPrice());
            ps.setDouble(3, jewellery.getWeight());
            ps.setString(4, jewellery.getMaterial());
            ps.setString(5, jewellery.getImageUrl());
            ps.setInt(6, jewellery.getStockQuantity());
            ps.setInt(7, jewellery.getJewelleryId());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean deleteJewellery(int jewelleryId) {

        try {

            con = DBConnection.getConnection();

            String query = "DELETE FROM jewellery WHERE jewellery_id=?";

            ps = con.prepareStatement(query);

            ps.setInt(1, jewelleryId);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public JewelleryDTO getJewelleryById(int jewelleryId) {

        JewelleryDTO jewellery = null;

        try {

            con = DBConnection.getConnection();

            String query = "SELECT * FROM jewellery WHERE jewellery_id=?";

            ps = con.prepareStatement(query);

            ps.setInt(1, jewelleryId);

            rs = ps.executeQuery();

            if (rs.next()) {

                jewellery = new JewelleryDTO();

                jewellery.setJewelleryId(rs.getInt("jewellery_id"));
                jewellery.setJewelleryName(rs.getString("jewellery_name"));
                jewellery.setPrice(rs.getDouble("price"));
                jewellery.setWeight(rs.getDouble("weight"));
                jewellery.setMaterial(rs.getString("material"));
                jewellery.setImageUrl(rs.getString("image_url"));
                jewellery.setStockQuantity(rs.getInt("stock_quantity"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jewellery;
    }

    @Override
    public List<JewelleryDTO> getAllJewellery() {

        List<JewelleryDTO> list = new ArrayList<>();

        try {

            con = DBConnection.getConnection();

            String query = "SELECT * FROM jewellery";

            ps = con.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()) {

                JewelleryDTO jewellery = new JewelleryDTO();

                jewellery.setJewelleryId(rs.getInt("jewellery_id"));
                jewellery.setJewelleryName(rs.getString("jewellery_name"));
                jewellery.setPrice(rs.getDouble("price"));
                jewellery.setWeight(rs.getDouble("weight"));
                jewellery.setMaterial(rs.getString("material"));
                jewellery.setImageUrl(rs.getString("image_url"));
                jewellery.setStockQuantity(rs.getInt("stock_quantity"));

                list.add(jewellery);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}