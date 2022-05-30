package com.dicoding.javafundamental.basic.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class main {

    /*

    Berdasarkan materi Inheritance, bukankah class String dan class Planet adalah turunan dari class Object?

    Ya benar tetapi List<String> dan Collection<Planet> bukan turunan (subtype) dari Collection<Object>
    atau Collection<Object> bukan supertype dari Collection<Planet> dan List<String>. Lalu apa supertype
    dari semua tipe Collection? Hal ini dikenal dengan nama wildcard type, ditulis dengan syntax
    Collection<?> yang artinya collection of unknown

     */

    public static void print(Collection<?> collection) {
        for (Object o : collection) {
            System.out.println(o);
        }
    }

    public static void main(String[] args){

        // Generics

        // tanpa type-parameters
        List tanpa = new ArrayList();
        tanpa.add("Tanpa Type Parameters"); // menampung objek String
        tanpa.add(new cobaGenerics("Mercury", 0.376)); // menampung objek cobaGenerics

        // Iterate objek tanpa
        /*for (Object o : tanpa) {
            cobaGenerics p = (cobaGenerics) o; // perlu type-casting dari Object ke Planet
            p.print();
        }*/ // bakalan error karena String sama cobaGenerics gak match

        // Dengan type-parameters
        List<cobaGenerics> dengan = new ArrayList();
        dengan.add(new cobaGenerics("Mercury", 0.376)); // menampung objek cobaGenerics
        dengan.add(new cobaGenerics("Venus", 1.254)); // Menampung Objek cobaGenerics
        //dengan.add("Dengan Type Parameters"); // Bakalan Error, variabel "dengan" tidak diijinkan menampung objek String

        // Iterate objek dengan
        for (cobaGenerics o: dengan){
            o.print(); // tidak perlu type-casting
        }

        /*

        Dari kode di atas terlihat List<cobaGenerics> dengan tidak diizinkan menampung objek selain cobaGenerics.
        Dalam kasus ini List<cobaGenerics> dengan lp dilindungi compile-time type safety di mana jika ada objek
        lain yang dimasukkan ke List<cobaGenerics> dengan . Tetapi dengan tipe selain cobaGenerics,
        seketika compile error, Artinya deteksilah lebih dahulu sebelum runtime (program dijalankan).
        Bandingkan dengan List tanpa yang bisa menampung objek String ataupun cobaGenerics (bahkan semua jenis objek).
        Sebagai contoh, kita ingin loop kedua List tersebut untuk memanggil method print dari class cobaGenerics.

        */

        // Wildcard
        List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");

        print(ls); // Apakah baris ini valid?

        Collection<cobaGenerics> cp = new ArrayList();
        cp.add(new cobaGenerics("Mercury", 0.06));
        cp.add(new cobaGenerics("Venus", 0.82));

        print(cp); // Apakah baris ini valid?

    }
}
