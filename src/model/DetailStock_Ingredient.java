/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author demo
 */
public class DetailStock_Ingredient implements Serializable {
    private int id;
    private Invoice invoice;
    private Ingredient ingredient;
    private float quantity;
    private int price;
    private float saleoff;

    

    public DetailStock_Ingredient() {
    }

    public DetailStock_Ingredient(int id, Invoice invoice, Ingredient ingredient, float quantity, int price, float saleoff) {
        this.id = id;
        this.invoice = invoice;
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.price = price;
        this.saleoff = saleoff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getSaleoff() {
        return saleoff;
    }

    public void setSaleoff(float saleoff) {
        this.saleoff = saleoff;
    }

    
    
}
