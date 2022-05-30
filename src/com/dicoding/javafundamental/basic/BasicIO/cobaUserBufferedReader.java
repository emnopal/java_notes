package com.dicoding.javafundamental.basic.BasicIO;

import com.dicoding.javafundamental.basic.operasi.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cobaUserBufferedReader {
    public static void main(String[] args){

        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        int a = 0;
        int b = 0;

        try{
            System.out.printf("A: ");
            a = Integer.parseInt(bufferedReader.readLine()); // input params
            System.out.printf("B: ");
            b = Integer.parseInt(bufferedReader.readLine()); // input params
        } catch (IOException e){
            e.printStackTrace();
        }

        int jumlah = penjumlahan.penjumlahan(a,b);
        int kurang = pengurangan.pengurangan(a,b);
        int kali = perkalian.perkalian(a,b);

        System.out.printf("Penjumlahan: %d\n", jumlah);
        System.out.printf("Pengurangan: %d\n", kurang);
        System.out.printf("Perkalian: %d\n", kali);

    }
}
