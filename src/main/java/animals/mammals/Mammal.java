package animals.mammals;

import animals.Animal;
import enums.Colors;
import enums.Habitats;

public abstract class Mammal extends Animal {
    public Mammal(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }
}
