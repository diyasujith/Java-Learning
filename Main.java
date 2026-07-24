import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine(); //Not required as next.Double() and next() automatically skip leading whitespeaces and newlines to find valid token

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation do you want to perform? ");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2; 
                break;

            case '-':
                result = num1 - num2;
                break;
            
            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                    scanner.close(); //Closes scanner first before exiting main method
                    return; //Exits main method immediately
                } else {
                    result = num1 / num2;
                }
                break;

            default:
                System.out.printf("%c is not a supported operation.", operation);
                scanner.close(); //Closes scanner first before exiting main method
                return; //Exits main method immediately
        }

        System.out.printf("%f %c %f = %f", num1, operation, num2, result);

        scanner.close();

    }
}