
package objectsclassrelated;


public class TestCourse {
    public static void main(String[] args){
        Student s1 = new Student("Mohammad Ali", 2512, 4.5);
        Course nsuCourse = new Course("JAVA", "CSE215", "HANNAN");
        nsuCourse.addStudent(s1);
        
        Student s2 = new Student("Elon", 2314, 5.0);
        Course bracCourse = new Course("Discrete", "CSE173", "JARIN");
        bracCourse.addStudent(s2);
        
        System.out.println("=== Nsu course roster ===");
        nsuCourse.printCourseRoster();
        
        System.out.println("=== Brac course roster ===");
        bracCourse.printCourseRoster();
    }
}
