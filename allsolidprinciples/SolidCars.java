package solidpri;

public class SolidCars {
    public static void main(String[] args) {
        CarApp ola = new Ola();
        ola.signUp("sudheshna", "8112233432");
        ola.showRoute("nagole", "Hitech City");
        ola.makeBooking("Ritz");
        ola.makeBooking("XUV");

        Uber uber = new Uber();
        uber.signUp("sudhreddy", "6789354736");
        uber.showRoute("Secunderabad", "Banjara Hills");
        uber.makeBooking("Innova");
    }
}
