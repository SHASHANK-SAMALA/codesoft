package CODESOFT;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("---> Welcome to the Number Guessing Game! <---");
        
        int round = 1;
        int totalScore = 0;
        String playAgain = "yes";
        
        while (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("y")) {
            System.out.println("\n---> Round " + round + " <---");
            int numberToGuess = random.nextInt(100) + 1;
            int attemptsLeft = 10;
            boolean guessedCorrectly = false;
            
            while (attemptsLeft > 0 && !guessedCorrectly) {
                System.out.print("Enter your guess (1 to 100). You have " + attemptsLeft + " attempts left: ");
                int guess = sc.nextInt();
                
                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }
                
                attemptsLeft--;
                
                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    guessedCorrectly = true;
                    totalScore += attemptsLeft; 
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess + ".");
            }
            
            round++;
            System.out.print("Do you want to play again? (yes/no): ");
            sc.nextLine(); 
            playAgain = sc.nextLine();
        }
        
        System.out.println("Thank you for playing! Your total score is: " + totalScore);
        sc.close();
    }
}

