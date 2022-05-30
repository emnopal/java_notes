package com.dicoding.javafundamental.basic.cobaPangkat;

public class cobaPangkat {

    private int pangkat = 1;

    // yang loop gabisa float
    public int pangkatLoop(int x, int n){
        for(int i = 1; i <= n; i++){
            pangkat *= x;
        }
        return pangkat;
    }

    public int pangkatRecursive(int x, int n){
        if (n < 1){
            return 1;
        }
        return x*pangkatRecursive(x, n-1);
    }

}
