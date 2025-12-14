
package finallabpractices;
import java.io.*;

public class DataStream {
    public static void main(String[] args) {
        File file = new File("dataStream.dat");
        
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))){
            dos.writeUTF("Mohammad ali");
            dos.writeInt(20);
        }
        catch(IOException e){
            System.out.println("error : " + e.getMessage());
        }
        
        try(DataInputStream dis = new DataInputStream(new FileInputStream(file))){
           String name =  dis.readUTF();
           int age =  dis.readInt();
           
            System.out.println("Name : " + name + " age : " + age);
        }
        catch(IOException e){
            System.out.println("error  : " + e.getMessage());
        }
        
                
    }
}
