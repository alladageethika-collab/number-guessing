
import java.util.Random;

public class Game {

    private int randomNumber;
    private int attempts;
    private boolean won;

    // Constructor
    public Game() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        attempts = 0;
        won = false;
    }

    // Check the player's guess
    public String checkGuess(int guess) {

        attempts++;

        if (guess > randomNumber) {
            return "Too High! Try Again.";
        }
        else if (guess < randomNumber) {
            return "Too Low! Try Again.";
        }
        else {
            won = true;
            return "Congratulations! You guessed it!";
        }
    }

    // Return number of attempts
    public int getAttempts() {
        return attempts;
    }

    // Check whether player has won
    public boolean isWon() {
        return won;
    }
}
