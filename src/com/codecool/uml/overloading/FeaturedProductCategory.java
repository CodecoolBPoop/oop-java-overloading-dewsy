package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {

    private Date startDate;
    private Date endDate;

    public void schedule (Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return String.format("FeaturedProductCategory id: %s, name: %s, department: %s, descripton: %s", super.getId(), super.getName(), super.getDepartment(), super.getDescription());
    }

}
