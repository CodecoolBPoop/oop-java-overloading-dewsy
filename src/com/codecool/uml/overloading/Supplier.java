package com.codecool.uml.overloading;

public class Supplier {

    private static int id = 0;
    private String name;
    private String description;

    public int setNewSupplierID () {
        id += 1;
        return id;
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
}
