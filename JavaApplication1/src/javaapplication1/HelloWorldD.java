
package javaapplication1;
import java.util.Scanner;

public class HelloWorldD {

   
    public static void main(String[] args) {
        System.out.println("Hey hello world");
        System.out.println("we are using Netbeans");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your favourite no: ");
        
        double favNo = input.nextDouble();
        
        double circleArea = (3.1416 * favNo * favNo);
        
        System.out.println("Total area is:" + circleArea);
        
        
        
    }
    
}
