
package labpractices;

public interface CourseEnrollable {
    public void enrollCourse(String courseCode);
    public void dropCourse(String courseCode);
     public List<String> getEnrolledCourses();
}
