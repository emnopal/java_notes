package com.dicoding.javafundamental.basic.tigaFasa;

public class tigaFasaAir {

    public void fasaAir(int suhu){
        if (suhu < 0){
            System.out.println("Fasa air beku (Padat) di suhu: "+ suhu);
        } else if ((0 <= suhu) && (suhu <= 100)){
            System.out.println("Fasa air cairan (Cair) di suhu: "+ suhu);
        } else {
            System.out.println("Fasa air menguap (Uap) di suhu: "+ suhu);
        }
    }

}
