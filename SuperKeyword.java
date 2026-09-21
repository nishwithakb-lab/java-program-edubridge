
class Parent {
    int number = 100;

    void display() {
        System.out.println("Parent class method");
    }
}

public class SuperKeyword extends Parent {

    int number = 200;

    void show() {
        System.out.println("Child variable: " + number);
        System.out.println("Parent variable: " + super.number);

        super.display();
    }

    public static void main(String[] args) {
        SuperKeyword obj = new SuperKeyword();

        obj.show();
    }
}
