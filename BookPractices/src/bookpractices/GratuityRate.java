
package bookpractices;
import java.util.Scanner;

public class GratuityRate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the subtotal: ");
        
        double subtotal = input.nextDouble();
        
        System.out.print("Enter the gratuity rate: ");
        
        double gratuityRate = input.nextDouble();
        
        double totalGratuity = subtotal * (gratuityRate / 100);
        
        System.out.println("The gratuity is " + totalGratuity + " and total is " + (totalGratuity + subtotal));
    }
}
