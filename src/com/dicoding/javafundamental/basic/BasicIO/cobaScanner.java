package com.dicoding.javafundamental.basic.BasicIO;

import java.util.Scanner;
import com.dicoding.javafundamental.basic.operasi.*;

public class cobaScanner {
    public static void main(String[] args){

        // Using Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.printf("A: ");
        int a = scanner.nextInt(); // buat input method
        System.out.printf("B: ");
        int b = scanner.nextInt(); // buat input method
        scanner.close();

        int jumlah = penjumlahan.penjumlahan(a,b);
        int kurang = pengurangan.pengurangan(a,b);
        int kali = perkalian.perkalian(a,b);

        System.out.printf("Penjumlahan: %d\n", jumlah);
        System.out.printf("Pengurangan: %d\n", kurang);
        System.out.printf("Perkalian: %d\n", kali);

    }
}
