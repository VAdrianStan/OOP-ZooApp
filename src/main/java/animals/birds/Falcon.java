package animals.birds;

import custom_exceptions.InvalidLifespanException;
import enums.Colors;
import enums.Habitats;
import interfaces.Carnivore;
import interfaces.Flyable;

public class Falcon extends Bird implements Flyable, Carnivore {
    public Falcon(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }

    @Override
    public void eat() {
        System.out.println("Falcon eats small animals");
    }

    @Override
    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 20) {
            throw new InvalidLifespanException();
        }
        else this.lifeSpan = lifeSpan;
    }

    @Override
    public void fly() {
        System.out.println("Falcon flies at high altitudes");
    }

    @Override
    public void eatMeat() {
        eat();
    }
}
