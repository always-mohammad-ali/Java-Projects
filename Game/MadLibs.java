
import java.util.Scanner;


public class MadLibs{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective_1;
        String noun;
        String adjective_2;
        String adjective_3;
        String adjective_4;

        System.out.print("Enter an adjective (Descriptive): ");
        adjective_1 = scanner.nextLine();

        System.out.print("Enter a Name of animal: ");
        noun = scanner.nextLine();
        
        System.out.print("Enter an adjective (characteristic): ");
        adjective_2 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        adjective_3 = scanner.nextLine();

        System.out.print("Enter last adjective of your feelings: ");
        adjective_4 = scanner.nextLine();

        System.out.println("Today, I went to a " + adjective_1 + " zoo.");
        System.out.println("In an exhibit, I saw " + noun);
        System.out.println(noun +" was "+ adjective_2 + " and " + adjective_3);
        System.out.println("I was "+ adjective_4 +"!");
        

        scanner.close();
    }
}