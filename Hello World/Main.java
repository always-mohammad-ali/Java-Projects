

public class Main{

    
    public static void main(String[] args){

        System.out.print("Hello JAVA WORLD \n");
        
        System.out.println("You can use 'sout' as shortcut for system.out.println");

        
        // println means print line, so it will create new line of output man.

        int age = 21;
        System.out.println(age);

        // INTERGER TYPE VARIABLE DECLARATION WITH ASSIGNED VALUE.
        int year = 2025;
        System.out.println("The year is: "+ year);

        //DOUBLE TYPE VARIABLE

        double gpa = 3.5;
        System.out.println(gpa);

        double price = 2400;
        System.out.println("$"+price);

        char grade = 'A';
        System.out.println(grade);

        char symbol = '@';
        System.out.println(symbol);

        //LETS USE BOOLEAN COMBINED WITH IF&ELSE BABY!
        
        boolean isNice = true;
        boolean areYouGeh = false;
        boolean isYou = true;

        if(isYou){
            System.out.println("Hi!");
        }
        else{
            System.out.println("Fuck you");
        }

    //   STRING BRO!
        String name ="ali bro";
        String gmail = "ali@gmail.com";
        
        System.out.println("Hello "+name);
        System.out.println("Your gmail name is "+gmail);

    }
}