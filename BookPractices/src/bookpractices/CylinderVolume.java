package bookpractices;

import java.util.Scanner;

public class CylinderVolume {

    public static void main(String[] args) {
        final double PI = 3.14159 ;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius value: ");

        double radius = input.nextDouble();

        System.out.print("Enter the length value: ");

        double length = input.nextDouble();

        double area = PI * radius * radius;
        
        System.out.println("Total area is : " + area);
        
        System.out.println("Total volume is : " + area * length);
    }

}
