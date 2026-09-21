
class Grandparent {
    void house() {
        System.out.println("Grandparent owns a house");
    }
}

class Parent extends Grandparent {
    void car() {
        System.out.println("Parent owns a car");
    }
}

public class MultilevelInheritance extends Parent {

    void bike() {
        System.out.println("Child owns a bike");
    }

    public static void main(String[] args) {
        MultilevelInheritance obj = new MultilevelInheritance();

        obj.house();
        obj.car();
        obj.bike();
    }
}
