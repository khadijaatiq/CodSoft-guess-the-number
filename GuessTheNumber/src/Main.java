import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int rounds = 10;
        int score = 0;
        int targetNumber = rand.nextInt(100) + 1;

        System.out.println("Hello");
        System.out.println("Guess the number game");
        System.out.println("Instructions: There will be 10 rounds and you have to guess the same number from 1 to 100 in each round");

        while (rounds > 0) {
            System.out.println("Round " + (11 - rounds) + " - Enter your guess (Range: 1 to 100)");
            int guess = sc.nextInt();

            if (guess >= 1 && guess <= 100) {
                if (guess == targetNumber) {
                    System.out.println("You guessed it right!");
                    score++;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low :(");
                } else {
                    System.out.println("Too high :(");
                }
                rounds--;
            } else {
                System.out.println("Enter the guess within bounds (1 to 100)");
            }
        }

        System.out.println("\nWell played!");
        System.out.println("Your score: " + score + "/10");
    }
}
