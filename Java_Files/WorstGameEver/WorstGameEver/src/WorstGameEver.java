import java.util.Random;
import java.util.Scanner;

public class WorstGameEver {
    public static void main (String[] args) {

        //contemplated a do while loop but that would be for replay ... so no
        
        System.out.println("Welcome to the worst game ever!");
        System.out.println("Please identify yourself:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello "+name+" you will soon regret this.");
        System.out.println("The game has chosen a difficulty level for you:");

        Random randomGameNumber = new Random();
        int gameLevelNumber = randomGameNumber.nextInt(2);

        int goalNumber;
        Random goalNumberBound= new Random();
        if (gameLevelNumber == 0) {
            goalNumber = goalNumberBound.nextInt(5);
            System.out.println("Game level 1, ridiculously easy.");
            System.out.println("You will be guessing a number between 1 and 5.");
        } else {
            goalNumber = goalNumberBound.nextInt(5000000);
            System.out.println("Game level 2, impossibly hard.");
            System.out.println("You will be guessing a number between 1 and 5,000,000.");
        }

        int guess = 10000000;
        int guessTotal = 0;

        while (guess != goalNumber) {
            System.out.println("Please enter a guess");
            guess = scanner.nextInt();

            if (guessTotal >= 4) {
                System.out.println("No more chances! Game over!");
                System.out.println("We know you don't want to play again.");
                System.exit(0);
            }

            if (guess < goalNumber) {
                System.out.println("Try higher.");
            } else if (guess > goalNumber) {
                System.out.println("Try lower.");
            } else {
                System.out.println("Congratulations!");
                System.out.println("You have won this stupid game!");
                System.exit(0);
            }

            guessTotal++;
        }
    }
}

