
package bookpractices;
import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the total numbers to count average: ");
        
        int n = input.nextInt();
        
        double[] numbers = new double[n];
        
        int sum = 0;
        
        System.out.print("Enter the number: ");
        for(int i = 0; i<n; i++){
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        
        System.out.println("The total number is " + sum);
        
        double average = sum / n;
        
        int count = 0;
        
        for(int i = 0; i < n ; i++){
            if(numbers[i] > average){
                count++;
            }
        }
        System.out.println("The average no is : " + average);
        System.out.println("The total counted no is : " + count);
    }
}
