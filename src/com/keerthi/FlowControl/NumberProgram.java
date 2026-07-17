package com.keerthi.FlowControl;

public class NumberProgram {
	public static void main(String[] args) {
	int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    // Part A: Check Positive, Negative or Zero
    if (num1 > 0) {
        System.out.println("Positive");
    } else if (num1 < 0) {
        System.out.println("Negative");
    } else {
        System.out.println("Zero");
    }

    // Part B: Check if both numbers have the same last digit
    if (num1 >= 0 && num2 >= 0) {
        System.out.println(num1 % 10 == num2 % 10);
    } else {
        System.out.println("Both numbers should be non-negative.");
    }
}

}
