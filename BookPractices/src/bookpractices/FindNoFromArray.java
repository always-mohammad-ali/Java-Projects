
package bookpractices;
import java.util.Scanner;

public class FindNoFromArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] array = new int[10];
        
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            array[i] = input.nextInt();
           // System.out.println(array[i]);
        }
        
        System.out.print("Enter random number to check its validity in that array : ");
        int randomNumber = input.nextInt();
        int count = 0;
        
        for(int i = 0; i < 10; i++){
            if(randomNumber == array[i]){
                count++;
               
            }
            
        }
        if(count >= 1){
            System.out.println("Found that Random number " + randomNumber + " = " + count + " times. ");
        }
        
        else{
            System.out.println("Didn't found");
        }
        
    }
}
