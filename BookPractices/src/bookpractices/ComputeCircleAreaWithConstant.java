package bookpractices;

import java.util.Scanner;

public class ComputeCircleAreaWithConstant {

    public static void main(String[] args) {
        final double PI = 3.14159;

//      CREATE A SCANNER OBJECT
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius Value: ");

        double radius = input.nextDouble();

        double circleArea = PI * radius * radius;

        System.out.println("The radius input value = " + radius + " and The area of the circle is = " + circleArea);

    }
}
