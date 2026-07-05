// Parent Class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a generic sound.");
    }
}

// Child Class 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Child Class 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog();       // Animal reference, Dog object
        Animal myCat = new Cat();       // Animal reference, Cat object

        myAnimal.makeSound(); 
        myDog.makeSound(); // Overridden method in Dog is called at runtime
        myCat.makeSound(); // Overridden method in Cat is called at runtime
    }
}