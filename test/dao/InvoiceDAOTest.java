/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DetailStock_Ingredient;
import model.Ingredient;
import model.Invoice;
import model.Staff;
import model.Supplier;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author demo
 */
public class InvoiceDAOTest {
    
    public InvoiceDAOTest() {
    }

    /**
     * Test of addInvoice method, of class InvoiceDAO.
     */
    @Test
    //Ngoại lê: invoice sai ncc/nl
    public void testAddInvoice1() {
        System.out.println("addInvoice");
        Invoice inv = new Invoice();
        inv.setDate("2021-5-4 7:6:12");
        InvoiceDAO instance = new InvoiceDAO();
        
        Supplier supp=new Supplier();
        supp.setId(4);
        inv.setSupplier(supp);
        
        //Khong phai quan ly
        Staff s=new Staff();
        s.setId(4);
        inv.setStaff(s);
        
        List<DetailStock_Ingredient> dt = new ArrayList<>();
        Ingredient ingredient = new Ingredient();
        ingredient.setId(3);
        DetailStock_Ingredient dts=new DetailStock_Ingredient();
        dts.setIngredient(ingredient);
        dts.setPrice(50);
        dts.setQuantity(50);
        dts.setSaleoff(0);
        dt.add(dts);
        inv.setDetailList(dt);
        
        Connection conn = DAO.conn;
        try {
            conn.setAutoCommit(false);
            Assert.assertFalse(instance.addInvoice(inv));
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                if(!conn.getAutoCommit()){
                    conn.rollback();
                    conn.setAutoCommit(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
        
    }
    
    public void testAddInvoice2() {
        System.out.println("addInvoice");
        Invoice inv = new Invoice();
        inv.setDate("2021-5-4 7:6:12");
        InvoiceDAO instance = new InvoiceDAO();
        
        Supplier supp=new Supplier();
        supp.setId(4);
        inv.setSupplier(supp);
        
        //Khong phai quan ly
        Staff s=new Staff();
        s.setId(2);
        inv.setStaff(s);
        
        List<DetailStock_Ingredient> dt = new ArrayList<>();
        Ingredient ingredient = new Ingredient();
        ingredient.setId(20);
        DetailStock_Ingredient dts=new DetailStock_Ingredient();
        dts.setIngredient(ingredient);
        dts.setPrice(50);
        dts.setQuantity(50);
        dts.setSaleoff(0);
        dt.add(dts);
        inv.setDetailList(dt);
        
        Connection conn = DAO.conn;
        try {
            conn.setAutoCommit(false);
            Assert.assertFalse(instance.addInvoice(inv));
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                if(!conn.getAutoCommit()){
                    conn.rollback();
                    conn.setAutoCommit(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
        
    }
    
    // Tieu chuan
    public void testAddInvoice3() {
        System.out.println("addInvoice");
        Invoice inv = new Invoice();
        inv.setDate("2021-5-4 7:6:12");
        InvoiceDAO instance = new InvoiceDAO();
        
        Supplier supp=new Supplier();
        supp.setId(4);
        inv.setSupplier(supp);
        
        
        Staff s=new Staff();
        s.setId(2);
        inv.setStaff(s);
        
        List<DetailStock_Ingredient> dt = new ArrayList<>();
        Ingredient ingredient = new Ingredient();  
        DetailStock_Ingredient dts=new DetailStock_Ingredient();
        ingredient.setId(3);
        dts.setIngredient(ingredient);
        dts.setPrice(50);
        dts.setQuantity(50);
        dts.setSaleoff(0);
        dt.add(dts);
        
        ingredient.setId(5);
        dts.setIngredient(ingredient);
        dts.setPrice(50);
        dts.setQuantity(50);
        dts.setSaleoff(0);
        dt.add(dts);
        
        inv.setDetailList(dt);
        
        Connection conn = DAO.conn;
        try {
            conn.setAutoCommit(false);
            Assert.assertTrue(instance.addInvoice(inv));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                if(!conn.getAutoCommit()){
                    conn.rollback();
                    conn.setAutoCommit(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
        
    }
    
}
