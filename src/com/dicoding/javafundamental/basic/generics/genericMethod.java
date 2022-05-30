package com.dicoding.javafundamental.basic.generics;

import java.util.ArrayList;
import java.util.Collection;

public class genericMethod {

    /*static void arrayToCollection(Object[] a, Collection<?> c) {
        for (Object o : a) {
            c.add(o); // baris ini tidak valid
            baris ini tidak valid dikarenakan Collection<?> c adalah
            collection of unknown type dan kita menambahkan tipe Object o.
        }
    }*/

    // yg valid
    static <T> void arrayToCollection(T[] a, Collection<T> c) { // T sebagai object
        for (T o : a) {
            c.add(o); // baris ini valid
        }
    }

    /*

    Perhatikan penambahan huruf T. Kita bisa mengganti dengan huruf apapun, tetapi anjuran
    coding convention menggunakan huruf T, mengacu ke type. Cara penulisan kode seperti di
    atas dikenal dengan istilah Generic Methods.

     */

    public static void main(String[] args){

        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList();

        // T inferred to be Object
        arrayToCollection(oa, co);

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList();

        // T inferred to be String
        arrayToCollection(sa, cs);

        // T inferred to be Object
        arrayToCollection(sa, co);

        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList();

        // T inferred to be Number
        arrayToCollection(ia, cn);

        // T inferred to be Number
        arrayToCollection(fa, cn);

        // T inferred to be Number
        arrayToCollection(na, cn);

        // T inferred to be Object
        arrayToCollection(na, co);

        // compile-error
        // T inferred to be String which is incompatible
        //arrayToCollection(na, cs); // gabisa convert dari Number ke Collection<String>

    }

}
