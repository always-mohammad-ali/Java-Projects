/*
 3. Print all even numbers between 1 and 50.
  
 */
package bookpractices;


public class EvenNumbersBetweenOneToFifty {
    public static void main(String[] args){
        int i = 1;
       
        while(i <= 50){
        if(i % 2 == 0){
            System.out.println(i);
        }
        else{
            System.out.println();
        }
        
        i++;
    }
    }
}
