
package conditionrelatedproblems;
import java.util.Scanner;


public class CheckLeapYear {
    public static void main(String[] args){
        
        System.out.println("Enter a year: ");
        Scanner input = new Scanner(System.in);
        
        int year;
        
        
        
        year = input.nextInt();
        
        if(year < 0 || year >10000){
            System.out.println("Enter correct year as input for getting wheter it is leap year or not");
        }
        
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("It is leap year");
        }
        
        
       
    }
}
