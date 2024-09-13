package ex3;

/**
 * Classe animal.
 */
public class Animal {

    private String nom;
    private TypeAnimal type;
    private ComportementAnimal comportement;

    /**

     *
     * @param nom          le nom de l'animal
     * @param type         le type de l'animal (MAMMIFERE, POISSON, SERPENT, etc.)
     * @param comportement le comportement de l'animal (HERBIVORE, CARNIVORE, etc.)
     */
    public Animal(String nom, TypeAnimal type, ComportementAnimal comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeAnimal getType() {
        return type;
    }

    public void setType(TypeAnimal type) {
        this.type = type;
    }

    public ComportementAnimal getComportement() {
        return comportement;
    }

    public void setComportement(ComportementAnimal comportement) {
        this.comportement = comportement;
    }

    @Override
    public String toString() {
        return nom + " " + type + " " + comportement;
    }
}
