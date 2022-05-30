package com.dicoding.javafundamental.basic;

public class cobaPerulangan {

    public static void ForLoop(){
        for (int i = 0; i <= 3; i++){
            System.out.printf("For Loop %d\n", i);
        }
    }

    public static void NestedLoop(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j <= i; j++){
                System.out.printf("Nested Loop %d%d\n", i,j);
            }
        }
    }

    public static void WhileLoop(){
        int init = 0;
        while (init <= 5){
            System.out.printf("While Loop %d\n", init);
            init++;
        }
    }

    public static void DoWhileLoop(){
        int init = 0;
        do {
            System.out.printf("Do While Loop %d\n", init);
            init++;
        } while (init <= 5);
    }

    public static void main(String[] args){

        System.out.println("For Loop");
        ForLoop();
        System.out.println();

        System.out.println("Nested Loop");
        NestedLoop();
        System.out.println();

        System.out.println("While Loop");
        WhileLoop();
        System.out.println();

        System.out.println("Do While Loop");
        DoWhileLoop();
        System.out.println();

    }

}
