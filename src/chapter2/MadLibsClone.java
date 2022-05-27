package chapter2;

import java.util.Scanner;

public class MadLibsClone {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String adjective1;
        String adjective2;
        String adjective3;
        String girlName;
        String occupation1;
        String occupation2;
        String place;
        String clothing;
        String hobby;
        String boyName;
        String manName;
        System.out.print("Enter an adjective :");
        adjective1 = keyboard.nextLine();
        System.out.print("Enter an girlName :");
        girlName = keyboard.nextLine();
        System.out.print("Enter another adjective :");
        adjective2 = keyboard.nextLine();
        System.out.print("Enter an occupation :");
        occupation1 = keyboard.nextLine();
        System.out.print("Enter the name of a place :");
        place = keyboard.nextLine();
        System.out.print("Enter the name of a piece of clothing :");
        clothing = keyboard.nextLine();
        System.out.print("Enter the name of a hobby :");
        hobby = keyboard.nextLine();
        System.out.print("Enter another adjective :");
        adjective3 = keyboard.nextLine();
        System.out.print("Enter another occupation :");
        occupation2 = keyboard.nextLine();
        System.out.print("Enter a boyName :");
        boyName = keyboard.nextLine();
        System.out.print("Enter a manName :");
        manName = keyboard.nextLine();
        System.out.println("There once was a "+ adjective1 + " girl named " + girlName + ", who was a " +  adjective2 +" "+  occupation1 + " in the Kingdom of " + place +". She loved to wear "+ clothing+ " and to " +hobby+ ". She wanted to marry the " + adjective3 + occupation2 + " named " + boyName + " but her father, King " + manName + " forbid her from seeing him.");

    }
}