
public abstract class Animal {

    public abstract void eat();
    public abstract void sleep();

}

public class Cat extends Animal {

    public void eat() {
        System.out.println("Cats eat food");
    }

    public void sleep() {
        System.out.println("Cats sleep in the bed");
    }

} 

public class Dog extends Animal {

    public void eat() {
        System.out.println("Dogs eat food");
    }

    public void sleep() {
        System.out.println("Dogs sleep in the bed");
    }

}

public class InheritanceTest {

    public static void main(String[] args) {
        
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}