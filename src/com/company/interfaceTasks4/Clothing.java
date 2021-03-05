package com.company.interfaceTasks4;

public abstract class Clothing {
    int euroSize;
//   ClothingSize size1 = ClothingSize.XXS;
//   ClothingSize size2 = ClothingSize.XS;
//   ClothingSize size3 = ClothingSize.S;
//   ClothingSize size4 = ClothingSize.M;
//   ClothingSize size5 = ClothingSize.L;
    double cost;
    String color;

    public Clothing(int euroSize, String color, double cost) {
        this.euroSize = euroSize;
        this.color = color;
        this.cost = cost;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
