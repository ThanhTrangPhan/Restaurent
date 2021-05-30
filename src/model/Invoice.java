/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author demo
 */
public class Invoice implements Serializable {

    private int id;
    private Supplier supplier;
    private Staff staff;
    private String date;
    private List<DetailStock_Ingredient> detailList;

    public Invoice() {
    }

    public Invoice(int id, Supplier supplier, Staff staff, String date, List<DetailStock_Ingredient> detailList) {
        this.id = id;
        this.supplier = supplier;
        this.staff = staff;
        this.date = date;
        this.detailList = detailList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<DetailStock_Ingredient> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<DetailStock_Ingredient> detailList) {
        this.detailList = detailList;
    }

    
}
