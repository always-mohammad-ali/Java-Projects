
package bookpractices;
import java.util.Scanner;



public class DiagonalSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] [] array = new int[3] [3];
        
        int sum = 0;
        
        for(int row = 0; row < 3; row++){
            System.out.println("Enter row " + (row+1) + " data : ");
            for(int col = 0; col < 3; col++){
                
                array[row][col] = input.nextInt();
                
            }
        }
        
        for(int row = 0; row < 3; row++){
          for(int col = 0; col < 3; col++){
              System.out.print(array[row][col] + "\t");
          }
          System.out.println();
    }
        
        for(int row = 0; row < 3; row++){
            sum += array[row][row];
        }
        System.out.println("Total sum of main diagonal is " + sum);
        
       
        
    }
}
