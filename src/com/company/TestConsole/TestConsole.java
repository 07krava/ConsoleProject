package com.company.TestConsole;

public class TestConsole {
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
    reverse(number);
    }
    public static void reverse (int [] number){
        for (int i = number.length-1; i < number.length; i--){
              System.out.println(number[i]);
              if (number[i] == 1){
                  break;
              }
        }
    }
}
