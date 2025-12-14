
package finallabpractices;

import java.io.*;

public class WriteDataMain1 {
    public static void main(String[] args) {
        
        String[] name = {"ali", "hasan", "hey"};
        int[] id = {45, 34, 1};
        
        File file = new File("writeFile1.txt");
        
        try{
            PrintWriter output = new PrintWriter(file);
            
            for(int i = 0; i< 3; i++){
                output.println(name[i]);
                output.println(id[i]);
            }
            output.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
