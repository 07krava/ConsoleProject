package com.company.TaskJavaRash;

public class Mause extends Animal implements TomJerry{
    @Override
    public void move() {
        System.out.println("Мышь может передвигаться");
    }
    public void toBeEating(){
        System.out.println("Мышь может быть съеденной");
    }

    @Override
    void eat() {
        System.out.println("Мышь кушает");
    }

    @Override
    void vote() {
        System.out.println("Мышь пишит (орет на кота)");
    }

    @Override
    void move(String run) {
        System.out.println("Мышь бегает");
    }
}
