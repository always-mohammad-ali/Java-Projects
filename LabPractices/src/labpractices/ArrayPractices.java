
package labpractices;
import java.util.Scanner;


public class ArrayPractices {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        
        int size = input.nextInt();
        
        int [] array = new int[size];
        
        System.out.println("Enter " + array.length + " values: ");
        
        int sum = 0;
        
        for(int i = 0; i< array.length; i++){
            array[i] = input.nextInt();
        }
        
        for(int i = 0; i< array.length; i++){
            
            sum += array[i];
        }
        System.out.println("Total value is: " + sum);
    }
}
