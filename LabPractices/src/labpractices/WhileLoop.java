
package labpractices;
import java.util.Scanner;


public class WhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a random value for adding from 1 to random value: ");
        int i = input.nextInt();
        int add = 0;
        
        while(i >= 0){
            
            add += i;
            i--;
            
        }
        System.out.println("Total result is = " + add);
        
    }
}
