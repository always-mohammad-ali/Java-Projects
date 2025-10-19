/*
 6. Print the squares of all numbers from 1 to 10.

 */
package bookpractices;


public class SquaresNumber {
    public static void main(String[] args){
        int i = 1;
        do{
            int squareResult = i * i;
            System.out.println("Square of " + i + " = " + squareResult + "\n");
            i++;
        }while(i <= 10);
    }
}
