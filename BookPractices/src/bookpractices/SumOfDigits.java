
package bookpractices;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000 : ");
        
        int number = input.nextInt();
        
        int firstDigit = number % 10;
        
        int result = number / 10;
        
        int secondDigit = result % 10;
        
        int thirdDigit = result / 10;
        
        int sumOfDigits = firstDigit + secondDigit + thirdDigit ;
        
        System.out.println("The sum of the digits is " + sumOfDigits);
    }
}
