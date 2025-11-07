
package objectsclassrelated;


public class Course {
    private String courseName;
    private String courseCode;
    private String instructor;
    private Student[] students;
    private int studentCount;
    private final int MAX_STUDENTS = 30;
    
    
    public Course(String courseName, String courseCode, String instructor){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
        
    }
    
    public boolean addStudent(Student s){
        if(studentCount < MAX_STUDENTS){
            students[studentCount] = s;
            studentCount++;
            
            return true;
        }
        else {
            return false;
        }
    }
    
    public void printCourseRoster(){
        System.out.println("Course Name: " + courseName + " Course Code: " + courseCode);
        
        for(int i = 0; i < studentCount; i++){
            students[i].printInfo();
        }
    }
    
    
}
