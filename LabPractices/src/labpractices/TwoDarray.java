
package labpractices;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int [] [] array = new int[size][size];
        
        System.out.println("Enter " + size*size + " values: ");
        
        for(int i = 0; i< array.length; i++){
            for(int j=0; j < array.length ; j++){
                array[i][j] = input.nextInt();
            }
        }
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println("INDEX[" + i + "| [");
            }
        }
        
    }
}
