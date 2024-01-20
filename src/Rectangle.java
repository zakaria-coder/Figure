public class Rectangle extends Figure{
    // Attributs pour la longueur et la largeur du rectangle
    private double longueur;
    private double largeur;

    // Constructeur de la classe Rectangle
    public Rectangle(String namefigure, double longueur, double largeur) {
        super(namefigure);
        this.longueur = longueur;
        this.largeur = largeur;
    }
    @Override
    public double calculerAire() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

}
