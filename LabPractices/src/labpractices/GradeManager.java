
package labpractices;
import java.util.Scanner;
import java.util.Random;


public class GradeManager {
    private double[] grades;
    
    public GradeManager(int size){
        this.grades = new double[size];
        
        Random rand = new Random();
        
        for(int i = 0; i < grades.length; i++){
            grades[i] = Math.round(rand.nextDouble() * 100 *100.0)/100.0;
            
        }
        }
        
        public void displayGrades(){
            System.out.println("\n ---Student grades---");
            
            for(int i = 0; i < grades.length; i++){
                System.out.printf("Student %d: %.2f - %s\n", i+1, grades[i], getGradeLetter(grades[i]));
                
            }
        }
        
        private String getGradeLetter(double grade){
            if(grade >= 90) return "A";
            else if(grade >= 80) return "B";
            else if(grade >= 70) return "C";
            else if(grade >= 60) return "D";
            else return "F";
            
        }
        
        public double calculateAverage(){
            double sum = 0;
            
            for(double grade : grades){
                sum += grade;
            }
            return sum/grades.length;
        }
        
        public int countPassingStudent(int passingGrade){
            int count = 0;
            for(double grade : grades){
                if(grade >= passingGrade){
                    count++;
                }
                
            }
            return count;
        }
        
     
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter size of students: ");
            int size = input.nextInt();
            
            GradeManager manager = new GradeManager(size);
            manager.displayGrades();
            
            
            System.out.printf("\n Class Average: %.2f", manager.calculateAverage());
            System.out.println("\nTotal Passing Student: " + manager.countPassingStudent(60));
            
        }
}

