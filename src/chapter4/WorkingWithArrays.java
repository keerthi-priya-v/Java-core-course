package chapter4;

import java.util.Scanner;

public class WorkingWithArrays {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int[] myArray = new int[5];
            for(int i=0;i<myArray.length;i++){
                System.out.print("Enter an integers: \t");
                myArray[i] = keyboard.nextInt();
            }

            for(int i=0;i< myArray.length;i++){
                System.out.println("result is " + myArray[i]*2);
            }
        }
    }