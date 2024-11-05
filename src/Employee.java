public class Employee {

    private String name;

    private int salary;

    private int age;

    private Address address;

    public Employee(){
        this.name = "no name";
        this.salary = 0;
        this.age = 0;
        this.address = new Address("","","");
    }

    public Employee(String name, int salary, int age, Address address) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int newSalary){
        this.salary = newSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equals("")){
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greeting(){
        if(this.address != null){
            System.out.println("hej, jag heter " + this.name + " och bor i " + this.address.getCity());
        } else{
            System.out.println("hej, jag heter " + this.name + " och jag är hemlös ");
        }

    }

    @Override
    public String toString() {
        return
                "name: " + name+
                ", salary: " + salary +
                ", age:" + age + ", " + address.toString();

    }
}
