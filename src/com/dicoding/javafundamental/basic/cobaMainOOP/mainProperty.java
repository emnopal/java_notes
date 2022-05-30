package com.dicoding.javafundamental.basic.cobaMainOOP;

import com.dicoding.javafundamental.basic.cobaOOP.cobaProperty;

public class mainProperty {
    public static void main(String[] args){

        // Contoh Properti
        cobaProperty orang1 = new cobaProperty(43.5, 23);
        orang1.cekProperty();

        // Contoh Metode
        orang1.cobaMetode();

        // Contoh Implisit Setter Getter
        System.out.println("Anda dengan umur: " + orang1.getUmur() + ", maka anda harus membayar pajak sebesar: " + orang1.getPajak() + " dan tanggungan sebesar: " + orang1.getPembayaran());
        System.out.println("Sehingga total yang harus anda bayar: " + (orang1.getPajak() + orang1.getPembayaran()));

        // Contoh Eksplisit Setter Getter

        cobaProperty newCoba = new cobaProperty(12, 23);
        newCoba.setWaktu(12);
        System.out.println("Coba Waktu: " + newCoba.getWaktu());




    }
}
