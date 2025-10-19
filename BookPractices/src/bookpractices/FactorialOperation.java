/*
10. Calculate factorial of n using a for loop.

 */
package bookpractices;
import java.util.Scanner;


public class FactorialOperation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a random number to get the factorial : ");
        int n = input.nextInt();
        int result = 1;
        
        for(int i = n; i >= 1; i--){
            result = result * i;
            
            
        }
        System.out.print("The factorial result is : " + result);
        
    }
}
