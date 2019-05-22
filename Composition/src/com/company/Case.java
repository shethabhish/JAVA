package com.company;

public class Case {

    private String model;
    private String manufacturor;
    private String powersupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturor, String powersupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturor = manufacturor;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }

    public void powerbutton() {
        System.out.println("Power Button Pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturor() {
        return manufacturor;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
