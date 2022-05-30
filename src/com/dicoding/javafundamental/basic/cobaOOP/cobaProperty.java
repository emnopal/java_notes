package com.dicoding.javafundamental.basic.cobaOOP;

public class cobaProperty {

    // Property

    // Inisiasi dengan nilai default
    int waktu;

    // Inisiasi dengan nilai inisial
    // Setter
    double pajak = 32.5;
    int umur = 16;
    double pembayaran = pajak*umur;

    // Constructor dan setter
    public cobaProperty(double pajak, int umur){
        this.pajak = pajak; // akses ke atribut pajak kelas cobaProperty
        this.umur = umur; // akses ke atribut umur kelas cobaProperty
    }

    public void cobaMetode(){
        System.out.println("Coba metode");
    }

    // Metode

    public void cekProperty(){

        if (umur < 16){
            System.out.println("Umur masih terlalu dini");
        } else{
            System.out.println("Anda Harus Bayar Pajak Sebesar: " + pajak);
        }

    }

    // Getter
    public int getUmur() {
        return umur;
    }

    public double getPajak(){
        return pajak;
    }

    public double getPembayaran(){
        return pembayaran;
    }

    // COntoh explisit setter dan getter

    public void setWaktu(int waktu){
        this.waktu = waktu;
    }

    public int getWaktu(){
        return waktu;
    }

}
