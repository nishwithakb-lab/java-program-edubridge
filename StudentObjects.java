
class Student {
    String name;
    int age;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class StudentObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Kavya";
        s1.age = 19;
        s1.marks = 85;

        s2.name = "Anu";
        s2.age = 20;
        s2.marks = 90;

        s3.name = "Rahul";
        s3.age = 19;
        s3.marks = 88;

        s1.display();
        s2.display();
        s3.display();
    }
}
