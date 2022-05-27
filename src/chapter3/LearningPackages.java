package chapter3;

import java.util.Scanner;

import static java.lang.Math.abs;

public class LearningPackages {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int packageDetail;
        int additionalCourse;
        int numberOfIncluded;
        int totalMonthlyCost = 0;
        int costOfPackage;
        System.out.println("Which of the packages do you want? 1, 2, or 3");
        packageDetail = keyboard.nextInt();

        System.out.println("How many courses did you enroll in this month?");
        additionalCourse = keyboard.nextInt();

        switch (packageDetail){
            case 1:
                costOfPackage = 10;
                if(additionalCourse!=0){
                    numberOfIncluded = 2;
                    additionalCourse = abs(additionalCourse - numberOfIncluded);
                    additionalCourse *= 6;
                }
                totalMonthlyCost = additionalCourse+costOfPackage;
                break;
            case 2:
                costOfPackage = 12;
                if(additionalCourse!=0){
                    numberOfIncluded = 4;
                    additionalCourse = abs(additionalCourse - numberOfIncluded);
                    additionalCourse *= 4;
                }
                totalMonthlyCost = additionalCourse+costOfPackage;
                break;
            case 3:
                costOfPackage = 15;
                if(additionalCourse!=0){
                    numberOfIncluded = 6;
                    additionalCourse = abs(additionalCourse - numberOfIncluded);
                    additionalCourse *= 3;
                }
                totalMonthlyCost = additionalCourse+costOfPackage;
                break;
            default:
                System.out.println("Please check the package you entered");
        }
        System.out.println("Total cost is " + totalMonthlyCost);
    }
}