import java.util.Random;
import java.util.Scanner;

public class numgame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; 
        
        Scanner scanner = new Scanner(System.in);
        int attempts = 5;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + attempts + " attempts to guess the number.");
        
        while (attempts > 0) {
            System.out.print("Enter your guess (1-100): ");
            int userGuess = scanner.nextInt();
            
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
                continue;
            }
            
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the number!");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
            
            attempts--;
            System.out.println("Attempts remaining: " + attempts);
        }
        
        if (attempts == 0) {
            System.out.println("Sorry, you've run out of attempts. The number was " + randomNumber + ".");
        }
        
        scanner.close();
    }

