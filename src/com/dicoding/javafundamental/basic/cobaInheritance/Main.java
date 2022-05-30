package com.dicoding.javafundamental.basic.cobaInheritance;

public class Main {

    public static void main(String[] args){

        Hewan hewan = new Hewan(); // memanggil parent class constructor Hewan dari class Hewan

        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object)); // True
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan)); // True
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing)); // False

        hewan.makan(); // manggil object dari parent class

        System.out.println();

        System.out.println("Kucing");
        Kucing kucing = new Kucing("Persian", "Subtropic"); // memanggil constructor Kucing dari class Kucing turunan class Hewan
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object)); // True
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan)); // True
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing)); // True
        kucing.makan(); // ngewarisin object dari hewan
        kucing.makan("Kucing"); // Overriding class kucing
        kucing.makan("Kucing", "Ikan"); // overloading class Kucing
        System.out.println(kucing.toString());
        System.out.println();

        System.out.println("Kucing 1");
        Kucing kucing1 = new Kucing("Anggora", "Subtropic"); // memanggil constructor Kucing dari class Kucing turunan class Hewan
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing1 instanceof Object)); // True
        System.out.println("Apakah kucing1 IS-A Hewan -> " + (kucing1 instanceof Hewan)); // True
        System.out.println("Apakah kucing1 IS-A Kucing -> " + (kucing1 instanceof Kucing)); // True
        kucing1.makan(); // ngewarisin object dari hewan
        kucing1.makan("Kucing"); // Overriding class kucing
        kucing1.makan("Kucing", "Ikan"); // overloading class Kucing
        System.out.println(kucing1.toString());
        System.out.println();

        System.out.println("Kucing 2");
        Kucing kucing2 = new Kucing("Serbian", "Taiga"); // memanggil constructor Kucing dari class Kucing turunan class Hewan
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing2 instanceof Object)); // True
        System.out.println("Apakah kucing2 IS-A Hewan -> " + (kucing2 instanceof Hewan)); // True
        System.out.println("Apakah kucing2 IS-A Kucing -> " + (kucing2 instanceof Kucing)); // True
        kucing2.makan(); // ngewarisin object dari hewan
        kucing2.makan("Kucing"); // Overriding class kucing
        kucing2.makan("Kucing", "Ikan"); // overloading class Kucing
        System.out.println(kucing2.toString());
        System.out.println();

        System.out.println("Kucing 3");
        Kucing kucing3 = new Kucing("Serbian", "Subtropic"); // memanggil constructor Kucing dari class Kucing turunan class Hewan
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing3 instanceof Object)); // True
        System.out.println("Apakah kucing3 IS-A Hewan -> " + (kucing3 instanceof Hewan)); // True
        System.out.println("Apakah kucing3 IS-A Kucing -> " + (kucing3 instanceof Kucing)); // True
        kucing3.makan(); // ngewarisin object dari hewan
        kucing3.makan("Kucing"); // Overriding class kucing
        kucing3.makan("Kucing", "Ikan"); // overloading class Kucing
        System.out.println(kucing3.toString());
        System.out.println();

        // Kalo ras nya sama dia bakal return true
        System.out.println("kucing equals kucing1 ? " + kucing.equals(kucing1));
        System.out.println("kucing equals kucing2 ? " + kucing.equals(kucing2));
        System.out.println("kucing1 equals kucing2 ? " + kucing1.equals(kucing2));
        System.out.println("kucing3 equals kucing ? " + kucing3.equals(kucing));
        System.out.println("kucing3 equals kucing1 ? " + kucing3.equals(kucing1));
        System.out.println("kucing3 equals kucing2 ? " + kucing3.equals(kucing2));

        System.out.println();
        System.out.println("Polymorphism");
        Object o = new Kucing("Angora", "Liar"); // kucing adalah Object
        Hewan h = new Kucing("Kampung", "Liar"); // kucing adalah Hewan
        Kucing k = new Kucing("Persia", "Liar"); // kucing adalah Kucing, pastinya :)

        //o.makan(); -> error, karena method makan() tidak ada di class Object
        h.makan();
        k.makan();
        Object object = k; // bisa langsung diassign
        Hewan hewanK= k; // bisa langsung diassign
        //object.makan(); -> error, karena method makan() tidak ada di class Object
        hewanK.makan();

        Kucing kucingK = (Kucing) h; // tidak bisa langsung diassign, perlu casting
        kucingK.makan();

        System.out.println();

        // Kebawah akan error
        // Gabisa dicast karena harimau berada di class parent, karena class parent tidak bisa cast class turunannya

        //Hewan harimau = new Hewan();
        //Kucing anggora = (Kucing) harimau; // compile OK tetapi runtime error ClassCastException

        // begitupun kalo kita buat interface Binatang yg di implement ke class Hewan
        // Binatang kijang = new Hewan();
        // Kucing anggora = (Kucing) kijang; // compile OK tetapi runtime error ClassCastException


        Mamalia mamalia = new Kucing("Angora", "Subtropis");
        Kucing angora = (Kucing) mamalia; // bisa di cast karena dia implementasi ke interface mamalia
        angora.makan("Kucing");


    }

}

/*

Sekilas penggunaan Inheritance dan interface mirip-mirip. 
Keduanya sama-sama akan menurunkan field/method. Lalu apa 
bedanya antara Inheritance dan interface? Hal ini sering 
ditanyakan dalam interview programmer Java :) Jawaban yang 
sering dilontarkan adalah “interface menggunakan Implements 
sedangkan Inheritance menggunakan extends.”

Sebenarnya, jawaban tersebut tidak cocok. Alih-alih, jawaban 
tersebut cocok untuk pertanyaan bagaimana cara menggunakan 
interface dan menggunakan Inheritance.

Konsep inheritance digunakan untuk abstraksi dari yang paling
umum ke yang lebih spesifik. Misalnya class Hewan adalah 
bentuk yang umum, lalu class Kucing adalah turunannya 
yang lebih spesifik.

Sedangkan interface digunakan sebagai kontrak atau aturan. 
Class yang menerapkan suatu interface wajib override semua
method dari interface tersebut. Artinya class tersebut harus 
mengikuti aturan atau spesifikasi yang ada di interface.

Sampai sini, Anda sudah paham perbedaan Inheritance dan Interface? 
Ingat saja kata kuncinya inheritance adalah abstraksi 
sedangkan interface adalah kontrak.

*/

