package com.codecool.uml.overloading;

public class ProductCategory {

    private int id;
    private static int lastId = 0;
    private String name;
    private String department;
    private String description;

    public int setNewCategoryID() {
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

    public ProductCategory(String name, String department, String description) {
        this.id = setNewCategoryID();
        this.name = name;
        this.department = department;
        this.description = description;
    }

    public ProductCategory() {
        this.id = setNewCategoryID();
    }
}
