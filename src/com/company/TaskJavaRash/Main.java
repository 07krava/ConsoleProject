package com.company.TaskJavaRash;

class Main{
    public static void main(String []args){
    Cat cat = new Cat();
    Dog dog = new Dog();
    Mause mause = new Mause();

    cat.eating();
    cat.vote();
    cat.eat();
    cat.move(" Cat run");
    cat.move();
    cat.toBeEating();
        System.out.println();

    mause.move();
    mause.move("Mause run");
    mause.toBeEating();
    mause.vote();
    mause.eat();
        System.out.println();

    dog.move();
    dog.move("Dog run");
    dog.eating();
    dog.vote();
    dog.eat();
    }
}

