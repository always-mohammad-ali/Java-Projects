
package labpractices;


public abstract class ThreeDShape extends Shape {
    protected double depth;
    
    public ThreeDShape(){
        super();
        this.depth = 1.0;
    }

    public ThreeDShape(double depth, String color, boolean filled) {
        super(color, filled);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
    
    public abstract double getVolume();

    @Override
    public String toString() {
        return "ThreeDShape{" + "depth=" + depth + '}';
    }
    
    
    
}
