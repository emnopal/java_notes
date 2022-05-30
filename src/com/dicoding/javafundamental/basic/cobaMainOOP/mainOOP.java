package com.dicoding.javafundamental.basic.cobaMainOOP;

import com.dicoding.javafundamental.basic.cobaOOP.*;

public class mainOOP {

    public static void main(String[] args){

        // Deklarasi Class
        // namaClass variabel = new konstruktor(isi_konstruktor);

        cobaClass orang1 = new cobaClass("Agus");
        cobaClass orang2 = new cobaClass("Budi");
        cobaClass orang3 = new cobaClass("Yani");

        // Mengisi nilai setter

        orang1.cobaClassUmur(25);
        orang1.cobaClassBB(67.8);

        orang2.cobaClassUmur(45);
        orang2.cobaClassBB(77.8);

        orang3.cobaClassUmur(16);
        orang3.cobaClassBB(45.7);

        // Memanggil function di class
        // Mencetak nilai setter (getter)

        orang1.cetakCoba();
        System.out.println();
        orang2.cetakCoba();
        System.out.println();
        orang3.cetakCoba();
        System.out.println();

        // Memanggil function di class dengan nilai return
        double hasilOrang1 = orang1.hitungUmurBB();
        double hasilOrang2 = orang2.hitungUmurBB();
        double hasilOrang3 = orang3.hitungUmurBB();

        System.out.println("Hasil Orang 1: " + hasilOrang1);
        System.out.println("Hasil Orang 2: " + hasilOrang2);
        System.out.println("Hasil Orang 3: " + hasilOrang3);
        System.out.println();

        // Memanggil function di class dengan nilai return dan passing parameter

        double bayarOrang1 = orang1.bayarPajak(21000);
        double bayarOrang2 = orang2.bayarPajak(22000);
        double bayarOrang3 = orang3.bayarPajak(25000);

        System.out.println("Pajak Orang 1: " + bayarOrang1);
        System.out.println("Pajak Orang 2: " + bayarOrang2);
        System.out.println("Pajak Orang 3: " + bayarOrang3);
        System.out.println();

    }
}
