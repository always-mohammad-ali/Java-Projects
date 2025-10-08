
package bookpractices;
import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args){
        
//        CREATE A SCANNER OBJECT
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Seconds value to compute hour, minute, sec: ");
        
        int seconds = input.nextInt();
        
        int minutes = seconds / 60;
        
        int remainingSeconds = seconds % 60;
        
        int hours = minutes / 60;
        
        int remainingMinutes = minutes % 60;
        
        System.out.println(seconds + " Seconds = " + hours + " Hours " + remainingMinutes + " Minutes " + remainingSeconds + " sec ");
        
        
    }
}
