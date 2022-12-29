package employees;

public class Vet extends Employee{
    public Vet(String firstName, String lastName, int salary, double zooExperience) {
        super(firstName, lastName, salary, zooExperience);
    }

    @Override
    public void work() {
        System.out.println("The vet take care of sick animals");
    }
}
