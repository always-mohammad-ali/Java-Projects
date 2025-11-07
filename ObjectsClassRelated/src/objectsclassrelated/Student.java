
package objectsclassrelated;


public class Student {
    public String name;
    public int id;
    public double gpa;
    
    public Student(String name, int id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    public void printInfo(){
        System.out.println("Name: " + name + " ID: " + id + " GPA: " + gpa);
    }
}
