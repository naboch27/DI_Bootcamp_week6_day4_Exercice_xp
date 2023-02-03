import javax.naming.spi.DirStateFactory.Result;

/**
 * Rectangle
 */
public class Rectangle {

    private double longueur;

    private double largeur;

    public Rectangle() {
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
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

    double Area() {

        double result = this.largeur * this.longueur;
        return result;
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setLargeur(4.5);

        rectangle1.setLongueur(4.5);

        Rectangle rectangle2 = new Rectangle();

        rectangle2.setLargeur(5.8);

        rectangle2.setLongueur(5.8);

        System.out.println("L'air du rectangle 1 de longueur : " + rectangle1.getLongueur() + " et de largueur : "
                + rectangle1.getLargeur() + " est " + rectangle1.Area());

        System.out.println("L'air du rectangle 2 de longueur : " + rectangle2.getLongueur() + " et de largueur : "
                + rectangle2.getLargeur() + " est " + rectangle2.Area());

        System.out.println("L'air du rectangle 1 et 2 est : " + (rectangle1.Area() + rectangle2.Area()));

    }

}