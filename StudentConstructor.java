
public class StudentConstructor {
    String name;
    int age;

    StudentConstructor() {
        name = "Kavya";
        age = 19;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        StudentConstructor s1 = new StudentConstructor();

        s1.display();
    }
}
