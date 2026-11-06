⁠ java
import java.util.Scanner;

public class GameSession {

    private Scanner sc;

    // Constructor
    public GameSession() {
        sc = new Scanner(System.in);
    }

    // Start the game
    public void start() {

        System.out.println("==============================");
        System.out.println("      NUMBER GUESSING GAME");
        System.out.println("==============================");

        boolean play = true;

        while (play) {

            Game game = new Game();

            System.out.println(
                "\nGuess a number between 1 and 100."
            );

            while (!game.isWon()) {

                int guess = InputValidator.readGuess(sc);

                String result = game.checkGuess(guess);

                System.out.println(result);
            }

            System.out.println(
                "Total attempts: " + game.getAttempts()
            );

            play = InputValidator.playAgain(sc);
        }

        System.out.println("\nThank you for playing!");
    }
}
 ⁠