
package bookpractices;


public class PrimeNumbersMethod {
    public static void main(String[] args){
        System.out.print("Enter first 50 prime numbers: \n");
       
        numberOfPrimes(50);
        
    }
    public static void numberOfPrimes(int firstFiftyNumbers){
         int number = 2;
         int count = 0;
         final int ONLY_10_NUMBERS_PER_LINE = 10;
         
        while(count < firstFiftyNumbers){
            if(isPrime(number)){
                
                count++;
                
                if(count % ONLY_10_NUMBERS_PER_LINE == 0){
                    System.out.printf("%-5d\n", number);
                    
                }
                else{
                    System.out.printf("%-5d", number);
                }
            }
            number++;
        }
    }
    public static boolean isPrime(int num){
        for(int divisor = 2; divisor <= num /2 ; divisor++){
            if(num % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
