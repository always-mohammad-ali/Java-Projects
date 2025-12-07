
package bookpractices;

public class TestGeometricObject {
   public static void main(String[] args){
       Circle circle = new Circle(5, "blue", true);
       
       System.out.println("Circle "+ circle.toString());
       System.out.println(circle.getArea());
       System.out.println(circle.getPerimeter());
       System.out.println(circle.getDiameter());
       circle.printCircle();

       Rectangle1 r = new Rectangle1(5, 6, "yellow", true);
       
       System.out.println("Rectangle " + r.toString());
       System.out.println(r.getArea());
       System.out.println(r.getPerimeter());
       System.out.println(r.getWidth());
       System.out.println(r.getHeight());
       
      
       
   }
}
