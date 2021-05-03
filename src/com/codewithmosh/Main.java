package com.codewithmosh;

public class Main {
    public static void main(String[] names) {
        Arrays numbers = new Arrays(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(4);
        numbers.insert(5);
        numbers.removeAt(0);
        System.out.println(numbers.IndexOf(5));
        numbers.print();
    }
}

