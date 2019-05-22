package com.company;

public class Car {

    private int doors; // these are the objects or features of a car
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {       // This is a method to set the field with the corresponding variable
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodre")) {  // to accept only the input which we need
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    }
    public String getModel() {     // this is a method to get or return the output
        return this.model;
    }
}
