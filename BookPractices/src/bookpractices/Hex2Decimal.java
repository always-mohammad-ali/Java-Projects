
package bookpractices;
import java.util.Scanner;


public class Hex2Decimal {
    public static void main(String[] args){
        
       Scanner input =new Scanner(System.in);
       
       System.out.print("Enter a HexaDecimal value to convert it into Decimal: ");
       String hex = input.nextLine();
       
       System.out.println("The hex value is : " + hex + " and its' decimal value is : "+ hexToDecimal(hex.toUpperCase()));
       
      
       
       
       
    }
    public static int hexToDecimal(String hexValue){
        int decimalValue = 0;
        
        for(int i = 0; i < hexValue.length() ; i++){
            char hexChar = hexValue.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    
    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        
        else
            return ch - '0';
        
    }
}
