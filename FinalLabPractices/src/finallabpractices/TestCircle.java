
package finallabpractices;


public class TestCircle {
    public static void main(String[] args){
        try{
            System.out.println("--CREATING CIRCLE OBJECTSJ--");
            
            Circle c1 = new Circle(5);
            System.out.println("c1 area = " + c1.findArea());
            
            
            
            Circle c2 = new Circle(2);
            System.out.println("c1 area = " + c2.findArea());
            
            Circle c3 = new Circle(0);
            System.out.println("c1 area = " + c3.findArea());
            
            Circle c4 = new Circle(-15);
            System.out.println("c1 area = " + c4.findArea());
            
            Circle c5 = new Circle(50);
            System.out.println("c1 area = " + c5.findArea());
            
           
            
        }
        catch(Exception e){
            System.out.println("EXCEPTION CAUGHT");
            System.out.println(e.getClass().getName());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        
        finally{
            System.out.println("finally block starts from here");
            System.out.println("total circle objects created "+ Circle.getNumberOfObjects());
            System.out.println("program cleanfup completed");
        }
    }
}

