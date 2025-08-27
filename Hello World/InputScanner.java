import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Your cgpa: ");
        double cgpa = scanner.nextDouble();

        System.out.print("Are you really a student?(True/false) :");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hellooo!  "+ name +", You are a cool person...");

        System.out.println("You are "+ age + " years old");

        System.out.println("Your cgpa is "+ cgpa);

        if(isStudent){
            System.out.println("You can enroll here");
        }
        else{
            System.out.println("You can't enroll here");
        }
        

        scanner.close();

    }
}