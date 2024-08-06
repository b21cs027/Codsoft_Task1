import java.util.Scanner;
import java.util.Random;

public class Guessing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int score = 0;
        boolean play = true;
        
        while (play) {
            int numberToGuess = rand.nextInt(100) + 1;
            int numberOfAttempts = 0;
            boolean GuessedCorrectly = false;
            
            System.out.println("A new number between 1 and 100 has been generated,guess it");
            
            while (numberOfAttempts < 10 && !GuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                numberOfAttempts++;
                
                if (userGuess == numberToGuess) {
                    GuessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the correct one.");
                    score += (10 - numberOfAttempts); // Score based on attempts left
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is low. Try again.");
                } else {
                    System.out.println("Your guess is  high. Try again.");
                }
            }
            
            if (!GuessedCorrectly) {
                System.out.println("Sorry,the correct number was " + numberToGuess);
            }
            
            System.out.println("Your score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            play = sc.next().equalsIgnoreCase("yes");
        }
        
        System.out.println("Thank you for playing! Your final score: " + score);
        sc.close();
    }
}
