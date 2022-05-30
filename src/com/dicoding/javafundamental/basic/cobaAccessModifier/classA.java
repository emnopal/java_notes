package com.dicoding.javafundamental.basic.cobaAccessModifier;

public class classA {

    /* Access modifier private akan membatasi
    akses hanya di dalam class. Private
    biasanya digunakan sebagai modifier dari
    member dan metode suatu class. */

    private int memberA = 5;
    private int functionA(){
        return memberA;
    }

    /* Default modifier berarti penulisan kodenya tanpa atribut modifier.
    Ini berlaku untuk semua kelas, member, atau fungsi yang kita tuliskan tanpa access modifier.
    Modifier default bisa diakses selama masih dalam satu package. */

    int memberB = 20;
    int functionB() {
        int hasil = functionA() + memberA;
        return hasil;
    }

    /* Access modifier protected bisa diakses selama masih dalam satu package.
    Protected memiliki sedikit perbedaan dengan default modifier.
    Perbedaannya adalah protected bisa diakses dari luar package.
    Akan tetapi, satu-satunya cara untuk akses dari luar package
    adalah kelas yang hendak mengakses, merupakan kelas turunannya. */

    protected void functionD(){
        System.out.println("Access this if you can");
    }

    /* Public access modifier bisa diakses dimana mana */

    public int functionC(){
        int hasil = functionA() + functionB() + memberB + memberA;
        return hasil;
    }

    public void functionE(){
        System.out.println("Public Function");
    }

}
