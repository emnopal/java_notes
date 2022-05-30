package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.operasi.penjumlahan;
import com.dicoding.javafundamental.basic.operasi.perkalian;

public class newMain {
    public static void main(String[] args) {

        int a = 12;
        int b = 3;

        String contoh = "Berikut adalah contoh operasi matematika pada java";
        System.out.println(contoh);

        char[] penjumlahanChars = {'p', 'e', 'n', 'j', 'u', 'm', 'l', 'a', 'h', 'a', 'n'};
        String penjumlahanChar = new String(penjumlahanChars);

        char[] perkalianChars = {'p', 'e', 'r', 'k', 'a', 'l', 'i', 'a', 'n'};
        String perkalianChar = new String(perkalianChars);

        System.out.println("\n" + penjumlahanChar);
        int jumlah = penjumlahan.penjumlahan(a, b);
        String Penjumlahan = String.format("%s: %d\n", "Hasil Penjumlahan", jumlah);
        System.out.println(Penjumlahan);

        System.out.println(perkalianChar);
        int kali = perkalian.perkalian(a, b);
        System.out.printf("Hasil Perkalian adalah: %d\n\n", kali);

        System.out.printf("Hasil Perkalian dan Penjumlahan adalah: %d dan %d\n\n", kali, jumlah);

        String panjang = "Berikut adalah contoh dari panjang string";
        int panjangnya = panjang.length();
        System.out.println(panjang);
        System.out.println("Panjang string diatas: " + panjangnya);
        
        // Mengambil karakter dari string
        char ambil = panjang.charAt(12);
        System.out.println(ambil); //a

        String empty = "";
        System.out.println(empty.isEmpty()); //True

    }
}
