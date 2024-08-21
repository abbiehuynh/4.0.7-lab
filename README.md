# Lab 4.0.7

**Learning Objectives**

- Understand the concept and importance of while and do-while loops in Java development.
- Learn how to implement while and do-while loops in Java programs.
- Explore practical applications of while and do-while loops in real-world Java projects.
- Identify common pitfalls and best practices when working with these loop structures.
- Gain hands-on experience with complete Java examples that demonstrate while and do-while loops.

**Prerequisites**

- Basic understanding of Java programming.
- Familiarity with variables, data types, and basic control flow.
- Knowledge of how to run a Java program.

**hat You'll Achieve**

- Develop a solid understanding of while and do-while loop structures in Java.
- Implement practical examples of loops that can be applied in real-world scenarios.
- Enhance your skills in iteration, condition checking, and loop control.

**Assignment Details**

1. Create a while loop that counts from 1 to 5, printing each number.
2. Implement a do-while loop that asks the user to guess a number between 1 and 10 until they guess correctly.
3. Use a while loop to calculate the sum of numbers from 1 to a user-specified limit.
4. Create a do-while loop that generates random numbers between 1 and 6 (simulating a die roll) until a 6 is rolled.
5. Implement a while loop that prints the Fibonacci sequence up to the 10th term.

**Example Output**

```
While loop counting:
1 2 3 4 5

Do-while number guessing game:
Guess a number between 1 and 10: 7
Try again!
Guess a number between 1 and 10: 3
Correct! The number was 3.

Sum calculation using while loop:
Enter a limit: 10
The sum of numbers from 1 to 10 is 55

Do-while die rolling:
Rolling the die...
Rolled: 4
Rolling the die...
Rolled: 2
Rolling the die...
Rolled: 6
Got a 6! Stopping.

Fibonacci sequence using while loop:
0 1 1 2 3 5 8 13 21 34
```

**Starter Code**

```java
package academy.javapro.lab;

import java.util.Random;
import java.util.Scanner;

public class WhileDoWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // TODO: Implement while and do-while loops here

        scanner.close();
    }
}
```

**Hints**

- Remember that a while loop checks the condition before executing the loop body.
- A do-while loop always executes its body at least once, as it checks the condition after the loop body.
- Use `scanner.nextInt()` to get integer input from the user.
- For the random number generation, use `random.nextInt(6) + 1` to get numbers between 1 and 6.
- Be careful with infinite loops. Ensure your loop condition will eventually become false.

**Submission Instructions**

1. Fork the repository
2. Clone your fork
3. Navigate into the repository
4. Implement the required loops in the main method
5. Test your implementation with various inputs
6. Git add, commit, and push to your fork
7. Submit a pull request
    - Set the title of the pull request to your first name and last name
    - In the comment, briefly explain your implementation approach and any challenges you faced

Remember, the goal is to learn and have fun! Don't hesitate to ask for help if you get stuck.
