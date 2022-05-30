package com.dicoding.javafundamental.basic;

public class cobaArray {
    public static void main(String[] args){

        // Penulisan Array di Java

        // Cara 1
        // int arrA[] = new int[10]; C style array

        // Cara 2
        // int[] arrB = new int[10]; Java style array

        // Cara 3
        // int arrC[] = new int[]{/* Array kosong */}; C style array

        // Contoh

        // int arr[] = new int[]{10,9,12,4,5,6,3,1,7,9,0}; this is C style array
        // or
        //int arr[] = {10,9,12,4,5,6,3,1,7,9,0}; java style array
        int[] arr = new int[]{10,9,12,4,5,6,3,1,7,9,0};
        System.out.println(arr[0]); // will print 1st element of arr[]
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] newArr = new int[4];
        System.out.println(newArr[0]); // will print 0 since int[4] is zero (default value of int) 4 times
        System.out.println(newArr[3]); // idem

        // inisialisasi array
        newArr[0] = 1;
        newArr[1] = 2;
        newArr[2] = 3;
        newArr[3] = 4;
        //newArr[4] = 5; will be error since length of array only 4
        System.out.println(newArr[0]); // will print 1 since int[0] is filled by 1
        System.out.println(newArr[3]); // idem
        //System.out.println(newArr[4]); // will be error since length of array only 4

        // multidimensional array
        // [][] = [] <- array dimension [] <- member of array dimension
        int[][] multiArray = new int[][]{{1,2,3,4},{5,4,2,4}};
        System.out.println(multiArray[0][0]);
        System.out.println(multiArray[0][1]);
        System.out.println(multiArray[0][2]);
        System.out.println(multiArray[0][3]);
        System.out.println(multiArray[1][0]);
        System.out.println(multiArray[1][1]);
        System.out.println(multiArray[1][2]);
        System.out.println(multiArray[1][3]);

        multiArray[0][0] = 7;
        multiArray[0][1] = 8;
        multiArray[0][2] = 9;
        multiArray[0][3] = 10;
        multiArray[1][0] = 11;
        multiArray[1][1] = 12;
        multiArray[1][2] = 13;
        multiArray[1][3] = 14;

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 4; j++){
                System.out.println(multiArray[i][j]);
            }
        }


    }
}
