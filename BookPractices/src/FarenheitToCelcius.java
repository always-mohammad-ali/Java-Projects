import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Farenheit value : ");
        
        double farenheitValue = input.nextDouble();
        
        double celcius = (5.0/9 * (farenheitValue - 32));
        System.out.println("Celcius value is = " + celcius);
    }
}
