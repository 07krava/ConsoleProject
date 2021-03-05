package com.company.interfaceTasks4;

public enum ClothingSize {
    XXS(32){
        @Override
        String getDescription(){
            return "Детский размер";
        }
    },
    XS(34), S(36), M(38), L(40);

    int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    String getDescription(){
        return "Взрослый размер";
    }
}
