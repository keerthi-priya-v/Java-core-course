package chapter8;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateCircles {
    public static void main(String[] args) {

            ArrayList<Circle> circleList;
            circleList = new ArrayList<>();

            fillArrayList(circleList);
            printRectangles(circleList);
        }
        public static void fillArrayList(ArrayList<Circle> circleList){
            Scanner infile;
            try {
                infile = new Scanner(new File("circle.txt"));
                Circle temp;
                double radius;
                while(infile.hasNext()){
                    radius = infile.nextDouble();
                    temp = new Circle(radius);
                    circleList.add(temp);
                }//end while
                PrintWriter pw = new PrintWriter("circles-output.txt");
                for(Circle c : circleList){
                    pw.println("Radius: " + c.getRadius());
                    pw.println("Circumference: " + c.circumference());
                    pw.println("Area: " + c.area());
                }//end for
                infile.close();
                pw.close();
            }
            catch (FileNotFoundException ex){
                System.out.println("Error accessing file!");
            }
        }//end fillArrayList

        public static void printRectangles(ArrayList<Circle> circleList){
            for(Circle c : circleList){
                System.out.println("Radius: " + c.getRadius());
                System.out.println("Circumference: " + c.circumference());
                System.out.println("Area: " + c.area());
                System.out.println();
            }//end for
        }//end printRectangles
    }
