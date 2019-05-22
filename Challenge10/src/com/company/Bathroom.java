package com.company;

public class Bathroom {

    private int height;
    private String color;
    private String style;

    public Bathroom(int height, String color, String style) {
        this.height = height;
        this.color = color;
        this.style = style;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String getStyle() {
        return style;
    }
}
