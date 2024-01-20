import java.lang.System;

abstract class Figure  {

    protected String namefigure;


     // Constructeur de la classe Figure
     public Figure(String namefigure) {
         this.namefigure = namefigure;
     }

     // Méthode abstraite pour calculer l'aire de la figure
     public abstract double calculerAire();

     // Méthode abstraite pour calculer le périmètre de la figure
     public abstract double calculerPerimetre();

     // Méthode pour afficher les détails de la figure
     public  void afficherDetails(){
      System.out.println("Nom de la figure : " + namefigure);
      System.out.println("Aire de la figure : " + calculerAire());
      System.out.println("Périmètre de la figure : " + calculerPerimetre());

     } ;

}
