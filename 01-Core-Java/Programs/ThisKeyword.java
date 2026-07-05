class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + this.name);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Himanshi");
        s1.display();
    }
}