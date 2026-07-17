package com.keerthi.arrays;

import java.util.Arrays;

public class Assignment5 {
    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 5, 90, 20};

        Arrays.sort(arr);

        System.out.println("Smallest: " + arr[0] + " " + arr[1]);
        System.out.println("Largest: " + arr[arr.length - 2] + " " + arr[arr.length - 1]);
    }
}
