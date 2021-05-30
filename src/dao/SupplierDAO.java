/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import model.Supplier;

/**
 *
 * @author demo
 */
public class SupplierDAO extends DAO {

    public SupplierDAO() {
        super();
    }

    // tim Supplier
    public ArrayList<Supplier> searchSuppliers(String key) {
        ArrayList<Supplier> res = new ArrayList<>();
        String sql = "SELECT * FROM tblSupplier WHERE name LIKE ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Supplier sup = new Supplier();
                sup.setId(rs.getInt("id"));
                sup.setName(rs.getString("name"));
                sup.setPhone_number(rs.getString("phone_number"));
                sup.setAddress(rs.getString("address"));
                res.add(sup);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public boolean addSupplier(Supplier s) {
        String sql = "INSERT INTO tblSupplier(name,phone_number,address) VALUES(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, s.getName());
            ps.setString(2, s.getPhone_number());
            ps.setString(3, s.getAddress());
            ps.executeUpdate();

            //lay id cua supplier moi
            ResultSet s_id = ps.getGeneratedKeys();
            if (s_id.next()) {
                s.setId(s_id.getInt(1));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
