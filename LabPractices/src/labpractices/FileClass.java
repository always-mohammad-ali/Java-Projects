
package labpractices;

import java.io.File;
import java.util.Date;


public class FileClass {
    public static void main(String[] args){
        File f = new File("elon-profile.jpg");
        
        System.out.println("Does it exists? " + f.exists());
        System.out.println("The file has " + f.length());
        System.out.println("Can it be read? " + f.canRead());
        System.out.println("can it be written? " + f.canWrite());
        System.out.println("Is it a directory? " + f.isDirectory());
        System.out.println("Is it a file? " + f.isFile());
        System.out.println("is it absolute? " + f.isAbsolute());
        System.out.println("Is it hidden? " + f.isHidden());
        System.out.println("Absolute path is " + f.getAbsolutePath());
    }
}
