package academy.javapro.lab;

import java.util.Random;
import java.util.Scanner;

public class WhileDoWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Create a while loop that counts from 1 to 5, printing each number.
        System.out.println("While loop counting:");

        // Initialize a counter variable to 1
        int count = 1;
        // Create while loop to print numbers from 1 to 5
        // while count is less than or equal to 5,
        while (count <= 5) {
            // print count followed by a space
            System.out.print(count + " ");
            // Increment count by 1
            count++;
        }

        // Adds new line after counting loop to format expected output
        System.out.println();


        // 2. Implement a do-while loop that asks the user to guess a number between 1 and 10 until they guess correctly.
        System.out.println("\nDo-while number guessing game:");

        // Initialize variable for random generated number between 1 and 10
        int randomNum = random.nextInt(10) + 1;
        // Initialize variable to store user's guess
        int guess;

        // Create do while loop
        do {
            // print question for user to guess a number between 1 and 10
            System.out.print("Guess a number between 1 and 10: ");
            // set guess variable to hold the value of the user's input
            guess = scanner.nextInt();
            // if guess is incorrect, tell user and prompt question to try again
            if (guess != randomNum) {
                System.out.println("Try again!");
            }
        // terminate loop when guess is equal to randomNum
        } while (guess != randomNum);
        // prints confirmation of the correct guess
        System.out.println("Correct! The number was " + randomNum + ".");


        // 3. Use a while loop to calculate the sum of numbers from 1 to a user-specified limit.
        System.out.println("\nSum calculation using while loop:");

        // 4. Create a do-while loop that generates random numbers between 1 and 6 (simulating a die roll) until a 6 is rolled.
        System.out.println("\nDo-while die rolling:");

        // 5. Implement a while loop that prints the Fibonacci sequence up to the 10th term.
        System.out.println("\nFibonacci sequence using while loop:");

        scanner.close();
    }
}
