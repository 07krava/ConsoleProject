package com.company.interfaceTasks4;
//Футболка
public class TShirt extends Clothing implements MensClothing, WomensClothing{
    public TShirt(int euroSize, String color, double cost) {
        super(euroSize, color, cost);
    }
    @Override
    public String dressAMen() {
        return "Мужская футболка в размере: " + ClothingSize.XXS.getDescription() + " в цвете " + color + " по цене " + cost;
    }

    @Override
    public String dressAWomen() {
        return "Женская футболка в размере: " + ClothingSize.L + " в цвете " + color + " по цене " + cost;
    }
}
