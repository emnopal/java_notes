// This is parent class


package com.dicoding.javafundamental.basic.cobaInheritance;

/*

Pada dasarnya setiap objek yang berbeda sering memiliki kesamaan
atau kemiripan tertentu. Kita ambil contoh kelas hewan. Misalnya,
kucing dan anjing memiliki kemiripan sebagai hewan. Kesamaan yang
dimiliki kucing dan anjing misalnya sama-sama hewan mamalia. Namun
suara atau cara komunikasi kucing dan anjing berbeda. Begitu juga
dengan hewan lain, misalnya harimau dan domba keduanya juga hewan
mamalia dengan suara serta komunikasi yang berbeda.

Dari contoh di atas bisa dipahami kalau kucing, anjing, harimau, dan
domba adalah hewan. Maka dalam bahasa Java kucing, anjing, harimau,
dan domba adalah turunan (inheritance) dari hewan. Pada pemrograman
berorientasi objek atau OOP, konsep inheritance menjadi salah satu
topik yang penting. Suatu objek diwariskan dengan menggunakan keyword
extends. Pada pemrograman Java setiap objek pada kenyataannya adalah
turunan dari class Object. Walaupun tidak secara eksplisit, ini
bisa dibuktikan dengan operator instanceof.

Jenis Inheritance Class:

Super Class atau Parent Class, kelas yang semua fiturnya di wariskan kepada kelas turunannya.

Sub Class atau Child Class, kelas turunan yang mewarisi semua fitur dari kelas lain. Sub class
dapat menambah field dan metodenya sendiri sebagai tambahan dari kelas yang memberi warisan.

Reusability, yaitu ketika kita ingin membuat kelas baru dan sudah ada kelas yang berisi kode yang
kita inginkan, kita bisa menurunkan kelas baru tersebut dari kelas yang sudah ada. Dengan begitu,
kita menggunakan kembali field dan metode dari kelas yang telah ada.

 */

public class Hewan implements Binatang{

    // Assign constructor
    public Hewan(){
        System.out.println("Construct Hewan");
    }

    public void makan() { // Base method
        System.out.println("Hewan sedang makan..");
    }

}
