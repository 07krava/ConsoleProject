package com.company.interfaceTasks4;

public class ManDress extends Clothing implements MensClothing{

    public ManDress(int euroSize, String color, double cost) {
        super(euroSize, color, cost);
    }


    @Override
    public String dressAMen() {
        return "Футболка мужская в размере: " + ClothingSize.XXS.getDescription() + " в цвете " + getColor() + " по цене " + cost+"\n" +
                "Штаны мужские в размере: " + ClothingSize.L + " в цвете " + color + " по цене " + cost;
    }
}
