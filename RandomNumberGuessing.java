import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1; 
        int max = 100; 
        int randomNumber = random.nextInt(max - min + 1) + min;
        
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
int count=0;
        
        System.out.println("Random Number Guessing");
        System.out.println("Select a random number between " + min + " and " + max + "");
        
        while (count<5) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts=5;
            
            if (userGuess < min || userGuess > max) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
            } else if (userGuess < randomNumber) {
                System.out.println("The number is higher. Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("The number is lower. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("You got the correct number :" + randomNumber + " correctly in " + attempts + " attempts.");
            }
count++;
        }
        
        scanner.close();
    }
}