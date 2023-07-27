import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String input1 = scanner.next();
        if (!isNumeric(input1)) {
            System.out.println("[ERROR]Invalid input for the first number!");
            scanner.close();
            return;
        }
        int num1 = Integer.parseInt(input1);

        System.out.print("Enter the second number: ");
        String input2 = scanner.next();
        if (!isNumeric(input2)) {
            System.out.println("[ERROR]Invalid input for the second number!");
            scanner.close();
            return;
        }
        int num2 = Integer.parseInt(input2);

        System.out.print("Enter the arithmetic operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        scanner.close();

        Calculator calculator = new Calculator();

        int result;
        switch (operation) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("[ERROR]Invalid operation!");
                return;
        }

        System.out.println("Result is: " + result);
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private int add(int num1, int num2) {
        return num1 + num2;
    }

    private int subtract(int num1, int num2) {
        return num1 - num2;
    }

    private int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("[ERROR]Zero division is not allowed");
        }
        return num1 / num2;
    }

    private int multiply(int num1, int num2) {
        return num1 * num2;
    }
}
