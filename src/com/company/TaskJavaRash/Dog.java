package com.company.TaskJavaRash;

public class Dog extends Animal implements TomJerry{
    @Override
    public void move() {
        System.out.println("Пес может передвигатся");
    }
    public void eating(){
        System.out.println("Пес может кого-то съесть");
    }

    @Override
    void eat() {
        System.out.println("Пес кушает");
    }

    @Override
    void vote() {
        System.out.println("Пес лает");
    }

    @Override
    void move(String run) {
        System.out.println("Пес бегает");
    }
}
