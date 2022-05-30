package com.dicoding.javafundamental.basic.cobaFactorial;

public class cobaFactorial {

    private int factorial = 1;

    public long factorialRecursive(int n){
        if (n <= 1){
            return factorial;
        }
        return n*factorialRecursive(n-1);
    }

    public long factorialLoop(int n){
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

}
