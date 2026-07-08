class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Generics {

    public static void main(String[] args) {

        Box<String> name = new Box<>();
        name.setValue("Himanshi");

        Box<Integer> marks = new Box<>();
        marks.setValue(95);

        System.out.println(name.getValue());
        System.out.println(marks.getValue());
    }
}