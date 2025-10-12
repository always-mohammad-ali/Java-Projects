
package labpractices;
import java.util.Scanner;

public class SumUntilNValues {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter random value to add: ");
        
        int randomValue = input.nextInt();
        int sum = 0;
        
        for(int i = 0; i<= randomValue; i++){
            
            sum += i;
        }
        
        System.out.println("The final value is: "+ sum);
    }
}
