import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("vägen","2B",12345);
        Address address2 = new Address("stigen","45",12345);

        Customer c1 = new Customer(1);
        Customer c2 = new Customer("Arne",57,address,2);

        //Employee e1 = new Employee("cecilia",34,address2,1,200);

        Employee s1 = new Seller("säljaren", 34, address, 35, 200);
        Employee j1 = new Janitor("vaktmästaren", 34, address, 26786, 200);




        ArrayList<Person> personList = new ArrayList<>();

        ArrayList<Employee> employeeList = new ArrayList<>();


        employeeList.add(j1);
        employeeList.add(s1);


        for (Employee e : employeeList){

            if(e instanceof Employee){
                System.out.println(e.getName() + " är anställd");
            }
            if (e instanceof Janitor){
                System.out.println(e.getName() + " är en vaktmästare");
            }
            if (e instanceof Seller){
                System.out.println(e.getName() + " är en säljare");
            }
            if (e instanceof LockUp){
                System.out.println(e.getName() + " har nyckeln till lagret");
            }

        }

//        personList.add(new Person("Bill",43,address));
//        personList.add(new Person("Bosse",56,address2));
//
//
//
    personList.forEach( p -> System.out.println(p));
//
//        System.out.println("c1 = " + c1);
//        System.out.println("c2 = " + c2);
//        System.out.println("e1 = " + e1);
//
//        s1.processOrder(new Order());
//        j1.stockWarhouse();
//
//
//
//        e1.greeting();
//
//        c2.greeting();

    }
}