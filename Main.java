public class Main {
  public static void performService(Serviceable item) {
    item.service();
  }

  public static void main(String[] args) {
    Car car = new Car("Toyota", "Camry", 2020, 4);
    Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2025, "Parallel Twin");
    Truck truck = new Truck("Isuzu", "Giga", 2024, 10);
    Printer printer = new Printer();

    Serviceable[] serviceItems = { car, motorcycle, truck, printer };

    for (Serviceable item : serviceItems) {
      performService(item);
    }

    System.out.println();

    Vehicle[] vehicles = { car, motorcycle, truck };

    for (Vehicle vehicle : vehicles) {
      vehicle.displayInfo();
      vehicle.move();
      System.out.println();
    }
  }
}