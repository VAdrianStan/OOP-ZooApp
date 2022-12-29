package animals.species;

import animals.Animal;
import animals.birds.*;
import animals.fish.*;
import animals.insects.*;
import animals.mammals.*;
import animals.reptiles.*;
import enums.Colors;
import enums.Habitats;
import utils.Generator;

import java.util.ArrayList;
import java.util.Arrays;

public class Species {
    static Giraffe giraffe = new Giraffe(Generator.generateName(), "American Eagle", 3, 10, Colors.BROWN, Habitats.SAVANNAH);
    static Gorilla gorilla = new Gorilla(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Lion lion = new Lion(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Rabbit rabbit = new Rabbit(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Whale whale = new Whale(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Crocodile crocodile = new Crocodile(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Frog frog = new Frog(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Lizzard lizzard = new Lizzard(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Snake snake = new Snake(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Tourtoise tourtoise = new Tourtoise(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Falcon falcon = new Falcon(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Flamingo flamingo = new Flamingo(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Ostrich ostrich = new Ostrich(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Parrot parrot = new Parrot(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Penguin penguin = new Penguin(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static ClownFish clownFish = new ClownFish(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Koi koi = new Koi(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Piranha piranha = new Piranha(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Shark shark = new Shark(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static StarFish starFish = new StarFish(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Butterfly butterfly = new Butterfly(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Mantis mantis = new Mantis(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Scorpio scorpio = new Scorpio(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Tarantula tarantula = new Tarantula(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);
    static Wasp wasp = new Wasp(Generator.generateName(), "American Eagle", 3, 1, Colors.BROWN, Habitats.SAVANNAH);


    public static ArrayList<Animal> birds = new ArrayList<>(Arrays.asList(falcon, flamingo, ostrich, parrot, penguin));
    public static ArrayList<Animal> mammals = new ArrayList<>(Arrays.asList(giraffe, gorilla, lion, rabbit, whale));
    public static ArrayList<Animal> insects = new ArrayList<>(Arrays.asList(butterfly, mantis, scorpio, tarantula, wasp));
    public static ArrayList<Animal> reptiles = new ArrayList<>(Arrays.asList(crocodile, frog, lizzard, snake, tourtoise));
    public static ArrayList<Animal> fish = new ArrayList<>(Arrays.asList(clownFish, koi, piranha, shark, starFish));
}