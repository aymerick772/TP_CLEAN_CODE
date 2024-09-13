package ex2;

/**
 * Classe représentant un compte courant avec découvert autorisé.
 */
public class CompteCourant extends CompteBancaire {

    /**
     * Constructeur pour un compte courant.
     *
     * @param solde     le solde initial du compte
     * @param decouvert le découvert autorisé
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde, decouvert);
    }

    /**
     * Débite un montant du solde du compte courant.
     * Le débit est autorisé même si le solde devient négatif, mais dans la limite du découvert.
     *
     * @param montant le montant à débiter
     * @return true si le débit a été effectué, false sinon
     */
    @Override
    public boolean debiterMontant(double montant) {
        if (solde - montant >= -decouvert) {
            solde -= montant;
            return true;
        }
        return false; // Débit refusé car dépasse le découvert autorisé
    }
}
