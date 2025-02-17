import java.util.*;

class Addition {
    public double add(double a, double b) {
        return a + b;
    }
}

class Subtraction {
    public double subtract(double a, double b) {
        return a - b;
    }
}

class Multiplication {
    public double multiply(double a, double b) {
        return a * b;
    }
}

class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

class Modulus {
    public double modulus(double a, double b) {
        return a % b;
    }
}

class Logarithm {
    public double log(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Logarithm of non-positive numbers is undefined.");
        }
        return Math.log(a);
    }
}

class Exponential {
    public double exp(double a) {
        return Math.exp(a);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");

        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Logarithm");
            System.out.println("7. Exponential");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();

            if (choice == 8) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            double num2 = 0;
            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            }

            switch (choice) {
                case 1:
                    Addition addition = new Addition();
                    System.out.println("Result: " + addition.add(num1, num2));
                    break;
                case 2:
                    Subtraction subtraction = new Subtraction();
                    System.out.println("Result: " + subtraction.subtract(num1, num2));
                    break;
                case 3:
                    Multiplication multiplication = new Multiplication();
                    System.out.println("Result: " + multiplication.multiply(num1, num2));
                    break;
                case 4:
                    Division division = new Division();
                    try {
                        System.out.println("Result: " + division.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    Modulus modulus = new Modulus();
                    System.out.println("Result: " + modulus.modulus(num1, num2));
                    break;
                case 6:
                    Logarithm logarithm = new Logarithm();
                    try {
                        System.out.println("Result: " + logarithm.log(num1));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    Exponential exponential = new Exponential();
                    System.out.println("Result: " + exponential.exp(num1));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
