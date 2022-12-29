package animals.reptiles;

import animals.Animal;
import enums.Colors;
import enums.Habitats;

public abstract class Reptile extends Animal {
    public Reptile(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }
}
