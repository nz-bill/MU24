public class Seller extends Employee implements LockUp{


    public Seller(String name, int age, Address address, int employeeId, double salary) {
        super(name, age, address, employeeId, salary);
    }


    public boolean processOrder(Order order){

        if(order != null){
            System.out.println(order + " is processed");
            return true;
        }
        return  false;

    }

    @Override
    public void lockWarehouse() {

    }

    @Override
    public void unlockWarehouse() {

    }
}
