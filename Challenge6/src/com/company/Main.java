package com.company;

public class Main {

    public static void main(String[] args) {
        double value= CalcFeetAndInchesToCentimeters(10,10);
        System.out.println("Value in Centimeters is " + value);
        value = CalcFeetAndInchesToCentimeters(12);
        System.out.println("Value in feet is " + value);
        value = CalcFeetAndInchesToCentimeters(-10,-1);
        System.out.println("Value in Centimeters is " + value);
        value = CalcFeetAndInchesToCentimeters(-5);
        System.out.println("Value in feet is " + value);
    }
    public static double CalcFeetAndInchesToCentimeters (double feet, double inches) {
        // 1 inch = 2.54cm and 1 foot = 12 inches

        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double foot = feet*12*2.54;
            double centi = inches*2.54;
            double total = foot + centi;
            //System.out.println(total);
            return total;
        }
        else {
            return -1;
        }
    }
    public static double CalcFeetAndInchesToCentimeters(double inches) {
        if (inches >=0){
        double feet1 = inches/12;
            //System.out.println(feet1);
            return feet1;
        }
        else {
            return -1;
        }
    }
}
