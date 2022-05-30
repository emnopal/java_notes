package com.dicoding.javafundamental.basic;

public class coba {

    /*
    Energy of photon, E = hbar omega
    hbar = h/2pi
     */

    final double pi;
    final double planck_constant;

    {
        planck_constant = 6.626e-34;
        pi = 3.14159265359;
    }

    final double hbar(){
        return planck_constant*pi;
    }

    static double energy(double omega){
        final coba hbar = new coba();
        return hbar.hbar()*omega;
    }

    public static void main(String[] args){

        double omega = 12.5;
        double result = energy(omega);
        System.out.println(result);

    }

}
