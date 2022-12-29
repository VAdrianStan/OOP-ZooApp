package animals.birds;

import custom_exceptions.InvalidLifespanException;
import enums.Colors;
import enums.Habitats;
import interfaces.Carnivore;
import interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable, Carnivore {

    public Penguin(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }

    @Override
    public void eat() {

    }

    @Override
    public void setLifeSpan(int lifeSpan) {
        if(lifeSpan > 15){
            throw new InvalidLifespanException();
        }
        else this.lifeSpan = lifeSpan;
    }

    @Override
    public void eatMeat() {

    }

    @Override
    public void swim() {

    }
}
