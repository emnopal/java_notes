package com.dicoding.javafundamental.basic;

public class isArraySorted {

    public static boolean ArraySorted(int[] arr){
        boolean sorted_array = true;
        for (int i = 1; i < arr.length +1; i++){
            if (arr[i - 1] > arr[i]) {
                sorted_array = false;
                break;
            }
        }
        return sorted_array;
    }

    public static void main(String[] args){
        int[] arr = {3,2,10,9,5,4,2,3,1,9,6,5,1,12,14,1,4,5};

        boolean result = ArraySorted(arr);

        System.out.println(result);
    }


}
