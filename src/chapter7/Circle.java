package chapter7;
import static java.lang.Math.PI;

public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double circumference(){
        return 2*PI*radius;
    }

    public double area(){
        return PI*radius*radius;
    }
}