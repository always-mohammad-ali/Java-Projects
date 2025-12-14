
package finallabpractices;

import java.io.*;

public class WriteDataMain3 {
    public static void main(String[] args) throws Exception {
        String[] name = {"elon", "donald jr", "zukerber broooooo"};
        int[] id = {1234, 3445, 654};
        
        File file = new File("WriteFile3.txt");
        
        try(FileWriter output = new FileWriter(file, true)){
            for(int i = 0; i< 3; i++){
                output.write(name[i] + " -- " + id[i] + "\n");
            }
        }
        
    }
}
