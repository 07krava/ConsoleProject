package com.company.interfaceTasks4;

public class Atelier {

public void dressAMan(Clothing[] clothing){

    for (Clothing test:clothing){
        if (test instanceof ManDress){
            System.out.println(((ManDress) test).dressAMen());
        }
        else if (test instanceof Necktie){
            System.out.println(((Necktie) test).dressAMen());
        }
//        else if (test instanceof WomanDress){
//            System.out.println(((WomanDress) test).dressAWomen());
//        }
    }
  }
    public void dressAWoman(Clothing[] clothing){
        for (Clothing test:clothing){
            if (test instanceof WomanDress){
                System.out.println(((WomanDress) test).dressAWomen());
            }
            else if (test instanceof Skirt){
                System.out.println(((Skirt) test).dressAWomen());
            }
//            else if (test instanceof Pants){
//                System.out.println(((Pants) test).dressAWomen());
//            }
        }
    }
}
