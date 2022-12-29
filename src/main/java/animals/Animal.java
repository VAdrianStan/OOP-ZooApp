package animals;

import enums.Colors;
import enums.Habitats;

public abstract class Animal {

    protected String name;
    protected String breed;
    protected int age;
    protected int lifeSpan;

    protected Colors color;
    protected Habitats habitat;

    public Animal(String name, String breed, int age, int lifeSpan, Colors color, Habitats habitat) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        setLifeSpan(lifeSpan);
        this.color = color;
        this.habitat = habitat;
    }

    public abstract void eat();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", lifeSpan=" + lifeSpan +
                ", color=" + color +
                ", habitat=" + habitat +
                '}';
    }

    public abstract void setLifeSpan(int lifeSpan);

    public int getAge() {return age;}
}
