package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Locale;

public class Webshop {

    public static void main(String[] args) {
        Currency GDP = Currency.getInstance(Locale.UK);

        Supplier Apple = new Supplier();
        Apple.setName("Apple");
        Apple.setDescription("Sells overpriced shit");
        System.out.println(Apple.toString());
        Supplier Samsung = new Supplier("Samsung", "Taiwanese manufacturing giant");
        System.out.println(Samsung.toString());
        ProductCategory phone = new ProductCategory();
        phone.setName("phone");
        phone.setDepartment("electronics");
        phone.setDescription("Tiny magic computers to Instagram with");
        System.out.println(phone.toString());
        ProductCategory tablet = new ProductCategory("tablet", "electronics", "It's like phones, but bigger");
        System.out.println(tablet.toString());
        Product iFos6 = new Product();
        iFos6.setName("iFos 6");
        iFos6.setDefaultPrice(999);
        iFos6.setDefaultCurrency(GDP);
        iFos6.setProductCategory(phone);
        iFos6.setSupplier(Apple);
        System.out.println(iFos6.toString());
        Product GalaxyS7 = new Product("Galaxy S 7", 799, GDP, Samsung, phone);
        System.out.println(GalaxyS7.toString());
        System.out.println(Apple.getProducts());
        System.out.println(phone.getProducts());
    }
}
