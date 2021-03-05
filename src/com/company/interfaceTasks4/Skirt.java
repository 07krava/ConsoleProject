package com.company.interfaceTasks4;

public class Skirt extends Clothing implements WomensClothing{
    public Skirt(int euroSize, String color, double cost) {
        super(euroSize, color, cost);
    }

    @Override
    public String dressAWomen() {
       return "Юбка в размере: " + euroSize + " в цвете " + color + " по цене " + cost;

    }
}
