package animals.fish;

import custom_exceptions.InvalidLifespanException;
import enums.Colors;
import enums.Habitats;
import interfaces.Herbivore;

public class ClownFish extends Fish implements Herbivore {
    public ClownFish(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }

    @Override
    public void eat() {

    }

    @Override
    public void setLifeSpan(int lifeSpan) {
        if(lifeSpan > 5){
            throw new InvalidLifespanException();
        }
        else this.lifeSpan = lifeSpan;
    }

    @Override
    public void swim() {

    }

    @Override
    public void eatGrass() {

    }
}
