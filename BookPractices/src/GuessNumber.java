
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 101);
        
        int guess = -1;
        
        while(guess != number){
            System.out.println(" Enter a random value for guessing number between 0-100 : ");
            
            guess = input.nextInt();
            
            if(guess == number){
                System.out.print("Your guessing number " + guess + " is equal to " + number );
            }
            else if(guess >= 50){
                System.out.print("Your guessing number " + guess + " is low compare to " + number);
            }
            else{
                System.out.print("Your guessing number " + guess + " is low compare to " + number);
            }
        }
        
    }
}
