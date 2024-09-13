package ex3;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        zoo.addAnimal("Gazelle", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE);
        zoo.addAnimal("Zèbre", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE);
        zoo.addAnimal("Lion", TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE);
        zoo.addAnimal("Panthère", TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE);
        zoo.addAnimal("Requin blanc", TypeAnimal.POISSON, ComportementAnimal.CARNIVORE);
        zoo.addAnimal("Truite dorée", TypeAnimal.POISSON, ComportementAnimal.HERBIVORE);
        zoo.addAnimal("Boa constrictor", TypeAnimal.SERPENT, ComportementAnimal.CARNIVORE);
        zoo.addAnimal("Python", TypeAnimal.SERPENT, ComportementAnimal.CARNIVORE);

        zoo.afficherListeAnimaux();
    }
}
