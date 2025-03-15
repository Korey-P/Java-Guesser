import java.util.Scanner;
import java.util.Random;

public class Guesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n0) Exit");
            System.out.println("1) Human Guesser");
            System.out.println("2) Computer Guesser");
            System.out.print("\nPlease enter 0-2: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                humanGuesser(scanner);
            } else if (choice == 2) {
                computerGuesser(scanner);
            }

        } while (choice != 0);

        scanner.close();
    }

    public static void humanGuesser(Scanner scanner) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("\nHuman Guesser Mode: Try to guess the number!");

        do {
            attempts++;
            System.out.print(attempts + ") Please enter a number: ");
            guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Too low...");
            } else if (guess > target) {
                System.out.println("Too high...");
            } else {
                System.out.println("Got it!\nVery good!");
            }
        } while (guess != target);
    }

    public static void computerGuesser(Scanner scanner) {
        int low = 1;
        int high = 100;
        int guess;
        int attempts = 0;
        String response;

        System.out.println("\nComputer Guesser Mode: Think of a number between 1 and 100.");
        System.out.println("The computer will try to guess it.");

        do {
            attempts++;
            guess = (low + high) / 2;
            System.out.print(attempts + ") I guess " + guess + "\nToo (H)igh, too (L)ow, or (C)orrect? ");
            response = scanner.next().toLowerCase();

            if (response.equals("h")) {
                high = guess - 1;
            } else if (response.equals("l")) {
                low = guess + 1;
            } else if (response.equals("c")) {
                System.out.println("Yay! The computer guessed your number in " + attempts + " attempts.");
            } else {
                System.out.println("Invalid input. Please enter H, L, or C.");
            }

        } while (!response.equals("c"));
    }
}
