
package WriteDataMain2;

import java.io.*;

public class WriteDataMain2 {
    public static void main(String[] args) throws Exception {
        String[] name = {"sei", "tumi", "eto", "ochena", "hole"};
        int[] id = {1, 2, 3, 4, 5};
        
        File file = new File("WriteFile2.txt");
        
        try(PrintWriter output = new PrintWriter(file)){
            for(int i = 0; i<5; i++){
                output.println(name[i] + " and " + id[i]);
            }
        }
        
               
    }
}
