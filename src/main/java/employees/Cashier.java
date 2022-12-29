package employees;

public class Cashier extends Employee {
    public Cashier(String firstName, String lastName, int salary, double zooExperience) {
        super(firstName, lastName, salary, zooExperience);
    }

    @Override
    public void work() {
        System.out.println("The cashier sales tickets");
    }
}
