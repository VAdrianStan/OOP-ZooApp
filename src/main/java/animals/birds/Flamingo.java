package animals.birds;

import custom_exceptions.InvalidLifespanException;
import enums.Colors;
import enums.Habitats;
import interfaces.Flyable;
import interfaces.Herbivore;

public class Flamingo extends Bird implements Flyable, Herbivore {
    public Flamingo(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }

    @Override
    public void eat() {
        System.out.println("Flamingo eats fish");
    }

    @Override
    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 12){
            throw new InvalidLifespanException();
        }
        else this.lifeSpan = lifeSpan;
    }

    @Override
    public void fly() {

    }

    @Override
    public void eatGrass() {
        eat();
    }
}
