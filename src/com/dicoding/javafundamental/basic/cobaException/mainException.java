package com.dicoding.javafundamental.basic.cobaException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class mainException {

    public static void readFiles(String filename){
        try{
            File file = new File(filename);
            FileReader fr = new FileReader(file); // error
            System.out.println("Success");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){
        String filename1 = "C:\\example.txt";
        String filename2 = "C:\\example0.txt";
        readFiles(filename1);
        readFiles(filename2);

        int[] a = new int[5];
        try {
            System.out.println("Akses elemen ke 5 :" + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally { // akan selalu dijalankan
            a[4] = 10;
            System.out.println("Nilai elemen terakhir: " + a[4]);
        }

    }
}
