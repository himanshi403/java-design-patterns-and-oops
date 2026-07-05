class Student {

    String name;
    static String college = "College";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " studies at " + college);
    }
}

public class StaticKeyword {

    public static void main(String[] args) {

        Student s1 = new Student("Himanshi");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();
    }
}