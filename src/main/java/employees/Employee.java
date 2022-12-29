package employees;

public abstract class Employee {

    protected String firstName, lastName;
    protected int salary;
    protected double zooExperience;

    public Employee(String firstName, String lastName, int salary, double zooExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.zooExperience = zooExperience;
    }

    public abstract void work();
}
