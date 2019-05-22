package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1+2;
        System.out.println(result);

        int prevresult = result;
        result =result-1;
        System.out.println(result);

        prevresult = result;
        result = result*10;
        System.out.println(result);

        prevresult = result;
        result = result/5;
        System.out.println(result);

        prevresult = result;
        result = result%3;
        System.out.println(result);

        prevresult = result;
        result++;
        System.out.println(result);

        prevresult = result;
        result--;
        System.out.println(result);

        result +=2;
        System.out.println(result);
        result -=1;
        System.out.println(result);
        result *=10;
        System.out.println(result);
        result /=5;
        System.out.println(result);

        boolean ismike = false;
        if (ismike == true)
            System.out.println("Correct");
        else
            System.out.println("Wrong");
        int top = 80;
        if(top < 100)
        System.out.println("True");

        int second = 81;
        if ((top<second) && (top<100))
            System.out.println("Yooo");

        if ((top>90) || (top<90))
            System.out.println("One of them is True");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("That's 50");

        boolean isBro = true;
        if (isBro == false)
            System.out.println("That's not right");

        boolean wasBro = isBro ? true : false;

    }
}
