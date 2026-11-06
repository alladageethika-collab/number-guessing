import java.util.Scanner;

public class InputValidator {

    // Read and validate the player's guess
    public static int readGuess(Scanner sc) {

        while (true) {

            System.out.print("Enter your guess (1-100): ");

            String input = sc.nextLine();

            try {
                int guess = Integer.parseInt(input);

                if (guess >= 1 && guess <= 100) {
                    return guess;
                }
                else {
                    System.out.println(
                        "Enter a number between 1 and 100."
                    );
                }

            }
            catch (NumberFormatException e) {
                System.out.println(
                    "Invalid input! Please enter an integer."
                );
            }
        }
    }

    // Ask whether the player wants to play again
    public static boolean playAgain(Scanner sc) {

        while (true) {

            System.out.print(
                "Do you want to play again? (yes/no): "
            );

            String choice = sc.nextLine().trim();

            if (choice.equalsIgnoreCase("yes") ||
                choice.equalsIgnoreCase("y")) {

                return true;
            }
            else if (choice.equalsIgnoreCase("no") ||
                     choice.equalsIgnoreCase("n")) {

                return false;
            }
            else {
                System.out.println(
                    "Please enter yes or no."
                );
            }
        }
    }
}
