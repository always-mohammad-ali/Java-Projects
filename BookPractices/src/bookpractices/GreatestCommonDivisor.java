
package bookpractices;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a random to get its' greatest divisor: ");
        
        int number = input.nextInt();
        
        int initial = 2;
        
        while(initial != number){
            int gcd = number / initial ;
            
            if(gcd > initial){
                initial = gcd;
                
            }
            System.out.println("The greatest factor is " + gcd);
            initial++;
        }
        
    }
}
