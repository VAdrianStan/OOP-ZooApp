package employees;

public class Security extends Employee {
    public Security(String firstName, String lastName, int salary, double zooExperience) {
        super(firstName, lastName, salary, zooExperience);
    }

    @Override
    public void work() {
        System.out.println("The security guy secures the area");
    }
}
