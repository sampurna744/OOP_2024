import java.util.Scanner;

public class SquareProperties {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the square's side
        System.out.print("Enter the length of the square's side: ");

        // Read the side length as an integer
        int sideLength = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the perimeter and area of the square
        int perimeter = 4 * sideLength;
        int area = sideLength * sideLength;

        // Display the results
        System.out.println("Square Perimeter: " + perimeter);
        System.out.println("Square Area: " + area);
    }
}
