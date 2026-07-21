package Abstraction.ExceptionHandling;

import java.util.Scanner;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Get the size of the array
            System.out.println("Enter the number of elements in the array");
            String sizeInput = scanner.nextLine();
            int n = Integer.parseInt(sizeInput);

            // 2. Initialize the array and get elements
            int[] arr = new int[n];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < n; i++) {
                String elementInput = scanner.nextLine();
                arr[i] = Integer.parseInt(elementInput);
            }

            // 3. Get the target index to access
            System.out.println("Enter the index of the array element you want to access");
            String indexInput = scanner.nextLine();
            int index = Integer.parseInt(indexInput);

            // 4. Access the element and print success message
            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");

        } catch (NumberFormatException e) {
            // Handles non-integer user inputs
            System.out.println("java.lang.NumberFormatException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles out-of-bounds indices
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } finally {
            scanner.close();
        }
    }
}
