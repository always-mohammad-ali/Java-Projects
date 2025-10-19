/*1. Use a while loop to calculate the sum of 1 to n. N will be user
input. (1+2+3+............+n).

*/


package bookpractices;
import java.util.Scanner;

public class WhileLoopSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an random number as N to add until that number: ");
        int N = input.nextInt();
        
        int sum = 0;
        int i = 0;
        while(i <=N){
            sum += i;
            i++;
        }
        System.out.println("The total sum is until " + N + " = " + sum);
        
       
    }
}
