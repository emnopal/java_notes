package com.dicoding.javafundamental.basic.cobaFactorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        cobaFactorial faktorial = new cobaFactorial();

        System.out.print("Masukkan angka: ");

        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();

        long rekursif = faktorial.factorialRecursive(angka);
        long loop = faktorial.factorialLoop(angka);

        System.out.println("Factorial Recursive: " + rekursif);
        System.out.println("Factorial Loop: " + loop);
    }
}
