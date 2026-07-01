Class Student{
  String name;
  int age;

  Student() {
    name = "Unknown"
    age= 0;
  }

  Student(String name){
    this.name = name;
    age = 18;
  }

  Student(String name, int age){
    this.name = name;
    this.age = age;
  }
  void Display(){
    System.out.println(name+ " " + age);
  }
}
public class ConstructorOverloading{
  public static void main(String[] args){

  Student s1=new Student();
  Student s2 = new Student("Himanshi");
  Student s3 = new Student("Rahul", 20);

  s1.display();
  s2.display();
  s3.display();
  }
}

    
   
