public abstract class Employee extends Person {

    private int employeeId;
    private double salary;


    public Employee(String name, int age, Address address, int employeeId, double salary) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public Employee(int employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public void greeting() {

        System.out.println("kan jag hjälpa till med något?");
        System.out.println();

    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return "Employee{" +
                "employeeId=" + employeeId +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                s +
                '}';
    }
}
