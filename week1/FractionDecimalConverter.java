import java.util.Scanner;

public class FractionDecimalConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the numerator
        System.out.print("Enter the numerator: ");

        // Read the numerator as an integer
        int numerator = scanner.nextInt();

        // Prompt the user to enter the denominator
        System.out.print("Enter the denominator: ");

        // Read the denominator as an integer
        int denominator = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Check if the denominator is not zero
        if (denominator != 0) {
            // Calculate the decimal equivalent of the fraction
            double decimalEquivalent = (double) numerator / denominator;

            // Display the result
            System.out.println("Decimal Equivalent: " + decimalEquivalent);
        } else {
            System.out.println("Error: Denominator cannot be zero.");
        }
    }
}
