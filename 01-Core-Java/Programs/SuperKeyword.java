class Animal {

    String name = "Animal";

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    String name = "Dog";

    void display() {

        System.out.println(super.name);

    }

    void sound() {

        super.sound();

        System.out.println("Dog barks");

    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.display();

        d.sound();

    }
}