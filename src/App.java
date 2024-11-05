import java.util.ArrayList;

public class App {
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Address> adressList = new ArrayList<>();

    public void run(){

            initApp();

            printEmloyees();

            employees.get(0).setAddress(adressList.get(1));

            printEmloyees();

//            employees.get(0).greeting();
//            employees.get(3).greeting();
    }
    public void initApp(){
        Address a1 = new Address("Gatan", "543", "staden");
        Address a2 = new Address("Strigen", "23B", "Byn");

        Employee e1 = new Employee("Bill",1000000,43, a1);
        Employee e2 = new Employee("Arne",100,70, a1);
        Employee e3 = new Employee("Carl", 1000377000, 21, a2);

        Employee e4 = new Employee();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        adressList.add(a1);
        adressList.add(a2);
    }
    public void printEmloyees(){
        for (Employee e : employees){
            System.out.println(e);
        }
    }

    public void printEmloyees2(){
            //gör samma som printEmployees()
           employees.forEach(e -> System.out.println(e));

    }
}
