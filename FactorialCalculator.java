import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Get the user's input for the non-negative integer
        int number = getNonNegativeInteger();
        
        // Calculate the factorial of the entered number
        long factorial = calculateFactorial(number);
        
        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Method to get a non-negative integer input from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        
        // Validate the input to ensure it's a non-negative integer
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid non-negative integer.");
            System.out.print("Enter a non-negative integer: ");
            scanner.next();  // Discard the invalid input
        }
        
        int input = scanner.nextInt();
        
        // Ensure the input is non-negative
        while (input < 0) {
            System.out.println("Input must be a non-negative integer.");
            System.out.print("Enter a non-negative integer: ");
            input = scanner.nextInt();
        }
        
        return input;
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        // Handle the base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        
        // Calculate the factorial using a loop
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}
