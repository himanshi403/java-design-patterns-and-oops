class Student {

    final int rollNo;

    Student(int rollNo) {
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Roll Number: " + rollNo);
    }
}

public class FinalKeyword {

    public static void main(String[] args) {

        Student s = new Student(101);

        s.display();
    }
}