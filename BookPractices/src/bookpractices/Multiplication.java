/*
5. Input a number and print its multiplication table (e.g., 5 × 1 = 5 ...
5 × 10 = 50).
6. Print the squares of all numbers from 1 to 10.
7. Input an integer and count how many digits it has (using loop).
8. Input a number (e.g., 1234) and print its reverse (4321).
9. Find the sum of digits of a given number (e.g., 123 → 6).
10. Calculate factorial of n using a for loop.
11. Print all prime numbers between 1 and 100.
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
