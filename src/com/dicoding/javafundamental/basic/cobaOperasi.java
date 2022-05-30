package com.dicoding.javafundamental.basic;

public class cobaOperasi {
    public static void main(String[] args){

        // Operator Assignment
        System.out.println("Operator Assignment");
        int a = 10;
        double b = 0.01;
        String c = "This is String";
        System.out.printf("Tipe data int: %d, Tipe data double: %f, Tipe data string: %s\n", a,b,c);

        // Operator Aritmatika
        System.out.println("\nOperator Aritmatika");
        double hasil = a+b;
        System.out.printf("Hasil Penjumlahan %d dan %f adalah %f\n",a,b,hasil);

        // Operator Unary
        System.out.println("\nOperator Unary");

        int unary_plus = +a;

        int unary_minus = a;
        unary_minus = -unary_minus;

        int unary_peningkatan = a;
        unary_peningkatan++;

        int unary_pengurangan = a;
        unary_pengurangan--;

        boolean sukses = false;

        System.out.printf("Unary Plus: %d\n", unary_plus);
        System.out.printf("Unary Minus: %d\n", unary_minus);
        System.out.printf("Unary Peningkatan: %d\n", unary_peningkatan);
        System.out.printf("Unary Pengurangan: %d\n", unary_pengurangan);
        System.out.println("Unary Logika: " + !sukses);

        // Operasi Equality dan Relational
        System.out.println("\nOperator Equality dan Relational");
        int d = 2;
        int e = 5;
        boolean not_equal = d != e;
        boolean equal = d == e;
        boolean greater_than = d > e;
        boolean less_than = d < e;
        boolean greater_than_equal = d >= e;
        boolean less_than_equal = d <= e;

        System.out.println("Operator Tidak Sama Dengan != : "+ not_equal);
        System.out.println("Operator Sama Dengan == : "+ equal);
        System.out.println("Operator Lebih Besar > : "+ greater_than);
        System.out.println("Operator Lebih Kecil < : "+ less_than);
        System.out.println("Operator Lebih Besar Sama Dengan >= : "+ greater_than_equal);
        System.out.println("Operator Lebih Kecil Sama Dengan <= : "+ less_than_equal);

        // Operator Conditional
        System.out.println("\nOperator Conditional");
        boolean or_operator = d == 2 || e != 5;
        boolean and_operator = d == 2 && e != 5;
        System.out.println("Contoh Operator Conditional OR: "+ or_operator);
        System.out.println("Contoh Operator Conditional AND: "+ and_operator);

    }
}


/*

Method Overloading
Java mengizinkan menggunakan dua atau lebih fungsi dengan nama yang sama dalam satu kelas.
Namun, yang membedakan adalah parameternya. Konsep ini disebut dengan method overloading.

 */