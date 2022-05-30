package com.dicoding.javafundamental.basic.cobaAccessModifier;

public class cobaStatic {

    /* static digunakan untuk mendeklarasikan variabel atau
     metode yang berdiri sendiri tanpa perlu instance
     dari suatu kelas. Ada dua macam non access
     modifier static yaitu static variable dan static methods.
     Dan perlu diketahui juga bahwa static variable hanya berjumlah satu,
     tak peduli berapapun obyek yang dibuat. */

    // Static Variable
    public static int varA = 12;
    public static String varB = "Print this";

    // Jumlah static method cuma satu doang
    public static int varC = 24;
    cobaStatic() {
        varC++;
    }

    public static int varD = 90;
    // Static Function
    protected static int getvarD(){
        return varD;
    }

    // Final Variable dan Method
    // Gabisa di ganggu gugat ataupun di ganti nilainya
    // dan gabisa diakses keluar class

    /* Final variabel hanya bisa diinisiasi sekali.
    Ini menandakan bahwa variabel yang sudah
    dideklarasikan final tidak dapat diganti dengan objek lainnya. */

    final int varE = 69;

    //private void ubahNilai(){
    //    varE = 24;  // bakalan error karena nilai varE gabisa diganggu-gugat
    //}


}
