package com.company.interfaceTasks;

public class Book implements Printable{
    String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    static boolean printMagazine(Printable[] printables) {
        for (Printable books : printables) {
            if (books instanceof Book) {
                System.out.println(((Book) books).name);
            }
        }
        return false;
    }
    @Override
    public void print() {
        System.out.println("Книги");
    }
}
