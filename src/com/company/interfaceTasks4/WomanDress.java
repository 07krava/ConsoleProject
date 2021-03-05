package com.company.interfaceTasks4;

public class WomanDress extends Clothing implements WomensClothing {

    public WomanDress(int euroSize, String color, double cost) {
        super(euroSize, color, cost);
    }

    @Override
    public String dressAWomen() {
        return "Футболка женская в размере: " + ClothingSize.S + " в цвете " + color + " по цене " + cost+"\n" +
                "Штаны женские в размере: " + ClothingSize.M + " в цвете " + color + " по цене " + cost;
    }
}
