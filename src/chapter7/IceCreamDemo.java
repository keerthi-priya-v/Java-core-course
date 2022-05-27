package chapter7;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream choco = new IceCream("Chocolate",95, 6 );
        choco.addTopping("nuts");


        System.out.println(choco.getName());
        System.out.println("Cost: "+ choco.getCost());
        System.out.println("Topped with:");
        choco.printToppings();

        System.out.println();

        IceCream strawberry = new IceCream("Butterscotch",50,8);
        strawberry.addTopping("sprinkles");
        System.out.println(strawberry.getName());
        System.out.println("Cost: "+ strawberry.getCost());
        strawberry.printToppings();

    }
}