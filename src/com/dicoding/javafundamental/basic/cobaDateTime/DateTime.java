package com.dicoding.javafundamental.basic.cobaDateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args){

        // Menampilkan waktu saat ini
        long timeNow = System.currentTimeMillis();
        System.out.println(timeNow);
        System.out.printf("Waktu Saat ini berdasarkan Unix Timestamps: %.3f s\n", (double) timeNow/1000);

        Date timenow = new Date(timeNow);
        System.out.println("Konversi dari Unix Timestamps: " + timenow);

        Date date = new Date();
        System.out.println("Sekarang Tanggal: " + date);

        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah: "+ calendar.getTime());
        System.out.println("Tanggal: "+ calendar.get(Calendar.DATE));
        System.out.println("Bulan: "+ calendar.get(Calendar.MONTH));
        System.out.println("Tahun: "+ calendar.get(Calendar.YEAR));
        System.out.println("Minggu (tahun): "+ calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Minggu (bulan): "+ calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Tanggal (Tahun): "+ calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Jam: "+ calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Menit: "+ calendar.get(Calendar.MINUTE));
        System.out.println("Detik: "+ calendar.get(Calendar.SECOND));
        System.out.println("Milidetik: "+ calendar.get(Calendar.MILLISECOND));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal default : " + new Date());
        System.out.println("Format tanggal dengan format : " + dateFormated);


    }

}
