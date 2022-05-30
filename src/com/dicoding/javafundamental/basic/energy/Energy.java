package com.dicoding.javafundamental.basic.energy;

public class Energy implements Const {

    @Override
    public double hbar() {
        return PI*PLANCK_CONST;
    }

    public double energy(double omega){
        return hbar()*omega;
    }

}
