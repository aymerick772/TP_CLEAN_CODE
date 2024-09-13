package ex2;

/**
 * Classe abstraite représentant un compte bancaire de base.
 */
public abstract class CompteBancaire {

    /** Solde du compte */
    protected double solde;

    /** Découvert autorisé (0 par défaut pour les comptes qui n'ont pas de découvert) */
    protected double decouvert;

    /**
     * Constructeur pour un compte bancaire de base.
     *
     * @param solde     le solde initial du compte
     * @param decouvert le découvert autorisé
     */
    public CompteBancaire(double solde, double decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;
    }

    public CompteBancaire(String type, double solde, int i, double tauxRemuneration) {
    }

    /**
     * Ajoute un montant au solde du compte.
     *
     * @param montant le montant à ajouter
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant du solde du compte.
     *
     * @param montant le montant à débiter
     * @return true si le débit a été effectué, false sinon
     */
    public abstract boolean debiterMontant(double montant);

    // Getters et setters

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
