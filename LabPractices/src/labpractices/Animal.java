
package labpractices;

public abstract class Animal{
    protected String name;
    protected int age;
    
    public Animal(){
        this.name = "tiger";
        this.age = 12;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public abstract void makeSound();
    public abstract void eat();
    
    public void sleep(){
        System.out.println(this.name + " is sleeping");
    }
    
    
}
