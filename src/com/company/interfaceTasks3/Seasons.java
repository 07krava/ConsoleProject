package com.company.interfaceTasks3;

public enum Seasons {
    Spring(15),
    Autumn(20),
    Winter(-1),

    Summer(30) {
        @Override
        public String getDescription(){
            return " Теплое время года ";
        }
    };

    private int temperature;

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription(){
        return " Холодное время года ";
    }
}
