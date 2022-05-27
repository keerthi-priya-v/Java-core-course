package chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Parallel {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.print("Enter name of " + (i+1) + " person : ");
            String getName = keyboard.nextLine();
            names.add(getName);
            System.out.print("Enter age of " + (i+1) + " person : ");
            int getAge = keyboard.nextInt();
            ages.add(getAge);
            keyboard.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old");
        }
    }
}