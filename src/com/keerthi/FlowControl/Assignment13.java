package com.keerthi.FlowControl;

public class Assignment13 {

    public static void main(String[] args) {

        for (int num = 10; num <= 99; num++) {

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
