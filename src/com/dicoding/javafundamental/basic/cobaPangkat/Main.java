package com.dicoding.javafundamental.basic.cobaPangkat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        cobaPangkat Pangkat = new cobaPangkat();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();

        int rekursif = Pangkat.pangkatRecursive(angka, pangkat);
        int loop = Pangkat.pangkatLoop(angka, pangkat);

        System.out.println("Factorial Recursive: " + rekursif);
        System.out.println("Factorial Loop: " + loop);
    }
}
