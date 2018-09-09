package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.List;

public class overloading {

    public static int productID = 0;
    public static int categoryID = 0;
    public static int supplierID = 0;

    public int setnewProductID () {
        productID += 1;
        return productID;
    }

    public int setnewCategoryID () {
        categoryID += 1;
        return categoryID;
    }

    public int setNewSupplierID () {
        supplierID += 1;
        return supplierID;
    }



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

        public Product(String name, float defaultPrice, Currency defaultCurrency) {
            this.id = setnewProductID();
            this.name = name;
            this.defaultPrice = defaultPrice;
            this.defaultCurrency = defaultCurrency;
            productList.add(this);
        }

        public Product() {
            this.id = setnewProductID();
            productList.add(this);
        }

        public List<Product> getAllProductsBy(ProductCategory productCategory) {
            List<Product> listByCategory = new ArrayList<>();
            for (Product product : productList) {
                if (product.productCategory.equals(productCategory)) {
                    listByCategory.add(product);
                }
            }
            return listByCategory;
        }

        public List<Product> getAllProductsBy(Supplier supplier) {
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

