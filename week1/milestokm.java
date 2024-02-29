import java.util.Scanner;

public class milestokm{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter miles
        System.out.print("Enter distance in miles: ");

        // Read the miles as a floating-point value
        double miles = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Convert miles to kilometers using the conversion factor
        double kilometers = miles * 1.60935;

        // Display the result
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}
