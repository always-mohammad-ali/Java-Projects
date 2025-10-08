
package conditionrelatedproblems;
import java.util.Scanner;



public class ConditionRelatedProblems {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     int number;
     int number2;
     System.out.println("Enter a number: ");
     System.out.println("Enter a number for double: ");
     number = input.nextInt();
     number2 = input.nextInt();
    
     int doubleResult = (number2 * 2);
     
     System.out.println("Your double no result is: " + doubleResult);
     
     if(number%2 == 0){
        System.out.println("Even No");
     }
     else{
         System.out.println("odd no");
     }
     }
  }
    

