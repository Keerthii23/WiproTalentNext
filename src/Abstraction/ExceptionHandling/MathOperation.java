package Abstraction.ExceptionHandling;
public class MathOperation {

    public static void main(String[] args) {

        try {

            if (args.length != 5) {
                System.out.println("Please enter exactly 5 integer values.");
                return;
            }

            int[] arr = new int[5];
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }

            double avg = (double) sum / arr.length;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);

        } catch (NumberFormatException e) {
            System.out.println("Please enter only integer values.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception.");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

    }
}
