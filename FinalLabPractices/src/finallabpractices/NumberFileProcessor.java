
package finallabpractices;

import java.io.*;
import java.util.Scanner;

public class NumberFileProcessor {
    public static void main(String[] args) {
        File file = new File("number.txt");
        
        Scanner input = new Scanner(System.in);
        
        try{
            FileWriter output = new FileWriter(file, true);
            System.out.println("Enter positive number(negative number for exit) : ");
            while(true){
                System.out.println("Enter number: ");
                int number = input.nextInt();
                
                if(number < 0){
                    break;
                }
                
               output.write(number + "\n");
               
            }
            
            output.close();
            System.out.println("numbers saved to " + file.getName());
        }
        catch(IOException e){
            System.out.println("error message " + e.getMessage());
            e.printStackTrace();
        }
        
        
        try{
            Scanner fileReader = new Scanner(file);
            int count = 0;
            int sum = 0;
            double average = 0;
            
            while(fileReader.hasNextLine()){
               int number = Integer.parseInt(fileReader.nextLine());
                  
                sum += number;
                count++;
                
                System.out.println("Current number : " + number + " current sum = " + sum);
            }
            
            fileReader.close();
            if(count > 0){
                average = (double) sum / count;
               
            }
            
             System.out.println("\n===== RESULTS =====");
            System.out.println("Total numbers: " + count);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            
        }
        catch(IOException e){
            System.out.println("error message " + e.getMessage());
            e.printStackTrace();
        }
        catch(NumberFormatException e){
            System.out.println("you have to enter only integer : " + e.getMessage());
        }
        
        input.close();
    }
}
