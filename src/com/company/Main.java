package com.company;


public class Main {

//    Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].

//    Input : arr[] = {10, 20, 80, 30, 60, 50,
//            110, 100, 130, 170}
//    x = 110;
//    Output : 6
//    Element x is present at index 6
//
//    Input : arr[] = {10, 20, 80, 30, 60, 50,
//            110, 100, 130, 170}
//    x = 175;
//    Output : -1
//    Element x is not present in arr[].
//

    public static void main(String[] args) {
        // write your code here
        int x = 3;
        int[] A = {9, 10, 100, 110, 17, 12, 7};
        int result = linearFind(A, x);

        if(result == -1){
            System.out.println("-1");
        }else {
            System.out.println("Element is present at " + result);
        }
    }

    private static int linearFind(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

}

//    The time complexity of the algorithm is O(n) because it is a linear execution.
