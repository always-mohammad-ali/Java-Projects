
package labpractices;


public class TestMax {
    public static void main(String[] args){
        int i = 5, j = 2;
        int k = max(i, j);
        
        System.out.println("The maximum of between " + i +" and " + j + " is " + k);
        
        int m = max(-100, 200);
        System.out.println("Maximum between -100 and 200 is " + m);
    }
    public static int max(int num1, int num2){
        int result;
        if(num1>num2){
            result = num1;
        }
        else{
            result = num2;
        }
        return result;
    }
}
