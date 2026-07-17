package com.keerthi.FlowControl;

public class AlphabetOrder {
    public static void main(String[] args) {

        char ch1 = 'b';
        char ch2 = 'a';

        if (ch1 < ch2) {
            System.out.println(ch1 + "," + ch2);
        } else {
            System.out.println(ch2 + "," + ch1);
        }
    }
}