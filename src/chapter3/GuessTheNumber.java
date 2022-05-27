package chapter3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            Random random = new Random();
            int randomNumber;
            int guessNumber;
            int guessCount = 0;

            randomNumber = random.nextInt(100)+1;
            System.out.println("Enter your integer guess");
            guessNumber = keyboard.nextInt();
            while(randomNumber!=guessNumber){
                guessCount++;
                if(guessNumber>randomNumber){
                    System.out.println("Your guess was to high!");
                }
                else if(guessNumber<randomNumber){
                    System.out.println("Your guess was to low!");
                }
                System.out.println("Enter your integer guess");
                guessNumber = keyboard.nextInt();
            }
            System.out.println("Congratulations! You guessed the number in "+ guessCount + " guesses! Thanks for playing");
        }
    }
