
package bookpractices;
import java.util.Scanner;

public class PoundsToKg {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter pounds input : ");
        
        double pounds = input.nextDouble();
        
        double calculateKg = (pounds * 454) / 1000;
        
        System.out.println(pounds + " pounds is " + calculateKg + " kilograms");
    }
}
