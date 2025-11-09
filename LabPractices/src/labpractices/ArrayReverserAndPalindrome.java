
package labpractices;
import java.util.Scanner;

public class ArrayReverserAndPalindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter size of an array: ");
        int size = input.nextInt();
        
        int[] array = new int[size];
        
        System.out.print("Enter " + size + " array elements: ");
        for(int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        
        System.out.println(java.util.Arrays.toString(array));
        
        //check pallindrome
        boolean isPal = true;
        for(int i = 0; i < size/2; i++){
         if(array[i] != array[size-1-i]){
             isPal = false;
             break;
         }
    }
        System.out.println("Is palindrome? " + isPal);
        
        //reverse
        int[] reverse = new int[size];
        for(int i = 0; i < size; i++){
            reverse[i] = array[size-1-i];
        }
        System.out.println(java.util.Arrays.toString(reverse));
        
        
    }
}
