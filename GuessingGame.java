import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        // create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // create a Random object for generating random numbers
        Random random = new Random();

        // generate a random number between 1 and 100
        int number = random.nextInt(100) + 1;

        // set the number of guesses allowed
        int guesses = 10;

        // set a boolean flag to indicate if the user has won or not
        boolean win = false;

        // print the welcome message
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("You have " + guesses + " guesses to find it.");

        // loop until the user runs out of guesses or wins
        while (guesses > 0 && !win) {
            // prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            // check if the guess is valid
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess. Please enter a number between 1 and 100.");
            } else {
                // decrement the number of guesses
                guesses--;

                // check if the guess is correct
                if (guess == number) {
                    // set the win flag to true
                    win = true;
                    // congratulate the user
                    System.out.println("Congratulations! You guessed the number in " + (10 - guesses) + " tries.");
                } else {
                    // give feedback to the user
                    if (guess > number) {
                        System.out.println("Your guess is too high.");
                    } else {
                        System.out.println("Your guess is too low.");
                    }

                    // check if the user still has guesses left
                    if (guesses > 0) {
                        System.out.println("You have " + guesses + " guesses left.");
                    } else {
                        System.out.println("Sorry, you have no more guesses. The number was " + number + ".");
                    }
                }
            }
        }

        // close the scanner object
        scanner.close();
    }
}
