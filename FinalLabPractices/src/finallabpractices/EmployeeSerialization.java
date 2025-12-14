
package finallabpractices;
import java.io.*;


public class EmployeeSerialization {
    public static void main(String[] args) throws Exception {
        
        Employee em1 = new Employee("ali", 100);
        Employee em2 = new Employee("rahman", 101);
        Employee em3 = new Employee("saad", 103);
        
        try(ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream("em.dat"))){
            op.writeObject(em1);
            op.writeObject(em2);
            op.writeObject(em3);
            System.out.println("3 objects saved successfully");
        }
        catch(IOException e){
            System.out.println("Error message : " + e.getMessage());
        }
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("em.dat"))){
           Employee e1 = (Employee) ois.readObject();
            System.out.println("Employee name : " + e1.getName() + " id : " + e1.getId());
            
            Employee e2 = (Employee) ois.readObject();
            System.out.println("Employee name : " + e2.getName() + " id : " + e2.getId());
            
            Employee e3 = (Employee) ois.readObject();
            System.out.println("Employee name : " + e3.getName() + " id : " + e3.getId());
            
            
        }
        catch(IOException e){
            System.out.println("Error message : " + e.getMessage());
        }
        
    }
}
