package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private List<Animal> animaux;

    /**
     * Constructeur pour créer un zoo.
     *
     * @param nom le nom du zoo
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Ajoute un animal au zoo.
     *
     * @param nomAnimal    le nom de l'animal
     * @param typeAnimal   le type de l'animal
     * @param comportement le comportement de l'animal
     */
    public void addAnimal(String nomAnimal, TypeAnimal typeAnimal, ComportementAnimal comportement) {
        Animal animal = new Animal(nomAnimal, typeAnimal, comportement);
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux dans le zoo.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    /**
     * Retourne le nombre d'animaux dans le zoo.
     *
     * @return le nombre d'animaux
     */
    public int taille() {
        return animaux.size();
    }

    // Getter et setter pour le nom du zoo
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
}
