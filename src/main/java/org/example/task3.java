package org.example;

import java.util.Scanner;

/*
Реализовать простой калькулятор
 */
public class task3 {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Введите первое число: ");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();

        System.out.print("Введите второе число: ");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();

        System.out.print("Введите операцию: ");
        char operation = scanner.next().charAt(0);

        int result = 0;
        String res = "";
        if (operation == '+') {
            result = num1 + num2;
            res = " Сумма равна: ";
        }if (operation == '-') {
            result = num1 - num2;
            res = " Разность равна: ";
        }if (operation == '/') {
            result = num1 / num2;
            res = " Частное  равно: ";
        }if (operation == '*') {
            result = num1 * num2;
            res = " Произведение равно: ";
        }


        System.out.println(res + result);
        n1.close();
        n2.close();
    }
}

