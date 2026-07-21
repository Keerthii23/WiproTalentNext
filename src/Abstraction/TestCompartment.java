package Abstraction;
abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class: Please keep your ticket ready for inspection.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved only for women passengers.";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment: Please do not block the entrance.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment: Passengers are not allowed inside.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] coach = new Compartment[10];

        for (int i = 0; i < coach.length; i++) {

            int random = (int)(Math.random() * 4) + 1;

            switch (random) {
                case 1:
                    coach[i] = new FirstClass();
                    break;

                case 2:
                    coach[i] = new Ladies();
                    break;

                case 3:
                    coach[i] = new General();
                    break;

                case 4:
                    coach[i] = new Luggage();
                    break;
            }
        }

        System.out.println("Railway Compartments:");

        for (int i = 0; i < coach.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + coach[i].notice());
        }
    }
}