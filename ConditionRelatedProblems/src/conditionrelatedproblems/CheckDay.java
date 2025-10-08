
package conditionrelatedproblems;
import java.util.Scanner;



public class CheckDay {
    public static void main(String[] args){
        
        System.out.println("Enter a day number to check: ");
        Scanner input = new Scanner(System.in);
        
        int day = input.nextInt();
        
        switch (day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
                
            case 4:
                System.out.println("Tuesday");
                break;  
            
            case 5:
                System.out.println("Wed");
                break;
            
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            
            default:
                System.out.println("Enter no 1-7");
        }
    }
}
