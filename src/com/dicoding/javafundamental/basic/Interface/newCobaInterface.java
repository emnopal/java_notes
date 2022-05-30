package com.dicoding.javafundamental.basic.Interface;

/*

Sebuah kelas dapat mengimplementasikan lebih dari satu interface.
Kelas ini akan mendeklarasikan metode pada interface yang dibutuhkan
oleh kelas itu sekaligus mendefinisikan isinya pada kode program.

 */

// Cara untuk mengimplementasikan interface
public class newCobaInterface implements cobaInterface{

    @Override
    public void func1() {
        System.out.println("Test: " + STR1);
    }

}
