package Abstraction.ExceptionHandling;

import java.util.Scanner;

//User-defined Exception
class InvalidCountryException extends Exception {

 InvalidCountryException() {
     super();
 }

 InvalidCountryException(String message) {
     super(message);
 }
}

//Main Class
public class UserRegistration {

 void registerUser(String username, String userCountry)
         throws InvalidCountryException {

     if (!userCountry.equalsIgnoreCase("India")) {
         throw new InvalidCountryException(
                 "User Outside India cannot be registered");
     } else {
         System.out.println("User registration done successfully");
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Username: ");
     String username = sc.nextLine();

     System.out.print("Enter Country: ");
     String country = sc.nextLine();

     UserRegistration user = new UserRegistration();

     try {
         user.registerUser(username, country);
     } catch (InvalidCountryException e) {
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}