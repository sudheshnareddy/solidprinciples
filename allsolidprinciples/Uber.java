package solidpri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class Uber extends CarApp {
    List<String> carList;
    HashMap<String, String> carDriver;
    HashMap<String, String> driverDetails;
    String name;
    String email;
    String phone;

    Uber() {
        carList = new ArrayList<String>();
        carList.add("Ritz");
        carList.add("Innova");
        carDriver = new HashMap<String, String>();
        carDriver.put("Ritz", "Sagar");
        carDriver.put("Innova", "Vamshi");
        driverDetails = new HashMap<String, String>();
        driverDetails.put("Sagar", "970874567");
        driverDetails.put("Vamshi", "8682657876");
    }

    void signUp(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void editProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String driverDetails(String car) {
        return driverDetails.get(carDriver.get(car));
    }

    public void makeBooking(String car) {
        String driverName = carDriver.get(car);
        if (checkAvailable(car)) {
            System.out.println("\nBooking made by: " + name);
            System.out.println(car + " Booking Confirmed\nThe driver is " + driverName + "\nContact:"
                    + driverDetails.get(driverName) + "\n");
        } else
            System.out.println(car + " is not Available");
    }

    public void showRoute(String start, String end) {
        System.out.println("The route starts from " + start + " to X to Y to Z " + end);
    }

    public boolean checkAvailable(String car) {
        return carList.contains(car);
    }
}
