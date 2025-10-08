
package bookpractices;
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Total sales amount : ");
        
        double salesAmount = input.nextDouble();
        
        double totalTaxAmount = salesAmount * 0.06 ;
        
        System.out.println("Sales tax is = $" + totalTaxAmount );
    }
}
