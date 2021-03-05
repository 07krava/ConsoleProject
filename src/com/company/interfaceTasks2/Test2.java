package com.company.interfaceTasks2;

public class Test2 {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(6);
        Guitar guitar2 = new Guitar(4);
        Trumpet trumpet = new Trumpet("Большая");
        Drum drum = new Drum(24);

        instrument [] instruments = {guitar1, guitar2, trumpet, drum};
        for (instrument object : instruments){
            object.play();
        }
    }
}
