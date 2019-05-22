package com.company;

public class Main {

    public static void main(String[] args) {
	GetDurationString(300, 30);
	GetDurationString(300);
	GetDurationString(-10,60);
	GetDurationString(-100);
    }
    public static void GetDurationString (double minutes, double seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
        double hours = (minutes/60);
            System.out.println(minutes+"MM & " + seconds +"SS = " +hours+ "HH & "+ seconds +"SS");
        }
        else {
            System.out.println("Invalid Value");
                    }
    }
    public static void GetDurationString (double seconds) {
        if (seconds >= 0) {
            double minutes = seconds/60;
            System.out.println(seconds+"SS = " + minutes + "MM");
        }
        else {
            System.out.println("Invalid Value");
        }
    }

}
