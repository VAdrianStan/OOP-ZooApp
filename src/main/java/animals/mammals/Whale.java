package animals.mammals;

import custom_exceptions.InvalidLifespanException;
import enums.Colors;
import enums.Habitats;

public class Whale extends Mammal{
    public Whale(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }

    @Override
    public void eat() {

    }

    @Override
    public void setLifeSpan(int lifeSpan) {
        if(lifeSpan > 150){
            throw new InvalidLifespanException();
        }
        else this.lifeSpan = lifeSpan;
    }
}
