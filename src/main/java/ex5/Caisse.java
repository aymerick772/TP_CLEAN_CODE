package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;

    /**
     * Constructeur
     *
     * @param nom
     */
    public Caisse(String nom) {
        super();
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    // Getter et setter pour le nom de la caisse
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
