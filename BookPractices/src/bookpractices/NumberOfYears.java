
package bookpractices;
import java.util.Scanner;


public class NumberOfYears {
    public static void main(String[] args){
        
        long minutes = 1000000000;
       
        long hours = minutes / 60;
        
        long days = hours/24;
        
        long years = days/365;
        long remainderdays = days % 365;
        
        
        System.out.println("Approximately " + years + " years and " + remainderdays + "days");
        
    }
}
