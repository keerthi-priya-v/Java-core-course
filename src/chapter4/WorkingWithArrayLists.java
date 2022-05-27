package chapter4;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkingWithArrayLists {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            ArrayList<Float> myArrayList = new ArrayList<>();
            float input;
            System.out.print("Enter number or -1 to exit :");
            input = keyboard.nextFloat();
            while(input>=0){
                myArrayList.add(input);
                System.out.print("Enter number or -1 to exit :");
                input = keyboard.nextFloat();
            }
            System.out.println("Reverse of the intergs");
            for(int i=myArrayList.size()-1;i>=0;i--){
                System.out.print(myArrayList.get(i)+ "\t");
            }
        }
    }
