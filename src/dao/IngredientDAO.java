/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Ingredient;

/**
 *
 * @author demo
 */
public class IngredientDAO extends DAO{
    public IngredientDAO() {
        super();
    }

    // tim Ingredient
    public ArrayList<Ingredient> searchIngredient(String key) {
        ArrayList<Ingredient> res = new ArrayList<>();
        String sql = "SELECT * FROM tblIngredient WHERE name LIKE ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ingredient ingredient = new Ingredient();
                ingredient.setId(rs.getInt("id"));
                ingredient.setName(rs.getString("name"));
                ingredient.setType(rs.getString("type"));
                ingredient.setPrice(rs.getInt("price"));
                ingredient.setUnit(rs.getNString("unit"));
                res.add(ingredient);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public boolean addIngredient(Ingredient i) {
        String sql = "INSERT INTO tblIngredient(name,type,price,unit) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, i.getName());
            ps.setString(2, i.getType());
            ps.setInt(3, i.getPrice());
            ps.setString(4,i.getUnit());
            ps.executeUpdate();

            //lay id cua ingredientplier moi
            ResultSet i_id = ps.getGeneratedKeys();
            if (i_id.next()) {
                i.setId(i_id.getInt(1));
                return true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
