
package conditionrelatedproblems;
import java.util.Scanner;

public class GradeClass {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.println("Enter your total no: ");
        
        number = input.nextInt();
        
        if(number > 100 || number < 0){
            System.out.println("Put number either greater than 0 or less than 100");
        }
        else if(number >= 93){
            System.out.println("Your grade is A");
        }
        else if(number < 93 && number >=90){
            System.out.println("Your grade is A-");
        }
        else if(number <90 && number >= 87){
            System.out.println("Your grade is B+");
        }
        else{
            System.out.println("Your grade is F");
        }
        
    }
}
