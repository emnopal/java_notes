package com.dicoding.javafundamental.basic.cobaOOP;

    /*

    Class merupakan bagian dari turunan obyek yang berfungsi sebagai wadah
    atau cetakan untuk mendeskripsikan behavior/state yang didukung obyeknya.
    Behavior adalah tingkah laku yang dapat dilakukan oleh obyek. Behavior
    adalah kelakuan atau sifat dari obyek,  misalnya lampu bisa dimatikan atau dinyalakan.
    State adalah kondisi atau keadaan yang bisa terjadi pada obyek
    misalnya lampu dapat memiliki state nyala atau mati.

    Di kehidupan nyata kita mungkin sering menemukan banyak obyek, akan tetapi beberapa
    di antaranya memiliki kemiripan. Mungkin ada banyak kucing yang ada di dunia ini.
    Semua sama-sama memiliki bentuk yang sama. Bila diperhatikan ada banyak jenis kucing,
    mulai dari warna, bentuk hingga ras. Dalam aturan orientasi obyek, dapat dikatakan bahwa jenis,
    warna dan ras kucing di seluruh belahan dunia ini adalah sebuah kelas instance dari
    obyek yang dikenali sebagai kucing.

    Contoh dibawah adalah contoh Class dengan nama cobaClass

     */

public class cobaClass {

    // Constructor

    /*

    Constructor adalah method yang secara default sudah terbentuk ketika kelas dibuat.
    Ketika suatu kelas dibuat (instansiasi) maka konstruktor akan terpanggil juga.
    Constructor harus memiliki nama yang sama dengan nama kelasnya. Kegunaan Constructor:

    1. Memberikan nilai awal terhadap suatu data atau obyek
    2. Mengalokasikan ruang sebuah kelas dalam obyek

     */

    // Tipe Construktor di Java

    /*

    No-argument constructor adalah constructor default di java

    No-argument constructor, apabila kita tidak mendeklarasikan konstruktor dalam suatu kelas,
    kompiler Java akan membuat default constructor(tanpa parameter) dan pada body constructor
    tersebut kosong. Sementara jika kita mendeklarasikan konstruktor tanpa paramter,
    baik menuliskan kode pada body-nya atau tidak, maka itu bukan default constructor.
    Itu adalah no-argument constructor.

    Berikut ini adalah contoh no-argument constructor pada suatu kelas:

    public class namaClass{
        public namaClass(){
            // ini adalah contoh no-argument constructor
        }
    }

     */

    /*

    Parameterized constructor, konstruktor yang memiliki parameter untuk menginisiasi atau memberikan
    nilai awal data dengan nilai yang kita tentukan. Berikut ini adalah contoh
    parameterized constructor pada suatu kelas:

    public class namaClass{

        String memberA;
        int memberB;

        public namaClass(String A, int B){

            memberA = A;
            memberB = B;

        }
    }


     */

    // Berikut ini adalah contoh dari penerapan class

    String nama;
    int umur;
    double berat_badan;

    public cobaClass(String cobaNama){
        nama = cobaNama;
    }

    public void cobaClassUmur(int cobaUmur){
        umur = cobaUmur;
    }

    public void cobaClassBB(double BB){
        berat_badan = BB;
    }

    public void cetakCoba(){

        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("Berat Badan : " + berat_badan + " kg");

    }

    public double hitungUmurBB(){

        return umur*berat_badan;

    }

    public double bayarPajak(int jumlah_pajak){

        return ((umur*berat_badan)/(jumlah_pajak))*1000;

    }

}
