package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        while (input == 1) {
            System.out.println("1. Commercial");
            System.out.println("2. Residential");
            System.out.println("3. Done");
            System.out.println("Please enter option, 1, 2, or 3");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                   print();

                    break;
                case 2:
                    new Residential();

                    break;
                case 3:
                    System.out.println("Session is done");
            }
        }

    }
}
