package Abstraction.ExceptionHandling;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class PersonDetails {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                System.out.println("Usage: java PersonDetails <Name> <Age>");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age should be >=18 and <60.");
            }

            System.out.println("Name : " + name);
            System.out.println("Age  : " + age);
            System.out.println("Valid Person");

        } catch (NumberFormatException e) {
            System.out.println("Age must be a valid integer.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}