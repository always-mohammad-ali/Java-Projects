import java.util.Scanner;

public class InputScanner{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number for radius: ");
      double radiusValue = input.nextDouble();
     
      double area = (3.1416 * radiusValue * radiusValue);
      
      System.out.println("Your radius is " + radiusValue + "and Your area of circle is " + area);
}
}





