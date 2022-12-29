package animals.birds;

import custom_exceptions.InvalidLifespanException;
import enums.Colors;
import enums.Habitats;
import interfaces.Herbivore;
import interfaces.Runnable;

public class Ostrich extends Bird  implements Runnable, Herbivore {
    public Ostrich(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }

    @Override
    public void eat() {

    }

    @Override
    public void setLifeSpan(int lifeSpan) {
        if(lifeSpan > 30){
            throw new InvalidLifespanException();
        }
        else this.lifeSpan = lifeSpan;
    }

    @Override
    public void eatGrass() {
        eat();
    }

    @Override
    public void run() {

    }
}
