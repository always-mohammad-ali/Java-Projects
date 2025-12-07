
package bookpractices;


public class Circle extends GeometricObject {
    private double radius;
    
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    
    public double getDiameter(){
        return 2 * this.radius;
    }
    
    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
        System.out.println("The radius is = " + this.radius + " and the area = " + getArea() + " and the perimeter = " + getPerimeter() + " and the diameter is = " + getDiameter());
    }
    
}
