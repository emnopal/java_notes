// this is inherit class from class Hewan

/*

Ada kalanya metode yang diwariskan perlu diubah sesuai
kebutuhan spesifik dari sub-class tersebut. Perubahan
dapat dilakukan dengan 2 cara yaitu overriding dan
overloading. Overriding adalah pembuatan metode baru
pada subclass yang sama persis dengan superclassnya,
sedangkan overloading adalah pembuatan metode baru
pada subclass yang sama dengan method superclass namun parameternya berbeda.

 */

package com.dicoding.javafundamental.basic.cobaInheritance;

public class Kucing extends Hewan implements Mamalia{

    private String ras;
    private String habitat;

    // Construct Kucing
    public Kucing(String ras, String habitat){
        super(); // akan tetap memanggil constructor dari parent Class (parent Class = Hewan)
        System.out.println("Construct Kucing");
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Kucing ras: " + ras + ", habitat: " + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kucing) {
            Kucing other = (Kucing) obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }

    // Overriding dan overloading class Kucing
    public void makan(String hewan){ // Overriding
        System.out.println(hewan + " sedang makan..");
    }

    public void makan(String hewan, String makanan){ // Overloading
        System.out.println(hewan + " sedang makan " + makanan);
    }

}
