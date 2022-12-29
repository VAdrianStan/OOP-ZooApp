package animals.birds;

import animals.Animal;
import enums.Colors;
import enums.Habitats;

public abstract class Bird extends Animal {

    public Bird(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }
}
