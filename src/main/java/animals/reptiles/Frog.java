package animals.reptiles;

import custom_exceptions.InvalidLifespanException;
import enums.Colors;
import enums.Habitats;

public class Frog extends Reptile{
    public Frog(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }

    @Override
    public void eat() {

    }

    @Override
    public void setLifeSpan(int lifeSpan) {
        if(lifeSpan > 20){
            throw new InvalidLifespanException();
        }
        else this.lifeSpan = lifeSpan;
    }
}
