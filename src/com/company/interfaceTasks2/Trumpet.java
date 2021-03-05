package com.company.interfaceTasks2;

//Труба
public class Trumpet implements instrument {
    String size;

    public Trumpet(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Звчит " + size + " труба!");
    }
}
