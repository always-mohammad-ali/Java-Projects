/*
 7. Input an integer and count how many digits it has (using loop).
8. Input a number (e.g., 1234) and print its reverse (4321).
9. Find the sum of digits of a given number (e.g., 123 → 6).

 */

package bookpractices;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a random Number 'n' to get how many digits are there : ");
        
        int n = input.nextInt();
        int original = n;
        
        int count = 0;
        int reverse = 0;
        int sum = 0;
        
        while(n != 0){
            int digit = n % 10;
            
            count++;
            reverse = reverse * 10 + digit;
            sum += digit;
            
            n = n / 10;
                  
        }
        System.out.println("The original no : " + original);
        System.out.println("Total digit no : " + count );
        System.out.println("The reverse no : " + reverse);
        System.out.println("Total sum of the digit is : " + sum);
       
        input.close();
        
    }
}
