package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {

    private int id;
    private static int lastId = 0;
    private String name;
    private String description;

    private int setNewSupplierID () {
        lastId += 1;
        return lastId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Supplier() {
        this.id = setNewSupplierID();
    }

    public Supplier(String name, String description) {
        this.id = setNewSupplierID();
        this.name = name;
        this.description = description;
    }

    public List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }
}
