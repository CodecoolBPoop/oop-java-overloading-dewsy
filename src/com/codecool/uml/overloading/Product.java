package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Product {

    private int id;
    private static int lastId = 0;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList;


    private int setNewProductID () {
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

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        id = setNewProductID();
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
        productList.add(this);
    }

    public Product() {
        id = setNewProductID();
        productList.add(this);
    }

    public static List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> listByCategory = new ArrayList<>();
        for (Product product : productList) {
            if (product.productCategory.equals(productCategory)) {
                listByCategory.add(product);
            }
        }
        return listByCategory;
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> listBySupplier = new ArrayList<>();
        for (Product product : productList) {
            if (product.supplier.equals(supplier)) {
                listBySupplier.add(product);
            }
        }
        return listBySupplier;
    }

    public String toString() {
        return String.format("id: %s, name: %s, defaultPrice: %s", this.id, this.name, this.defaultPrice);
    }

}

