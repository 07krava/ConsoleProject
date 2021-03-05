package com.company.TaskJavaRash;

public class Cat extends Animal implements TomJerry{
    @Override
    public void move() {
        System.out.println("Кот может передвигаться");
    }
    public void eating(){
        System.out.println("Кот может кого-то съесть");
    }
    public void toBeEating(){
        System.out.println("Кот может быть съеденным");
    }

    @Override
    void eat() {
        System.out.println("Кот кушает");
    }

    @Override
    void vote() {
        System.out.println("Кот мяукает");
    }
     void move(String run){
        System.out.println("Кот бегает");
    }
}
