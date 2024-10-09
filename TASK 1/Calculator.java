import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number:\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
        int operation = scanner.nextInt();

        System.out.println("Enter first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double number2 = scanner.nextDouble();

        double result;

        switch (operation) {
            case 1:
                result = number1 + number2;
                System.out.println("Result : " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Result : " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Result : " + result);
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result : " + result);
                } else {
                    System.out.println("Can't divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation! \nPlease choose 1, 2, 3, or 4.");
                break;
        }

        
    }
}


