package solidpri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//SRP - Instead of single solid.second.CarApp class,
//solid.second.Ola/solid.second.Uber can do it (SRP)
class Ola extends CarApp {
 List<String> carList;
 HashMap<String, String> carDriver;
 HashMap<String, String> driverDetails;
 String name;
 String email;
 String phone;

 Ola() {
     carList = new ArrayList<String>();
     carList.add("XUV");
     carList.add("Swift");
     carDriver = new HashMap<String, String>();
     carDriver.put("XUV", "Karthik");
     carDriver.put("Swift", "Vishnu");
     driverDetails = new HashMap<String, String>();
     driverDetails.put("Karthik", "9700234567");
     driverDetails.put("Vishnu", "8686357876");
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
         System.out.println("Booking made by: " + name);
         System.out.println(car + " Booking Confirmed\nThe driver is " + driverName + "\nContact:"
                 + driverDetails.get(driverName));
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