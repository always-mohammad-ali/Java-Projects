
package labpractices;


public class TestAnimal {
    public static void main(String[] args){
        Dog d = new Dog("hybrid", "poko", 15);
        d.makeSound();
        d.eat();
        d.swim();
       
        System.out.println(d.getSwimSpeed() + "km/h and age = " +  d.getAge());
        
        
        Bird b = new Bird(3.5, "harry", 2);
        b.makeSound();
        b.eat();
        b.fly();
       // b.buildNest();
        System.out.println(b.getFlyHeight() + "meter and age = " + b.getAge());
        
        Animal bird = new Bird(5.5, "messi", 3);
        bird.eat();
        System.out.println("meter and age = " + bird.getAge());
        
    }
}
