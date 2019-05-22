package com.company;

public class Printer {

    private int tonerlevel;
    private int pagesprinted;
    private boolean duplex;

    public Printer(int tonerlevel, boolean duplex) {
        if (tonerlevel > -1 && tonerlevel <101) {
            this.tonerlevel = tonerlevel;
        }
        else {
            this.tonerlevel = -1;
        }
        this.pagesprinted = 0;
        this.duplex = duplex;
    }

    public int addtoner (int amount) {
        if ((amount >0 && amount <=100)) {
            if (this.tonerlevel + amount > 100) {
                return -1;
            }
            this.tonerlevel += amount;
            return this.tonerlevel;
        } else {
            return -1;
        }
    }

    public int Print(int pages) {
        int print = pages;
        if (this.duplex) {
            print = (pages/2) + (pages%2);
            System.out.println("Duplex");
        }
        this.pagesprinted += print;
        return print;
    }

    public int getPagesprinted() {
        return pagesprinted;
    }
}
