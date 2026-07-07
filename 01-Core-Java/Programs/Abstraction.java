abstract class Animal {
    abstract void Sound();
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    void Sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.Sound();
        a.sleep();
    }
}