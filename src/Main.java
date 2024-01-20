


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // Création d'objets de différentes figures géométriques
        Cercle cercle1 = new Cercle("Cercle 1", 5);
        Rectangle rectangle1 = new Rectangle("Rectangle 1", 4, 6);

        // Ajoutez d'autres objets de figures géométriques selon vos besoins


        // Calcul de l'aire et du périmètre, et affichage des détails pour chaque figure
        afficherDetailsEtCalculer(cercle1);
        System.out.println();
        afficherDetailsEtCalculer(rectangle1);
        System.out.println();

        // Ajoutez d'autres appels pour d'autres objets de figures géométriques

    }

    private static void afficherDetailsEtCalculer(Rectangle rectangle1) {
        rectangle1.afficherDetails();
        System.out.println("---------------");
        System.out.println("Aire calculée : " + rectangle1.calculerAire());
        System.out.println("Périmètre calculé : " + rectangle1.calculerPerimetre());
    }
    private static void afficherDetailsEtCalculer(Cercle cercle1) {
        cercle1.afficherDetails();
        System.out.println("---------------");
        System.out.println("Aire calculée : " + cercle1.calculerAire());
        System.out.println("Périmètre calculé : " + cercle1.calculerPerimetre());
    }


}
