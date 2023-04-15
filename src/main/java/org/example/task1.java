package org.example;

import java.util.Scanner;
/**
 * task1
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
 */
public class task1 {
    public static void main(String[] args) {

        Scanner iScaner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int i = iScaner.nextInt();
        System.out.println("n-ое треугольного число: " + triangle(i));
    }

    public static int triangle(int a){
        return (a * (a + 1) )/ 2;

    }
}
