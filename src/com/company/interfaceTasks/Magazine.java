package com.company.interfaceTasks;

public class Magazine implements Printable{
    String name;
    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
    static boolean printMagazine(Printable[] printables){
    for (Printable magazines : printables){
        if (magazines instanceof Magazine){
            System.out.println(((Magazine) magazines).name);
        }
      }
    return false;
    }
    @Override
    public void print() {
        System.out.println("Журналы");
    }
}
