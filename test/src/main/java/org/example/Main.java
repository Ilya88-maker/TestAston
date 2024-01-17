package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int a = scanner.nextInt();

        if (a > 7){
            System.out.println("Привет");
        }
    }

}
