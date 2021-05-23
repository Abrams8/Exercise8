package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 65623;
        int rest = 0;
        rest = number % 10;
        if (rest == 1) {
            System.out.println(number + " рубль");
        } else if (rest >= 2 && rest <= 4) {
            System.out.println(number + " рубля");
        } else {
            System.out.println(number + " рублей");
        }
    }
}
