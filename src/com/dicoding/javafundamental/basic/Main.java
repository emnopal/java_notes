package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // buat satu baris tanpa formater

        Gitar.bunyi();

        Kereta.JumlahKereta();
        Motor.JumlahMotor();
        Mobil.JumlahMobil();

        Date today = new Date();
        System.out.printf("Hari ini = %s\n", today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.printf("Besok = %s\n", tomorrow);

    }
}
