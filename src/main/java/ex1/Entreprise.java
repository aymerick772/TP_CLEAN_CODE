package ex1;

import java.util.Date;

public class Entreprise {

    /** Le capital maximal que peut avoir une entreprise */
    public static final int CAPITAL_MAX = 3000000;

    /** Le numéro SIRET  */
    public int siret;

    /** Le nom  */
    public String nom;

    /** L'adresse */
    public String adresse;

    /** La date de création de l'entreprise */
    public Date dateCreation;

    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
        //System.out.println("Le capital de l'entreprise est : " + this.capital());
    }
}
