import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation do you want to perform? ");
        char operation = scanner.next().charAt(0);

        if (operation == '+') {
            System.out.printf("%f + %f = %f", num1, num2, num1+num2);
        }

        else if (operation == '-') {
            System.out.printf("%f - %f = %f", num1, num2, num1-num2);
        }

        else if (operation == '*') {
            System.out.printf("%f * %f = %f", num1, num2, num1*num2);
        }

        else if (operation == '/') {
            if (num2 == 0) {
                System.out.println("Cannot divide by 0");
            }
            else {
                System.out.printf("%f / %f = %f", num1, num2, num1/num2);
            }
        }
        
        else {
            System.out.printf("%c is not a supported operation.", operation);
        }

        scanner.close();

    }
}