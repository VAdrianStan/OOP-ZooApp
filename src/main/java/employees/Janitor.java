package employees;

import animals.Animal;

import java.util.ArrayList;

public class Janitor extends Employee {

    private ArrayList<Animal> animals;

    public Janitor(String firstName, String lastName, int salary, double zooExperience,
                   ArrayList<Animal> animals) {
        super(firstName, lastName, salary, zooExperience);
        this.animals = animals;
    }

    @Override
    public void work() {
        System.out.println("The janitor cleans cages");
    }
}
