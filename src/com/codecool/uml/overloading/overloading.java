package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Date;
import java.util.List;

public class overloading {

    public static int productID = 0;
    public static int categoryID = 0;
    public static int supplierID = 0;



    public class Product {

        private int id;
        private String name;
        private float defaultPrice;
        private Currency defaultCurrency;
        private ProductCategory productCategory;
        private Supplier supplier;
        private List<Product> productList;

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

    }

    public class ProductCategory {

        private int id;
        private String name;
        private String department;
        private String description;


        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
    public class Supplier {


        private int id;
        private String name;
        private String description;

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
    }

    public class FeaturedProductCategory extends ProductCategory {

        private Date startDate;
        private Date endDate;

    }

}

