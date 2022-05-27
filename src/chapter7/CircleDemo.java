package chapter7;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10.0);
        System.out.println("Radius = " +circle1.getRadius());
        System.out.println("Circumference = " +circle1.circumference());
        System.out.println("Area = " +circle1.area());

        System.out.println();

        Circle circle2 = new Circle(4.5);
        System.out.println("Radius = " +circle2.getRadius());
        System.out.println("Circumference = " +circle2.circumference());
        System.out.println("Area = " +circle2.area());

        System.out.println();

        Circle circle3 = new Circle(13.45);
        System.out.println("Radius = " +circle3.circumference());
        System.out.println("Circumference = " +circle3.circumference());
        System.out.println("Area = " +circle3.area());
    }
}