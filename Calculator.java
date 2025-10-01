
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = sc.nextDouble();
        System.out.println("Enter second number:");
        double b = sc.nextDouble();
        System.out.println("Enter operation (+, -, *, /):");
        char op = sc.next().charAt(0);

        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0)
                    result = a / b;
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("Result: " + result);
    }
}
