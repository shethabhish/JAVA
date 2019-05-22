package com.company;

public class Main {

    public static void main(String[] args) {
	String numberasstring = "2018";
        System.out.println(numberasstring);

        int number = Integer.parseInt(numberasstring);
        System.out.println(number);

        numberasstring +=1;
        number +=1;
        System.out.println(numberasstring);
        System.out.println(number);

        String doubleasstring = "2018.2018";
        System.out.println(doubleasstring);

        double value = Double.parseDouble(doubleasstring);
        System.out.println(value);

        doubleasstring += 123;
        value += 12;
        System.out.println(doubleasstring);
        System.out.println(value);
    }
}
