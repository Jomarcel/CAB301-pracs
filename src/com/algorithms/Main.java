package com.algorithms;

public class Main {

    public static void main(String[] args) {
        Binarysearch binarySearch = new Binarysearch();

        int arr[] = { 2, 3, 4, 10, 40 }; // dummy array
        int right = arr.length; // rightmost index of array
        int targetVal = 10; // value to find
        int left = 0;

        int result = binarySearch.binarySearch(arr, left,  right, targetVal);

        if (result == -1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index: " +  result);

        }

    }
}
