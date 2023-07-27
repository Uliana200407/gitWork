import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        int num1 = 10;
        int num2 = 5;

        int sum = calculator.add(num1, num2);
        int difference = calculator.subtract(num1, num2);
        int product = calculator.multiply(num1, num2);
        int quotient = calculator.divide(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        double number = 25.0;
        double sqrtResult = calculator.squareRoot(number);
        double powerResult = calculator.power(num1, num2);

        System.out.println("Square root of " + number + " is: " + sqrtResult);
        System.out.println(num1 + " raised to the power " + num2 + " is: " + powerResult);

        System.out.println("Enter the num to find the root from it:");
        String input3 = scanner.next();
        if (!isNumeric(input3)) {
            System.out.println("[ERROR]Invalid input for the number!");
            scanner.close();
            return;
        }
        int numInt = Integer.parseInt(input3);
        double numDouble = (double) numInt;
        double resultSquare = calculator.squareRoot(numDouble);
        System.out.println("Square root of " + numDouble + " is: " + resultSquare);
        scanner.close();
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
