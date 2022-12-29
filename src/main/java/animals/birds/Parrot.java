package animals.birds;

import custom_exceptions.InvalidLifespanException;
import enums.Colors;
import enums.Habitats;
import interfaces.Flyable;
import interfaces.Herbivore;

public class Parrot extends Bird implements Flyable, Herbivore {
    public Parrot(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }

    @Override
    public void eat() {

    }

    @Override
    public void setLifeSpan(int lifeSpan) {
        if(lifeSpan > 50){
            throw new InvalidLifespanException();
        }
        else this.lifeSpan = lifeSpan;
    }

    @Override
    public void fly() {

    }

    @Override
    public void eatGrass() {

    }
}
