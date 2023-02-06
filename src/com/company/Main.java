package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = nInt();
        int num2 = nInt();
        char operation = operat();
    }

    public static int nInt() {
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            System.out.println("ввели число " + num1);
        } else {
            System.out.println("это не число!");
        }
        return 0;
    }

    public static char operat() {
        if (sc.hasNext()) {
            char operation = sc.next().charAt(0);
        } else {
            System.out.println("не операция");
            char operation = operat();
        }
        return 0;
    }





            public static int calc(int num1, int num2, char operation){

                if (operation == '+') {
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                } else if (operation == '-') {
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                } else if (operation == '*') {
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                } else if (operation == '/') {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("неверная операция");
                }

return num1;
            }
        }



