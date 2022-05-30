package com.dicoding.javafundamental.basic;

import java.util.*;

class Planets{
    private String name;
    private double mass;
    public Planets(String name, double mass){
        this.name = name;
        this.mass = mass;
    } // Constructor
    @Override // Decorator
    public String toString(){
        return "Planet: " + name + ", mass: " + mass;
    }
}

public class cobaCollections {

    // Metode array yang lama
    // Metode ini statis
    public static void metodeArray(){

        String[] nama = new String[2];

        // Deklarasi
        nama[0] = "Agus";
        nama[1] = "Budi";
        // nama[2] = "Yani"; // Bakal Throw Exception
                          // Index 2 out of bounds for length 2

        for (String s : nama) {
            System.out.println(s);
        }

    }

    // Metode array yang baru
    // Metode ini dinamis
    public static void cobaList(){

        /*

        List adalah suatu Collection di mana data yang masuk akan disimpan secara teratur.
        List mempunyai index berdasarkan urutan objek yang dimasukkan ke dalam List.
        Objek di dalam List bisa duplikat artinya objek yang sama bisa dimasukkan beberapa
        kali ke dalam List dan akan mempunyai index yang berbeda. Objek dikatakan sama jika
        dibandingkan menggunakan method equals() menghasilkan nilai true. Hal ini akan
        berbeda dengan Set yang akan kita bahas berikutnya. Salah satu implementasi dari
        interface List adalah class ArrayList. ArrayList mirip dengan Array hanya saja
        ArrayList ukurannya tidak tetap atau fleksibel.

         */

        // Deklarasi array

        List<String> planet = new ArrayList<>();

        // Pake metode add()
        planet.add("Matahari");
        planet.add("Merkurius");
        planet.add("Venus");
        planet.add("Bumi");
        planet.add("Mars");
        planet.add("Jupiter");

        System.out.println(planet);

        // untuk length diganti size() kalo pake arraylist
        for (String value : planet) {
            System.out.println(value); // kalo mau liat data di planet harus pake get()
        }

        // Sekarang kalo kita mau hapus objek di list
        System.out.println("Setelah menghapus objek " + planet.get(0));

        planet.remove("Matahari");

        for (String s : planet) { // Metode loop yang lain
            System.out.println(s); // kalo mau liat data di planet harus pake get()
        }

    }

    // Metode set
    public static void cobaSet(){

        /*

        Set mirip dengan List hanya saja objek di dalam Set tidak bisa diduplikasi.
        Yang artinya jika objek yang sama dimasukkan beberapa kali ke dalam Set maka
        Set hanya akan menyimpan objek tersebut satu kali saja. Coba ingat kembali materi
        Inheritance bagian Overriding dan Overloading. Perbedaan lain antara Set dengan
        List adalah penyimpanan pada Set tidak teratur.

         */

        // Metode HsshSet
        Set<String> planet = new HashSet<>();

        // Pake metode add()
        planet.add("Matahari");
        planet.add("Merkurius");
        planet.add("Venus");
        planet.add("Bumi");
        planet.add("Mars");
        planet.add("Jupiter");

        System.out.println(planet);

        System.out.println("Ukuran set planet: " + planet.size());

        for (String s: planet){
            System.out.println(s); // akses objek planet
        }

        System.out.println("Setelah menghapus objek ");

        planet.remove("Matahari");
        System.out.println("Ukuran set planet: " + planet.size());

        for (Iterator s = planet.iterator(); s.hasNext(); ){ // looping menggunakan iterator
            System.out.println(s.next()); // akses objek planet
        }

    }

    // Metode Map
    // Kalo di python ini mirip sama dict
    public static void cobaMap(){

    /*

    Map adalah struktur data dalam bentuk pasangan key-value.
    Map sama dengan "Associative Array" dalam bahasa PHP atau "Dictionary" dalam bahasa Python dan Javascript.
    Objek disimpan di Map sebagai value menggunakan key yang harus unik dan harus berupa objek juga.
    Salah satu implementasi dari interface Map adalah class HashMap.

     */

        Map<String, Planets> planet = new HashMap(); // input datatype dia harus 2 <1. String, 2. Class>
        planet.put("key-1", new Planets("Mercury", 0.06)); // method put() untuk menambahkan objek ke Map
        planet.put("key-2", new Planets("Venus", 0.82));
        planet.put("key-3", new Planets("Earth", 1.00));
        planet.put("key-4", new Planets("Mars", 0.11));
        planet.put("key-4", new Planets("Mars-X", 0.11)); // menambahkan ke Map dengan key yang sama

        System.out.println(planet);

        System.out.println("Map planet awal: (size = "+ planet.size() + ")");
        for (String key: planet.keySet()) {
            System.out.println("\t " + key + " : " + planet.get(key));
        }

        planet.remove("key-2");

        System.out.println("Map planet akhir: (size = "+ planet.size() +")");
        for (Planets planets : planet.values()) { // looping value dari Map
            System.out.println("\t " + planets);
        }

    }

    public static void main(String[] args){

        System.out.println();
        System.out.println("Metode Array");
        metodeArray();

        System.out.println();
        System.out.println("Metode List");
        cobaList();

        System.out.println();
        System.out.println("Metode Set");
        cobaSet();

        System.out.println();
        System.out.println("Metode Map");
        cobaMap();

    }

}
