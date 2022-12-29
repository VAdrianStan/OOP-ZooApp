package animals.fish;

import animals.Animal;
import enums.Colors;
import enums.Habitats;
import interfaces.Swimmable;

public abstract class Fish extends Animal implements Swimmable {

    public Fish(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        super(name, breed, age, lifeSpan, color, habitat);
    }
}
