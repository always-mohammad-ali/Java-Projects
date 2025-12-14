
package finallabpractices;

import java.io.*;
import java.util.Scanner;


public class FileStream {
    public static void main(String[] args) {
        File file = new File("temp.dat");
        
        try(FileOutputStream fos = new FileOutputStream(file, true)){
            for(int i = 1; i <=10; i++){
                fos.write(i);
            }
        }
        catch(IOException e){
            System.out.println("error : " + e.getMessage());
        }
        
        try(FileInputStream fis = new FileInputStream(file)){
           int value;
           while((value = fis.read()) != -1){
               System.out.println(value);
           }
           
        }
        catch(IOException e){
            System.out.println("Erro to read: " + e.getMessage());
        }
    }
}
