
package finallabpractices;

import java.util.Date;
import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("unnamed.png");
        
        System.out.println("Does it exists? " + file.exists());
        System.out.println("can it read? " + file.canRead());
        System.out.println("Can it write? " + file.canWrite());
        System.out.println("absolute path ? "+ file.getAbsolutePath());
        System.out.println("size : " + file.length() + " byte ");
        System.out.println("is it a file? " + file.isFile());
        System.out.println("is it directory? " + file.isDirectory());
        System.out.println("file name " + file.getName());
        System.out.println("Last modified on " + new Date(file.lastModified()));
                
    }
}
