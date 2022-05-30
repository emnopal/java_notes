package com.dicoding.javafundamental.basic.cobaAccessModifier;

public class mainCobaStatic {
    public static void main(String[] args){

        System.out.println("Metode Static Variable");

        System.out.println(cobaStatic.varA); // di main class, gaperlu buat object
        System.out.println(cobaStatic.varB); // di main class, gaperlu buat object

        // Metode static hanya menghasilkan 1 return

        System.out.println("Sebelum: "+cobaStatic.varC); // sebelum di loop

        for (int i = 0; i < 10; i++){
            new cobaStatic();
        }

        System.out.println("Sesudah: "+cobaStatic.varC); // setelah di loop

        System.out.println();
        System.out.println("Metode Static Method");
        System.out.println(cobaStatic.getvarD()); // gaperlu buat object

        // System.out.println(cobaStatic.varE); // final gabisa diakses diluar class

        System.out.println("Metode Final");
        // Cara akses final variable atau apalah
        final cobaStatic cobaFinal = new cobaStatic();
        System.out.println(cobaFinal.varE);

    }
}
