package chapter5;
import java.util.ArrayList;
import java.util.Scanner;

public class NamePermutations {

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            ArrayList<String> firstNameList = new ArrayList<>();
            ArrayList<String> lastNameList = new ArrayList<>();

            for(int i=0;i<5;i++) {
                String firstLastName;
                System.out.print("Please enter name " + (i+1)+ " ");
                firstLastName = keyboard.nextLine();

                int indexIsSpace = firstLastName.indexOf(" ");
                String firstName = firstLastName.substring(0, indexIsSpace);
                String lastName = firstLastName.substring(indexIsSpace + 1);

                firstNameList.add(firstName);
                lastNameList.add(lastName);
            }//end for
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    System.out.println(firstNameList.get(i)+ " "+ lastNameList.get(j));
                }
            }

        }//end main
    }
