/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.text.SimpleDateFormat;
import java.sql.*;
import model.DetailStock_Ingredient;
import model.Invoice;

/**
 *
 * @author demo
 */
public class InvoiceDAO extends DAO {

    public InvoiceDAO() {
        super();
    }

    public boolean addInvoice(Invoice inv) {
        String sqlAddInv = "INSERT INTO tblInvoice(tblSupplierID,tblStaffID,date) VALUES(?,?,?)";
        String sqlAddDetail = "INSERT INTO tblDetailStock_Ingredient(tblInvoiceID,tblngredientID,quantity,price,saleoff) "
                + "VALUES(?,?,?,?,?)";

        
        boolean res = true;
        try {
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement(sqlAddInv, Statement.RETURN_GENERATED_KEYS);
            String pos=inv.getStaff().getPosition();
            if (pos.compareToIgnoreCase("quản lý nhà hàng") != 0){
                return false;
            }
            ps.setInt(1, inv.getSupplier().getId());
            ps.setInt(2, inv.getStaff().getId());
            ps.setString(3, inv.getDate());
            ps.executeUpdate();

            ResultSet inv_id = ps.getGeneratedKeys();
            if (inv_id.next()) {
                inv.setId(inv_id.getInt(1));

                //Them vao bang DetailStock_Ingredient
                for (DetailStock_Ingredient detail : inv.getDetailList()) {
                    ps = conn.prepareStatement(sqlAddDetail,Statement.RETURN_GENERATED_KEYS);
                    ps.setInt(1, inv.getId());
                    ps.setInt(2, detail.getIngredient().getId());
                    ps.setFloat(3, detail.getQuantity());
                    ps.setInt(4, detail.getPrice());
                    ps.setFloat(5, detail.getSaleoff());
                    ps.executeUpdate();
                    ResultSet r = ps.getGeneratedKeys();
                    if(r.next()){
                        detail.setId(r.getInt(1));
                    }
                    
                }

            }
            conn.commit();
        } catch (Exception e) {
            res=false;
            try {
                conn.rollback();
            } catch (Exception ex) {
                res=false;
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally{
            try {
                conn.setAutoCommit(true);
            } catch (Exception e) {
                res=false;
                e.printStackTrace();
            }
        }
        return res;
    }
}
