package com.company.interfaceTasks3;

public class Test3 {
    public static void main(String[] args) {
        Seasons season = Seasons.Spring;
        System.out.println(season);
        metod(Seasons.Spring);
        test();
    }
    public static void metod(Seasons season){
    switch (season) {
        case Summer:
            System.out.println("Я люблю Лето ");
            break;
        case Winter:
            System.out.println("Я люблю Зиму ");
            break;
        case Spring:
            System.out.println("Я люблю Весну ");
            break;
        case Autumn:
            System.out.println("Я люблю Осень ");
            break;
        default:
            System.out.println("Выберите время года ");
    }
    }
    public static void test(){
        for (Seasons s : Seasons.values()){
            System.out.println(s + " " + s.getTemperature() + s.getDescription());
        }
    }
}
