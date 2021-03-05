package com.company.interfaceTasks2;

//Барабан
public class Drum implements instrument{
    int diameter;

    public Drum(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Звучит барабан с диметром " + diameter);
    }
}
