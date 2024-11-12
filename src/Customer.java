import java.util.ArrayList;

public class Customer extends Person{

    private int customerId;
    private ArrayList<Order> orders;

    public Customer(String name, int age, Address address, int customerId) {
        super(name, age, address);
        this.customerId = customerId;
        this.orders = new ArrayList<>();;
    }

    @Override
    public void greeting() {
        //super.greeting();
        System.out.println(this.name + ": får jag ställa en fråga?");

        System.out.println();
    }

    public Customer(int customerId) {
        this.customerId = customerId;
        this.orders = new ArrayList<>();
    }
}
