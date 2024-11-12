public class Janitor extends Employee implements LockUp{
    public Janitor(String name, int age, Address address, int employeeId, double salary) {
        super(name, age, address, employeeId, salary);
    }

    public void stockWarhouse(){
        System.out.println("fyller på i lagret");
    }

    @Override
    public void lockWarehouse() {

    }

    @Override
    public void unlockWarehouse() {

    }
}
