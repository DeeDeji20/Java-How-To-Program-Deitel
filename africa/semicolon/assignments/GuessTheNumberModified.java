package africa.semicolon.assignments;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberModified {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        matchGuess(randomNumberGuess(), userGuess());
    }

    public static int randomNumberGuess() {
        SecureRandom randomNumber = new SecureRandom();
        int randomValue = 1 + randomNumber.nextInt(10);
        System.out.println(randomValue);
        return randomValue;
    }

    public  static int userGuess(){
        System.out.println("Guess a number");
        int userGuess = scan.nextInt();
        return userGuess;
    }

    public static void matchGuess(int generatedNumber, int userInput){
        int countGuesses =0;
        while (userInput != generatedNumber){
            if(userInput > generatedNumber) System.out.println("Too high");
            else System.out.println("Too low");

            if (countGuesses <10) System.out.println("Either you know the secret or you got lucky");
            else if (countGuesses ==10) System.out.println("Aha! you know the secret!");
            else System.out.println("You should be able to do better");
            ++countGuesses;
            System.out.println(countGuesses);

            System.out.println("Enter another guess");
            userInput = scan.nextInt();
        }
        if (userInput==generatedNumber){
            System.out.println("congrats");
            options();
        }
    }

    public  static void options(){
        String userOptions = """
               1. Play again
               2. Exit game
               Enter your choice
               """;
        System.out.println(userOptions);
        int choice = scan.nextInt();
        switch (choice){
            case 1-> matchGuess(randomNumberGuess(), userGuess());
            case 2-> System.out.println("Thanks for playing");
            default -> {
                System.out.println("Incorrect choice, please re-enter your choice");
                options();
            }
        }
    }
}
