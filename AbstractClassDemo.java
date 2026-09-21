
abstract class Shape {

    abstract void area();

    void display() {
        System.out.println("This is a shape");
    }
}

public class AbstractClassDemo extends Shape {

    @Override
    void area() {
        int length = 10;
        int width = 5;

        System.out.println("Area of Rectangle: " + (length * width));
    }

    public static void main(String[] args) {
        AbstractClassDemo obj = new AbstractClassDemo();

        obj.display();
        obj.area();
    }
}
