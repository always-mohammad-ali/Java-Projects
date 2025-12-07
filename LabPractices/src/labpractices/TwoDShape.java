
package labpractices;

public abstract class TwoDShape extends Shape {
    protected double borderThickness;

    public TwoDShape() {
        super();
        this.borderThickness = 1.0;
    }

    public TwoDShape(double borderThicness, String color, boolean filled) {
        super(color, filled);
        this.borderThickness = borderThicness;
    }

    public double getBorderThickness() {
        return borderThickness;
    }

    public void setBorderThickness(double borderThickness) {
        this.borderThickness = borderThickness;
    }
    
    public abstract double calculateDiagonal();

    @Override
    public String toString() {
        return "TwoDShape{" + "borderThickness=" + borderThickness + '}';
    }
    
    
    
}
