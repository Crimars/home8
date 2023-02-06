package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        char operation = sc.next().charAt(0);
        int num2 = sc.nextInt();


        if (operation == '+') {
            System.out.println(num1 + " + "  + num2 + " = " + (num1 + num2));}
        else if (operation == '-'){
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));}
        else if (operation == '*'){
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));}
        else if (operation == '/'){
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));}
        else if (operation == '/' && num2 == 0){
            System.out.println("на ноль делить нельзя");
        }
        else{
            System.out.println("неверная операция");
        }


    }
}
