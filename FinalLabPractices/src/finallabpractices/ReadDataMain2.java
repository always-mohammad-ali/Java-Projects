
package finallabpractices;

import java.io.File;
import java.util.Scanner;

public class ReadDataMain2 {
    public static void main(String[] args) throws Exception{
        File file = new File("data2.txt");
        
        
            Scanner input = new Scanner(file);
            
            while(input.hasNext()){
                String name = input.nextLine();
                int id = input.nextInt();
                
                System.out.println("Name : " + name + " ID: " + id);
                
                if(input.hasNext()){
                    input.nextLine();
                }
            }
            input.close();
        
       
    }
}
