
package bookpractices;


public class TwoDimensionalArray {
    public static void main(String[] args){
        int array [] [] = { {1, 2, 93}, {4, 5, 6}, {7, 8, 9} };
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                
                System.out.println( array [i] [j] );
            }
        }
    }
}
