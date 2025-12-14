
package finallabpractices;

import java.io.*;

public class StudentSerialization {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("ali", 251281);
        Student s2 = new Student("mohon", 21345);
        
        File file = new File("student.dat");
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(s1);
            oos.writeObject(s2);
        }
        catch(IOException e){
            System.out.println("error : " + e.getMessage());
        }
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
           Student stu1 = (Student) ois.readObject();
           Student stu2 = (Student) ois.readObject();
           
            System.out.println("name : " + stu1.getName() + " id : " + stu1.getId());
            System.out.println("name : " + stu2.getName() + " id : " + stu2.getId());
        }
        catch(IOException e){
            System.out.println("error : " + e.getMessage());
        }
               
    }
}
