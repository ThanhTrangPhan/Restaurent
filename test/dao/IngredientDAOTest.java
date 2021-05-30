/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import model.Ingredient;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author demo
 */
public class IngredientDAOTest {

    @Test
    // Không có nguyên liệu 
    public void testSearchIngredientException1() {
        String key = "kxx";
        IngredientDAO instance = new IngredientDAO();

        ArrayList<Ingredient> result = instance.searchIngredient(key);
        assertNotNull(result);
        assertEquals(0, result.size());
        // TODO review the generated test code and remove the default call to fail.
        return;
    }

    public void testSearchIngredientException2() {
        String key = "traa";
        IngredientDAO instance = new IngredientDAO();

        ArrayList<Ingredient> result = instance.searchIngredient(key);
        assertNotNull(result);
        assertEquals(0, result.size());
        // TODO review the generated test code and remove the default call to fail.
        return;
    }

    public void testSearchIngredientStandard1() {
        String key = "x";
        IngredientDAO instance = new IngredientDAO();

        ArrayList<Ingredient> result = instance.searchIngredient(key);
        assertNotNull(result);
        assertEquals(1, result.size());
        for (int i = 0; i < result.size(); ++i) {
            assertTrue(result.get(i).getName().toLowerCase().contains(key.toLowerCase()));
        }
        // TODO review the generated test code and remove the default call to fail.
        return;
    }

    public void testSearchIngredientStandard2() {
        String key = "d";
        IngredientDAO instance = new IngredientDAO();

        ArrayList<Ingredient> result = instance.searchIngredient(key);
        assertNotNull(result);
        assertEquals(2, result.size());
        for (int i = 0; i < result.size(); ++i) {
            assertTrue(result.get(i).getName().toLowerCase().contains(key.toLowerCase()));
        }
        // TODO review the generated test code and remove the default call to fail.
        return;
    }

}
