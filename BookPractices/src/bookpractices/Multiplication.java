/*
5. Input a number and print its multiplication table (e.g., 5 × 1 = 5 ...
5 × 10 = 50).

 */

package bookpractices;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a random number to get its multiplication from 1 to 10: ");
        
        int N = input.nextInt();
        
        int i = 1;
        
        while(i <= 10){
            
            int result = N * i;
            System.out.println(N + " * " + i + " = " + result + "\n" );
            i++;
        }
        
    }
}
