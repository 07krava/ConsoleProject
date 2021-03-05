package com.company.interfaceTasks2;

//Гитара
public class Guitar implements instrument{
    int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Звучит " + numberOfStrings + "-и струнная гитара");
    }
}
