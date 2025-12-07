
package labpractices;


public class Dog extends Animal implements Swimmable {
    protected String breed;

    public Dog() {
        this.breed = "random";
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String breed, String name, int age) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public void makeSound(){
        System.out.println("Woof! Woof1");
    }
    
    public void eat(){
        System.out.println(this.name + " is eating kibble");
    }
    
    public void swim(){
        System.out.println(this.name + " is swimming");
    }
    
    public int getSwimSpeed(){
        return 5;
    }
    
    public void fetch(){
        System.out.println("Dog is fetching the ball");
    }
    
    
    
    
}
