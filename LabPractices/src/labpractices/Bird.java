
package labpractices;


public class Bird extends Animal implements Flyable{
    protected double wingSpan;
    
    public Bird(){
        this.wingSpan = 1.0;
    }

    public Bird(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public Bird(double wingSpan, String name, int age) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    
    public void makeSound(){
        System.out.println("Chirp! Chirp!");
    }
    
    public void eat(){
        System.out.println(this.name + " is eating seeds");
    }
    
    public void fly(){
        System.out.println(this.name + " is flying");
    }
    public int getFlyHeight(){
        return 100;
    }
    public void buildNest(){
        System.out.println("Bird is building a nest");
    }
}
