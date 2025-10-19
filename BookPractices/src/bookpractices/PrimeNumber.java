/*
   11. Print all prime numbers between 1 and 100.
 */
package bookpractices;
import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
//        int n = input.nextInt();
        
//        boolean isPrime = true;
        
        
        for(int i = 2; i <= 100; i++){
             boolean isPrime = true;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
           if(isPrime){
               System.out.println(i + " is prime number " + " " );
           }
            
        }
        
    }
}
