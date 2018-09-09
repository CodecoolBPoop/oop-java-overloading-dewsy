package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Date;
import java.util.List;

public class overloading {


    public class Product {

        private int id;
        private String name;
        private float defaultPrice;
        private Currency defaultCurrency;
        private ProductCategory productCategory;
        private Supplier supplier;
        private List<Product> productList

    }

    public class ProductCategory {

        private int id;
        private String name;
        private String department;
        private String description;
    }
    public class Supplier {


        private int id;
        private String name;
        private String description;

    }

    public class FeaturedProductCategory {

        private Date startDate;
        private Date endDate;

    }

}

