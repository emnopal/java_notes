package com.dicoding.javafundamental.basic.cobaPackage;

public class cobaPangkat{
    
    public static int pangkat(int x, int n){

        int pows = 1;

        for (int i = 1; i <= n; i++){
            pows = pows*x;
        }

        return pows;

    }

    public static void main(String[] args){
        
        int x = 2;
        int n = 2;
        
        int hasil = pangkat(x, n);
        
        System.out.println(hasil);
    
    }
}