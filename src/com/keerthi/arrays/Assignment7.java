package com.keerthi.arrays;

import java.util.Arrays;

public class Assignment7 {
    public static void main(String[] args) {

        int[] arr = {12, 34, 12, 45, 67, 89};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
