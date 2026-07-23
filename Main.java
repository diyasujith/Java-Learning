import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");  //print keeps the cursor on the same line
        String name = scanner.nextLine();   //Read a line of text
        System.out.println("Your name is "+name);

        System.out.printf("Hello %s. How old are you? ", name); //Formatted printing
        int age = scanner.nextInt();
        System.out.printf("You are %d years old. ", age);

        scanner.nextLine(); //Consumes leftover newline

        System.out.println("What programming language do you prefer? ");
        String lang = scanner.nextLine();

        System.out.printf("You prefer %s",lang);

        scanner.close();  //releases system resources and prevents potential memory leaks.
    }
}