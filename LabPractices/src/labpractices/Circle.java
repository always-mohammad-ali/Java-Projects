
package labpractices;


public class Circle {
    private double radius = 1.0;
    private String color = "red";
    
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String newColor){
        this.color = newColor;
    }
    
    public double getArea(){
        return this.radius * this.radius * Math.PI;
        
    }
    
    public String toString(){
        return "The circle area of radius = " + this.radius + " is " + getArea();
    }
    
}
