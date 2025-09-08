import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        guessNumber(1, 100);
    }

    static void guessNumber(int low, int high) {
        if (low > high) {
            System.out.println("Hmm, seems like there was a mistake in feedback!");
            return;
        }

        int guess = rand.nextInt(high - low + 1) + low;
        System.out.println("Is your number " + guess + "? (high/low/correct)");
        String feedback = sc.next();

        switch (feedback.toLowerCase()) {
            case "high":
                guessNumber(low, guess - 1);
                break;
            case "low":
                guessNumber(guess + 1, high);
                break;
            case "correct":
                System.out.println("Yay! I guessed it!");
                break;
            default:
                System.out.println("Invalid input. Try again.");
                guessNumber(low, high);
        }
    }
}
