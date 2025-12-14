
package finallabpractices;


public class QuotientWithException {
    public static int quotient(int num1, int num2){
        
        if(num2 == 0){
            throw new ArithmeticException("Divisor can't be zero");
        }
        
    
        return num1/num2;
    }
    
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 2;
       
        try{
            int result = quotient(number1, number2);
           System.out.println(result); 
           
        }
        catch(Exception e){
            System.out.println("Exception caught " + e.getMessage());
            e.printStackTrace();
        }
        finally{
            System.out.println("finally will always be printed whatever happened in past");
        }
    }
}
