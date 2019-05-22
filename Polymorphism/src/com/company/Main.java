package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String Plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    @Override
    public String Plot() {
        return "A shark eat lots of people";
    }
}

class Mazerunner extends Movie{
    public Mazerunner() {
        super("Mazerunner");
    }
    @Override
    public String Plot() {
        return "Kids try escape a maze";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independance Day");
    }
    @Override
    public String Plot() {
        return "Aliens attempt to takeover earth";
    }
}

class Starwars extends Movie {
    public Starwars() {
        super("Starwars");
    }

    @Override
    public String Plot() {
        return "Imperial forces try to takeover universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
    //No plot
}
public class Main {

    public static void main(String[] args) {
	for (int i =1;i<11;i++) {
	    Movie movie = randomMovie();
        System.out.println("Movie #" +i+ " : " +movie.getName()+ "\n" +movie.Plot()+"\n");
    }
    }

    public static Movie randomMovie() {
        int random = (int) (Math.random()*5)+1;
        System.out.println("Random number generated is " +random);
        switch (random) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Mazerunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
