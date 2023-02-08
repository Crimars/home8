package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = enterInt();
        int num2 = enterInt();
        char operation = enterOperat();
        int result = calc(num1, num2, operation);
        //System.out.println("результат " + result);
    }

    public static int enterInt() {
        System.out.println("введите число:");
        int num = 0;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            //System.out.println("ввели число " + num);
        } else {
            System.out.println("это не число!");
            sc.next();
            num = enterInt();
        }
        return num;
    }

    public static char enterOperat() {
        System.out.println("введите операцию:");
        char operation;
        if (sc.hasNext()) {
            operation = sc.next().charAt(0);
        } else {
            System.out.println("не операция");
            operation = enterOperat();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        if (operation == '+') {
            System.out.println("результат:" + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("результат:" + (num1 - num2));
        } else if (operation == '*') {
            System.out.println("результат:" + (num1 * num2));
        } else if (operation == '/') {
            System.out.println("результат:" + (num1 / num2));
        } else {
            System.out.println("неверная операция");}

           return result;
        }
    }




