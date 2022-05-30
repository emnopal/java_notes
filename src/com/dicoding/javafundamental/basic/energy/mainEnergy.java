package com.dicoding.javafundamental.basic.energy;

public class mainEnergy {

    public static void main(String[] args){

        double omega = 12.5;

        Energy energy_planck = new Energy();
        double result = energy_planck.energy(omega);

        System.out.printf("Result: %s", Double.toString(result));

    }
}
