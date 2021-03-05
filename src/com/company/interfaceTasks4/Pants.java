package com.company.interfaceTasks4;
//Штаны
public class Pants extends Clothing implements MensClothing, WomensClothing{
    public Pants(int euroSize, String color, double cost) {
        super(euroSize, color, cost);
    }

    @Override
    public String dressAMen() {
        return "Мужские штаны в размере: " + ClothingSize.L + " В цвете: " + color + " по цене: " + cost;

    }

    @Override
    public String dressAWomen() {
       return "Женские штаны в размере: " + euroSize + " В цвете: " + color + " по цене: " + cost;

    }
}
