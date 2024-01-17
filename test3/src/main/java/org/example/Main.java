package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите числа через пробел, затем введите \"done\" и нажмите \"Enter\":");
            ArrayList<Integer> inputs = new ArrayList<Integer>();
            while (in.hasNextInt()){
                inputs.add(in.nextInt());
            }
            for (int i = 0; i< inputs.size(); i++){
                if (inputs.get(i)  % 3 == 0) {
                    System.out.print(inputs.get(i)+" ");
                }
            }
        }
}


