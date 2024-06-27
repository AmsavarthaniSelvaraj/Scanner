import java.util.Random;
import java.util.Scanner;


public class GuessingNumber {
    public static void main(String[] args) {
        Random input=new Random();
        int numbertoGuess = input.nextInt(100)+1;
        int userGuess=0;

        Scanner  scanner=new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("i have selected a number between 1 to 100:");
        System.out.println("Guess a Number!");

        while(userGuess!=numbertoGuess){
            System.out.println("Enter your guess:");
            int guess=scanner.nextInt();

            if(userGuess < numbertoGuess){
                System.out.println("Higher..");
            } else if(userGuess > numbertoGuess){
                System.out.println("Lower..");
            } else {
                System.out.println("correct.you will guessed the number..!");
            }
        }
    }
}
