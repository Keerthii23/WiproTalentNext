package Abstraction.ExceptionHandling;
import java.util.Scanner;

class NegativeMarksException extends Exception {
    public NegativeMarksException(String msg) {
        super(msg);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String msg) {
        super(msg);
    }
}

public class StudentAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {

                int sum = 0;

                System.out.println("Enter marks for Student " + i);

                for (int j = 1; j <= 3; j++) {

                    System.out.print("Subject " + j + ": ");
                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0) {
                        throw new NegativeMarksException("Marks cannot be negative.");
                    }

                    if (mark > 100) {
                        throw new OutOfRangeException("Marks should be between 0 and 100.");
                    }

                    sum += mark;
                }

                double avg = (double) sum / 3;
                System.out.println("Average Marks = " + avg);
                System.out.println();
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter only integer values.");
        } catch (NegativeMarksException e) {
            System.out.println(e.getMessage());
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
