
class InternetPlan {
    String planName;
    int data;
    int validity;
    double price;

    // Constructor 1
    InternetPlan() {
        this("Basic", 1, 28, 199);
    }

    // Constructor 2
    InternetPlan(String planName, double price) {
        this(planName, 2, 28, price);
    }

    // Constructor 3
    InternetPlan(String planName, int data, int validity, double price) {
        this.planName = planName;
        this.data = data;
        this.validity = validity;
        this.price = price;
    }

    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Data: " + data + " GB/day");
        System.out.println("Validity: " + validity + " days");
        System.out.println("Price: Rs." + price);
        System.out.println();
    }
}

public class InternetPlanProgram {
    public static void main(String[] args) {

        InternetPlan plan1 = new InternetPlan();
        InternetPlan plan2 = new InternetPlan("Premium", 399);
        InternetPlan plan3 = new InternetPlan("Super", 3, 56, 599);

        plan1.display();
        plan2.display();
        plan3.display();
    }
}
