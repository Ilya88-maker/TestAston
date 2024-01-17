package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите имя");


        if (s.nextLine() == "Вячеслав"){

            String name  = s.nextLine();
            System.out.println("Привет" + name);
        }


        System.out.println("Нет такого имени");
    }

}