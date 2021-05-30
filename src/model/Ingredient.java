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
public class Ingredient implements Serializable {
    private int id;
    private String name;
    private String type;
    private int price;
    private String unit;

    public Ingredient() {
    }

    public Ingredient(int id, String name, String type, int price,String unit) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.unit=unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
}
