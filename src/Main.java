import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Are you female? (true/false): ");
        boolean isFemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("Discount: 75%");
        } else if (isFemale) {
            System.out.println("Discount: 50%");
        } else if (age > 60 && !isFemale) {
            System.out.println("Discount: 25%");
        } else {
            System.out.println("No discount available");
        }

        // Close the Scanner to prevent resource leak
        input.close();
    }
}
