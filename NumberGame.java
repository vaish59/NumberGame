import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            int userGuess;

            System.out.println("Guess the number between " + minRange + " and " + maxRange + ":");

            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations !! You guessed the correct number in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

            } while (userGuess != targetNumber && attempts < maxAttempts);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (playAgain.equalsIgnoreCase("no")) {
                break;
            }

        } while (true);

        System.out.println("Game End. Your total score is: " + score);
        scanner.close();
    }
}