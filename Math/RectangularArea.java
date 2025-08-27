
import java.util.Scanner;

public class RectangularArea{
    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        System.out.print("Enter Width: ");
        width = scanner.nextDouble();

        area = length * width;


        System.out.println("Length = "+length);
        System.out.println("Width = "+width);
        System.out.println("Area = "+ area + " cm^2");

    }
}