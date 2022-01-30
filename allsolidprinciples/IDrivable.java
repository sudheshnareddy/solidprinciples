package solidpri;

//Interface Segregation principle (Each interface with only one responsibility)
interface IDrivable {
 void showRoute(String start, String end);

 boolean checkAvailable(String car);
}