
package labpractices;


public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle(5, "green");
        c1.getArea();
        System.out.println(c1);
        
        Cylinder cy1 = new Cylinder(10, 5, "blue");
        System.out.println(cy1);
        
        Cylinder cy2 = new Cylinder(5, 5, "red");
        System.out.println(cy2);
    }
}
