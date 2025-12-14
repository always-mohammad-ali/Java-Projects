
package finallabpractices;


public class Circle {
    private double radius;
    private static int numberOfObjects = 0;
    
    public Circle(double radius) {
        setRadius(radius);
        numberOfObjects++;
        System.out.println("circle created with radius : " + radius);
   
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if(radius >= 0){
            this.radius = radius;
            System.out.println("Radius set to : " + radius);
        }
        else{
            throw new IllegalArgumentException("Radius can't be negative");
        }
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        Circle.numberOfObjects = numberOfObjects;
    }
    
    public double findArea(){
        return Math.PI * this.radius * this.radius;
    }
    
    
}
