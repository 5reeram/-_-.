
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
public static void main(String[] args) {
try (Scanner scanner = new Scanner(System.in)) {
Random random = new Random();
int maxNumber = 100;
int minNumber = 1;
int rounds = 3; 
int totalScore = 0;           
System.out.println("Welcome to the Number Guessing Game!");
System.out.println("You have " + rounds + " rounds to play.");            
for (int round = 1; round <= rounds; round++) {
int secretNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
int attempts = 0;
int maxAttempts = 5;
int roundScore = 0;                
System.out.println("\nRound " + round);
System.out.println("Guess the number between " + minNumber + " and " + maxNumber);                
while (attempts < maxAttempts) {
System.out.print("Enter your guess (Attempt " + (attempts + 1) + "): ");
int userGuess = scanner.nextInt();
attempts++;                   
if (userGuess < minNumber || userGuess > maxNumber) {
System.out.println("Please enter a number between " + minNumber + " and " + maxNumber + ".");
} else if (userGuess == secretNumber) {
System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
roundScore = maxAttempts - attempts + 1;
break;
} else if (userGuess < secretNumber) {
System.out.println("Try a higher number.");
} else {
System.out.println("Try a lower number.");
}
}      
totalScore += roundScore;
System.out.println("Round " + round + " Score: " + roundScore);
}      
System.out.println("\nGame Over!");
System.out.println("Total Score: " + totalScore);
}
}
}

