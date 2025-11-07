
package bookpractices;


public class Rectangle {
    public double width = 1.0;
    public double height = 1.0;
    
    public Rectangle(){
        
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        double area = width * height;
        
        System.out.println("Area = " + area);
        return area;
        
    }
    
    public double getPerimeter(){
        double perimeter = 2 * (width + height);
        System.out.println("Perimeter = " + perimeter);
        return perimeter;
    }
}

