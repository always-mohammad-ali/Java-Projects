
package finallabpractices;

import java.io.*;
import java.util.Scanner;

public class QuizProcess {
    public static void main(String[] args) {
        File file = new File("quiz.txt");
        
        try{
            Scanner fileScanner = new Scanner(file);
            
            Scanner counterScanner = new Scanner(file);
            int recordCount = 0;
            
            while(counterScanner.hasNextLine()){
                counterScanner.nextLine();
                recordCount++;
            }
            counterScanner.close();
            
            System.out.println("Found " + recordCount + " quiz records!");
            
            Quiz[] quizArray = new Quiz[recordCount];
            
            fileScanner = new Scanner(file);
            
            int index = 0;
            
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                
                String[] parts = line.split(" ");
                
                int id = Integer.parseInt(parts[0]);
                int mark = Integer.parseInt(parts[1]);
                
                quizArray[index] = new Quiz(id, mark);
                
                index++;
                
            }
            
            fileScanner.close();
            System.out.println("--ALL QUIZ RECORDS--");
            for(int i = 0; i<quizArray.length; i++){
                quizArray[i].displayOutput();
            }
            
            int highestMark = -1;
            int highestId = -1;
            
            for(int i = 0; i < quizArray.length; i++){
                if(quizArray[i].getMark() > highestMark){
                    highestMark = quizArray[i].getMark();
                    highestId = quizArray[i].getId();
                }
                
            }
            
            System.out.println("Highest mark obtained by id : "+ highestId);
            System.out.println("Highest mark : " + highestMark);
        }
        catch(IOException e){
            System.out.println("Error! could not read file :" + e.getMessage());
        }
    }
}
