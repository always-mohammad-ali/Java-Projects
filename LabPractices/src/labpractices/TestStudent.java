
package labpractices;

public class TestStudent {
  public static void main(String[] args){
      Student s1 = new Student("ali", 1001);
      Student s2 = new Student("Salim", 1002);
      
      System.out.println(s1.getName());
      System.out.println(s1.getID());
      System.out.println(s1.getEmails());
      
      System.out.println(s2.getName());
      System.out.println(s2.getID());
      System.out.println(s2.getEmails());
      
      System.out.println(Student.getTotalStudents());
      
  }  
}
