package com.dicoding.javafundamental.basic.generics;

import java.util.ArrayList;
import java.util.Collection;

public class wildcartGeneric {

    // mengunakan wildcards
    static void print(Collection<?> col) {
        for (Object o : col) {
            System.out.println(o);
        }
    }

    // menggunakan generic methods
    static <T> Collection arrayToCollection(T[] a) {
        Collection<T> c = new ArrayList();
        for (T o : a) {
            c.add(o);
        }
        return c;
    }

    public static void main(String[] args) {
        String[] sa = { "Happy", "Coding" };
        Number[] ba = { 1, 2, 3 };
        Collection r = arrayToCollection(sa);
        Collection j = arrayToCollection(ba);
        print(r);
        print(j);
    }

    /*

    Pada metode print(), kita menggunakan wildcard sebagai parameternya agar dapat
    bekerja dengan beragam tipe data. Penggunaan wildcard juga dapat kita lakukan
    saat menuliskan kode metode generic class yang tidak bergantung pada tipe parameternya.
    Misalnya, List.size atau List.clear. Sementara pada metode arrayToCollection,
    kita mengembalikan nilai dengan tipe Collection dan untuk tipe parameter kita gunakan T.
    Tanpa harus menuliskan <String>arrayToCollection(sa). Fitur ini dinamakan type inference,
    memungkinkan  kita untuk memanggil generic method sebagai metode biasa, tanpa menentukan jenis antara kurung sudut.

     */

}
