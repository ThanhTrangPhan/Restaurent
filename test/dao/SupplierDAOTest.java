/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import model.Supplier;
import org.junit.Test;


/**
 *
 * @author demo
 */
public class SupplierDAOTest {

    /**
     * Test of searchSuppliers method, of class SupplierDAO.
     */
    @Test
    //Không co ncc cần tìm
    public void testSearchSuppliersException1() {
        String key = "123xx";
        SupplierDAO instance = new SupplierDAO();
        ArrayList<Supplier> result = instance.searchSuppliers(key);
        assertNotNull(result);
        assertEquals(0, result.size());
        // TODO review the generated test code and remove the default call to fail.
        return;
    }

    public void testSearchSuppliersException2() {
        String key = "trk";
        SupplierDAO instance = new SupplierDAO();
        ArrayList<Supplier> result = instance.searchSuppliers(key);
        assertNotNull(result);
        assertEquals(0, result.size());
        // TODO review the generated test code and remove the default call to fail.
        return;
    }

    // Test tìm thấy ncc cần tìm
    public void testSearchSuppliersStandard1() {
        String key = "lam";
        SupplierDAO instance = new SupplierDAO();
        ArrayList<Supplier> result = instance.searchSuppliers(key);
        assertNotNull(result);
        assertEquals(1, result.size());
        for (int i = 0; i < result.size(); ++i) {
            assertTrue(result.get(i).getName().toLowerCase().contains(key.toLowerCase()));
        }
        // TODO review the generated test code and remove the default call to fail.
        return;
    }

    public void testSearchSuppliersStandard2() {
        String key = "mộc";
        SupplierDAO instance = new SupplierDAO();
        ArrayList<Supplier> result = instance.searchSuppliers(key);
        assertNotNull(result);
        assertEquals(2, result.size());
        for (int i = 0; i < result.size(); ++i) {
            assertTrue(result.get(i).getName().toLowerCase().contains(key.toLowerCase()));
        }
        // TODO review the generated test code and remove the default call to fail.
        return;
    }

//    /**
//     * Test of addSupplier method, of class SupplierDAO.
//     */
//    @Test
//    // test thêm nhà cung cấo
//    public void testAddSupplier() {
//        Supplier s = new Supplier();
//        SupplierDAO instance = new SupplierDAO();
//        boolean expResult = false;
//        boolean result = instance.addSupplier(s);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }

}
