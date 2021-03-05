package com.company.Inheritance;

public class Cat extends Animal{
String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setSize("big");
        cat.setColor("red");
        System.out.println("My Cat: \nColor: " + cat.getColor() + "\nSize: " + cat.getSize());
    }
}
