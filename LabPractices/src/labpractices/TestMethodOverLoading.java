
package labpractices;


public class TestMethodOverLoading {
    public static void main(String[] args){
        
        MethodOverLoading m1 = new MethodOverLoading(5, 7);
        
        System.out.println(m1.add(5,7));
        System.out.println(m1.add(10.0, 7.5));
        System.out.println(m1.add(5,7,1));
        
        
    }
}
