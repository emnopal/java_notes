package com.dicoding.javafundamental.basic;

public class cobaBinarySearch {

    public static int BinarySearch(int[] arr, int ele) {

        int size = arr.length - 1;
        int f_ele = 0;
        boolean sorted_array = true;

        for (int i = 1; i <= size; i++){
            if (arr[i - 1] > arr[i]) {
                sorted_array = false;
                break;
            }
        }

        if (!(sorted_array)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        while (f_ele <= size){
            int mid = f_ele + (size - f_ele) / 2;
            if (arr[mid] == ele){
                return mid;
            } if (arr[mid] < ele){
                f_ele = mid + 1;
            } else{
                size = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        //int[] arr = {3,2,10,9,5,4,2,3,1,9,6,5,1,12,14,1,4,5};
        int[] arr = {-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13};

        int result = BinarySearch(arr, 10);

        if (result != -1) {
            System.out.printf("Element found at index: %d", result);
        } else{
            System.out.println("Element not present");
        }
    }
}
