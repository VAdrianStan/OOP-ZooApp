package animals.insects;

import animals.Animal;
import enums.Colors;
import enums.Habitats;

public abstract class Insect extends Animal {

    public Insect(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }
}
