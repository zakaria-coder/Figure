public class Cercle extends  Figure{
    private double rayon;
    public Cercle(String namefigure, double rayon) {
        super(namefigure);
        this.rayon = rayon;
    }
    // Implémentation de la méthode pour calculer l'aire du cercle
    @Override
    public double calculerAire() {
        return Math.PI * Math.pow(rayon, 2);
    }

    // Implémentation de la méthode pour calculer le périmètre du cercle
    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }



}

