package com.keerthi.arrays;

import java.util.Arrays;

public class Assignment6 {
    public static void main(String[] args) {

        int[] arr = {50, 20, 70, 10, 40};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}