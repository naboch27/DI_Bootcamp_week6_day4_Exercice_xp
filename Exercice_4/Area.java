import java.util.Scanner;

/**
 * 
 */
public class Area {

    private double longueur;

    private double largeur;

    public Area(double longueur, double largeur) {

        this.longueur = longueur;

        this.largeur = largeur;

        this.returnArea(longueur, largeur);

    }

    double returnArea(double longueur, double largeur) {

        return longueur * largeur;

    }

    public double getLongueur() {
        return this.longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);) {

            System.out.println("Entrez la longueur : ");

            double longueur = scanner.nextDouble();

            System.out.println("Entrez la largeur : ");

            double largeur = scanner.nextDouble();

            Area area = new Area(longueur, largeur);

            System.out.println("Aire du rectangle est : " + area.returnArea(longueur, largeur));
        }

    }

}