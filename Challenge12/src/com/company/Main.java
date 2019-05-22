package com.company;

class Car {
    private int cylinders;
    private int wheels;
    private String name;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String start() {
        return "Engine started";
    }
    public String accelerate() {
        return "Accelerating";
    }
    public String brake() {
        return "Brake applied";
    }
}

class Bmw extends Car {
    public Bmw() {
        super(8,"BMW");
    }

    @Override
    public String start() {
        return "BMW started";
    }

    @Override
    public String accelerate() {
        return "BMW Accelerated";
    }

    @Override
    public String brake() {
        return "BMW Braked";
    }
}

class Audi extends Car {
    public Audi() {
        super(6,"Audi");
    }

    @Override
    public String start() {
        return "Audi Started";
    }

    @Override
    public String accelerate() {
        return "Audi Accelerated";
    }

    @Override
    public String brake() {
        return "Audi Braked";
    }
}

class Merc extends Car {
    public Merc() {
        super(6, "Merc");
    }

    @Override
    public String start() {
        return "Merc Started";
    }

    @Override
    public String accelerate() {
        return "Merc Accelerated";
    }

    @Override
    public String brake() {
        return "Merc Braked";
    }
}

public class Main {

    public static void main(String[] args) {
	Car car = new Car(4,"Swift");
        System.out.println(car.start());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Bmw bmw = new Bmw();
        System.out.println(bmw.start());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());

        Audi audi = new Audi();
        System.out.println(audi.start());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        Merc merc = new Merc();
        System.out.println(merc.start());
        System.out.println(merc.accelerate());
        System.out.println(merc.brake());
    }
}
