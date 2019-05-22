package com.company;

public class VipCustomer {

    private String name;
    private double limit;
    private String email;

    public VipCustomer() {
        this("Shethabhish", 100000, "shethabhish@gmail.com");
    }

    public VipCustomer(String name, double limit) {
        this(name, limit, "unknown");
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
