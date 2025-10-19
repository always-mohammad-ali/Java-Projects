/*
 6. Print the squares of all numbers from 1 to 10.
7. Input an integer and count how many digits it has (using loop).
8. Input a number (e.g., 1234) and print its reverse (4321).
9. Find the sum of digits of a given number (e.g., 123 → 6).
10. Calculate factorial of n using a for loop.
11. Print all prime numbers between 1 and 100.
 */
package bookpractices;


public class SquaresNumber {
    public static void main(String[] args){
        int i = 1;
        do{
            int squareResult = i * i;
            System.out.println("Square of " + i + " = " + squareResult + "\n");
            i++;
        }while(i <= 20);
    }
}
