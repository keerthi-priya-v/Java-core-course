package chapter6;

import java.util.ArrayList;

public class SumOfElements {

        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            arrayList.add(6);
            System.out.println("sum is " + sumElements(arrayList));
        }//end main

        public static int sumElements(ArrayList<Integer> arrayList){
            int sumOfArray = 0;
            for(int num : arrayList){
                sumOfArray += num;
            }
            return sumOfArray;
        }
    }