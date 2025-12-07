
package labpractices;


public class Circle1 extends TwoDShape implements Drawable{
    private double radius;
    private String drawingColor;

    public Circle1() {
        super();
        this.radius = 1.0;
        this.drawingColor = "black";
    }
    
    
    
    public Circle1(double radius, String drawingColor, String color, boolean filled, double borderThickness) {
        super(color, filled, borderThickness);
        this.radius = radius;
        this.drawingColor = drawingColor;
        
        
    }

   

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    
    @Override
    public double calculateDiagonal(){
        return 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle1{" + "radius=" + radius + '}';
    }
    
    public void draw(){
        System.out.println("Radius = " + radius);
        System.out.println("Drawing color = " + drawingColor);
        System.out.println("Circle area : " + getArea());
        System.out.println("Circle perimeter = " + getPerimeter());
        System.out.println("Circle Diagonal = " + calculateDiagonal());
        
    }
    
    @Override
    public String getDrawingColor() {
        return drawingColor;
    }
    
    
    
    
}
