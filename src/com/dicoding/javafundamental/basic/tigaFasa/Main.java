package com.dicoding.javafundamental.basic.tigaFasa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Suhu (der. C) = ");

        Scanner scanner = new Scanner(System.in);
        int suhu = scanner.nextInt();

        tigaFasaAir fasa = new tigaFasaAir();
        fasa.fasaAir(suhu);

    }
}
