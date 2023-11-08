public class CritèreMarque implements Critère {
    private String marque;

    public CritèreMarque(String marque) {
        this.marque = marque;
    }

    public boolean estSatisfaitPar(Voiture v) {
        if (marque == v.getMarque()) {
            return true;
        } else
            return false;
    }
}