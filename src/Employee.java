public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int id,String firstName,String lastName,double salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getID() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + " " + lastName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(int percent) {
        salary += (salary * percent) / 100;
    }

    public String toString() {
        return "Employee[id:" + id + ", name: " + getName() + ", salary:" + salary + "]";
    }

    
    public static void main(String[] args) {

        Employee employee = new Employee(12345, "John", "Doe", 50000);
        System.out.println("Original Details:");
        System.out.println(employee);


        employee.raiseSalary(10); // Raise salary by 10%
        System.out.println("\nAfter Salary Increase:");
        System.out.println(employee);


        System.out.println("\nAnnual Salary: $" + employee.getAnnualSalary());

    }
}
