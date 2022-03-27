import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class Guess {

    public static void main(String[] args) {
      
      int guess;
      Scanner in = new Scanner(System.in);
      System.out.print("Guess a number between 1 and 100: ");
      guess = in.nextInt();
      System.out.println("You said " + guess + ".");
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number was " + number + ".");

        System.out.println("The difference between your guess and the real number was " + (number-guess) + ".");
    }

}