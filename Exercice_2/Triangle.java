/**
 * Triangle
 */
public class Triangle {

    private double cote;

    public Triangle() {
    }

    public double getCote() {
        return this.cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    double perimetre() {
        // write definition here

        return this.cote + this.cote + this.cote;
    }

    double aire(double hauteur) {
        // write definition here

        return ((this.cote * hauteur) / 2);
    }

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();

        Triangle triangle2 = new Triangle();

        Triangle triangle3 = new Triangle();

        triangle1.setCote(3);

        triangle2.setCote(4);

        triangle3.setCote(5);

        System.out.println(
                "Le perimetre du triangle qui a le cote :" + triangle1.getCote() + " est : " + triangle1.perimetre());

        System.out.println(
                "Le perimetre du triangle qui a le cote :" + triangle2.getCote() + " est : " + triangle2.perimetre());

        System.out.println(
                "Le perimetre du triangle qui a le cote :" + triangle3.getCote() + " est : " + triangle3.perimetre());

        System.out.println("Lair du triangle qui a le cote :" + triangle1.getCote() + " est : " + triangle1.aire(4));

        System.out.println("Lair du triangle qui a le cote :" + triangle2.getCote() + " est : " + triangle2.aire(4));

        System.out.println("Lair du triangle qui a le cote :" + triangle3.getCote() + " est : " + triangle3.aire(4));
    }

}