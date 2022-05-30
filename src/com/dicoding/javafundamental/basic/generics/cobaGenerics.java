package com.dicoding.javafundamental.basic.generics;

/*

Generics adalah salah satu fitur yang terdapat di JDK 1.5. Ia sangat ditunggu-tunggu. Salah satunya untuk menyederhanakan penulisan kode dari type-casting juga untuk compile-time type safety. Generics dalam kode program bisa dikenali dengan type-parameter. Contoh penggunaan Generics paling umum adalah Collection.

Sebelumnya di materi Collection kita sudah menggunakan fitur Generics yaitu ketika kita deklarasi Set<String>, Set dengan type-parameter <String>. Kita juga deklarasi Map<String, Planet>, Map dengan type-parameter <String, Planet>. Tetapi untuk List kita deklarasi tanpa type-parameter. Apa perbedaannya? Ayo kita lihat dengan coding!

 */

public class cobaGenerics {
    private String name;
    private double mass;

    public cobaGenerics(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public void print() {
        System.out.println("Planet " + name + ", mass: " + mass);
    }


}
