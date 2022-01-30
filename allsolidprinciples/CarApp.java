package solidpri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// solid.second.CarApp class - open for extension, closed for modification (OCP)
// Substitute what can be fully extended (Liskov's Substitution principle) - solid.second.CarApp class fully extended by solid.second.Ola/solid.second.Uber class
// DIP - classes should depend on abstractions and not concretions, invert the dependency we get the same output
abstract class CarApp implements IDrivable, IBookable {
    abstract void signUp(String name, String phone);

    abstract void editProfile(String name, String rename);
}
//package solid.second.violation;

//import java.util.HashMap;
//import java.util.List;

//class CarAppViolate {
//  String name;
//  String phone;

//  List<String> carList;
//  HashMap<String,String> carDriver;
//  HashMap<String,String> driverDetails;


//  void signUpOla(String name, String phone) {
//      this.name=name;
//      this.phone=phone;
//  }

//  void signUpUber(String name, String phone) {
//      this.name=name;
//      this.phone=phone;
//  }

//  public void makeBookingOla(String car) {
//      String driverName = carDriver.get(car);
//      if (checkAvailable(car)){
//          System.out.println("Booking made by: "+name);
//          System.out.println(car + " Booking Confirmed\nThe driver is "+driverName+"\nContact:"+driverDetails.get(driverName));
//      }
//      else
//          System.out.println(car+" is not Available");
//  }

//  public void makeBookingUber(String car) {
//      String driverName = carDriver.get(car);
//      if (checkAvailable(car)){
//          System.out.println("Booking made by: "+name);
//          System.out.println(car + " Booking Confirmed\nThe driver is "+driverName+"\nContact:"+driverDetails.get(driverName));
//      }
//      else
//          System.out.println(car+" is not Available");
//  }

//  public boolean checkAvailable(String car) {
//      return carList.contains(car);
//  }

//}

//interface IDrivable {
//  void showRoute(String start, String end);
//  boolean checkAvailable(String car);
//  void makeBooking(String car);
//  String driverDetails(String car);
//}