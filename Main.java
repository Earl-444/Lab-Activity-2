public class Main {

  public static void printDetails(Vehicle vehicle) {
    vehicle.displayInfo();
    System.out.println();
  }

  public static void main(String[] args) {

    // DEMO 1: A parent reference holding a child object
    System.out.println("DEMO 1: A parent reference holding a child object");
    Vehicle vehicle = new Car("Toyota", "Camry", 2020, 4);
    printDetails(vehicle);
    System.out.println();

    vehicle = new Motorcycle("Yamaha", "MT-07", 2025, "Parallel - Twin");
    printDetails(vehicle);
    System.out.println();

    vehicle = new Truck("Isuzu", "Giga", 1994, 10);
    printDetails(vehicle);
    System.out.println();

    // DEMO 2: One method accepts different Vehicle subclasses
    System.out.println("DEMO 2: One method accepts different Vehicle subclasses");
    printDetails(new Car("Honda", "Civic", 2022, 4));
    printDetails(new Motorcycle("Harley-Davidson", "Street 750", 2023, "Liquid-cooled"));
    printDetails(new Truck("Volvo", "FH16", 2021, 15));

    System.out.println();

    // DEMO 3: One array holds different Vehicle subclasses
    System.out.println("DEMO 3: One array holds different Vehicle subclasses");
    Vehicle[] vehicles = {
        new Car("Ford", "Mustang", 2021, 2),
        new Motorcycle("Ducati", "Panigale V4", 2024, "V4"),
        new Truck("Mercedes-Benz", "Actros", 2020, 12)
    };

    for (Vehicle v : vehicles) {
      printDetails(v);
      System.out.println();
    }

  }

}