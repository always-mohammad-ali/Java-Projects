
package labpractices;


public class Student {
    private String name;
    private int id;
    private static int totalStudents = 0;
    
    public Student(String name, int id){
        this.name = name;
        this.id = id;
        this.totalStudents++;
        
    }
    public static int getTotalStudents(){
      return totalStudents;
   }
    
    //getters
    protected int getID(){
        return this.id;
    }
    String getEmails(){
        return this.name.toLowerCase().replace(" ", ".") + "@northsouth.edu";
    }
    
    public String getName(){
        return this.name;
    }
    
}
