import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                int result = 100 / num;
                System.out.println("100 divided by " + num + " gives " + result);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}

