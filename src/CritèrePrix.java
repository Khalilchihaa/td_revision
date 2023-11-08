public class CritèrePrix implements Critère {
    private float prix;

    public CritèrePrix(float prix) {
        this.prix = prix;
    }

    public boolean estSatisfaitPar(Voiture v) {
        if (prix == v.getPrixLocation()) {
            return true;
        } else
            return false;
    }
}