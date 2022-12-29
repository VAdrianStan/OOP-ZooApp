import animals.reptiles.Crocodile;
import animals.species.Species;
import employees.Janitor;
import enums.Colors;
import enums.Habitats;


public class ZooEntryPoint {
    public static void main(String[] args) {

        Crocodile croc = new Crocodile("Croco", "Aligator", 25, 35, Colors.GREEN, Habitats.LAKE);

        System.out.println(croc.getAge());

        Janitor janitor1 = new Janitor("George", "Smith", 800, 3, Species.birds);


        System.out.println(Species.birds);
        System.out.println(Species.mammals);
        System.out.println(Species.fish);
        System.out.println(Species.reptiles);
        System.out.println(Species.insects);
    }
}
