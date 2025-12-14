
package finallabpractices;

import java.io.*;
import java.util.Scanner;

public class NumberFileProcessor2 {
    public static void main(String[] args) throws Exception {
        File file = new File("sum.txt");
        
        Scanner input = new Scanner(System.in);
        
        try{
            FileWriter output = new FileWriter(file, true);
            
            System.out.println("Enter positive number to get the average and negative number to stop : ");
            
            while(true){
                System.out.println("Enter number : ");
                int number = input.nextInt();
                
                if(number < 0){
                    break;
                }
                output.write(number + "\n");
            }
            
            output.close();
            System.out.println("numbers saved to : " + file.getName());
            
        }
        catch(IOException e){
            System.out.println("Error message : " + e.getMessage());
        }
        
        try(Scanner readNumberData = new Scanner(file)){
            int count = 0;
            int sum = 0;
            double average = 0;
            
            while(readNumberData.hasNextLine()){
                int number = Integer.parseInt(readNumberData.nextLine());
                sum += number;
                count++;
                System.out.println("Current number : " + number + " current sum : " + sum);
            }
            
            average = (double) sum/count;
            System.out.println("total sum : " + sum);
            System.out.println("total count : " + count);
            System.out.println("the average value : " + average);
        }
        catch(IOException e){
            System.out.println("error : " + e.getMessage());
        }
    }
}
