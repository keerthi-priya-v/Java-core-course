package chapter2;

import java.util.Scanner;

public class AverageOfThree {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            double firstNumber;
            double secondNUmber;
            double thirdNumber;
            double average;

            System.out.println("Please enter three numbers: ");
            firstNumber = keyboard.nextDouble();
            secondNUmber = keyboard.nextDouble();
            thirdNumber = keyboard.nextDouble();
            keyboard.nextLine();//good habit

            average = (firstNumber+secondNUmber+thirdNumber)/3;
            System.out.println("Average is " +  average);
        }//end main
    }