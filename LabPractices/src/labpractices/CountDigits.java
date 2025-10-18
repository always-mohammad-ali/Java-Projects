
package labpractices;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a random value to get total digit no: ");
        
        int value = input.nextInt();
        
        for(int i = 1; i <= value; i++){
            value /= 10;
            System.out.println(value);
            int remainder = value % 10;
            System.out.println(remainder);
            
            int totalRemainderValue = 0;
            totalRemainderValue += remainder;
            System.out.println("Total addition of digits: " + totalRemainderValue);
            
            System.out.println("Total digit no: " + i);
            
            
        }
    }
}
