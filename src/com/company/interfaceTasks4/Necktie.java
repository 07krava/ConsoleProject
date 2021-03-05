package com.company.interfaceTasks4;
//галстук
public class Necktie extends Clothing implements MensClothing{
    public Necktie(int euroSize, String color, double cost) {
        super(euroSize, color, cost);
    }

    @Override
    public String dressAMen() {
        return "Галстук в размере: " + euroSize + " в цвете " + color + " по цене " + cost;
    }
}
