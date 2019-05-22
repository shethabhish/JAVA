package com.company;

public class PC {

    private Case thecase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case thecase, Monitor monitor, Motherboard motherboard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

   public void Powerup () {
        thecase.powerbutton();
        drawlogo();
   }
   public void drawlogo () {
        monitor.drawpixelart(15,10,"Blue");
   }
}
