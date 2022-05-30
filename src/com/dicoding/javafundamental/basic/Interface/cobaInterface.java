package com.dicoding.javafundamental.basic.Interface;

/*

Pada bahasa pemrograman Java interface sangat mirip dengan kelas,
tapi tanpa atribut kelas dan memiliki metode yang dideklarasikan
tanpa isi. Deklarasi metode pada sebuah interface dapat
diimplementasikan oleh kelas lain. Sebuah kelas dapat mengimplementasikan
lebih dari satu interface. Kelas ini akan mendeklarasikan metode
pada interface yang dibutuhkan oleh kelas itu sekaligus mendefinisikan
isinya pada kode program. Metode pada interface yang diimplementasikan
pada suatu kelas harus sama persis dengan yang ada pada interface tersebut.
Property/Field di interface akan menjadi static final atau konstanta.
Method dan field di interface akan selalu bersifat public

 */

public interface cobaInterface {


    /*

    this will be error

    public void func1(){
        System.out.println("Test");
    }

    Error: Interface abstract methods cannot have body

    */

    // this avoiding error due to interface purposed

    // Penulisan yang tidak efektif
    // public static final String str1 = "This is test"; // karena interface variable selalu public, static dan final
    // public void func1(); // karena interface // karena interface function selalu public
    // Kemudian di code convention java dijelaskan bahwa penulisan variabel harus huruf besar
    // Penulisan yang efektif

    String STR1 = "This is test";
    void func1();

}
