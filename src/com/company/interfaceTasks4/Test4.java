package com.company.interfaceTasks4;

public class Test4 {
    public static void main(String[] args) {
//        TShirt tShirt = new TShirt(32,"red", 34.5);
//        TShirt tShirt2 = new TShirt(36,"yellow", 20.5);
        WomanDress tShirt = new WomanDress(32, "Blue", 35.12);
        ManDress tShirt2 = new ManDress(38,"Red", 23.24);
        WomanDress pants = new WomanDress(36, "Black", 12.50);
         ManDress pants2 = new ManDress(36,"green",5.75);
        Skirt skirt = new Skirt(34,"blue",25.34);
        Necktie necktie = new Necktie(32,"black",34.00);
        Atelier atelier = new Atelier();

      Clothing[] clothing = {tShirt, tShirt2, pants, pants2, skirt, necktie};

          atelier.dressAMan(clothing);
          System.out.println();
          atelier.dressAWoman(clothing);

    }
}
