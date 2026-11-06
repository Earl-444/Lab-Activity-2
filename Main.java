public static void main(String[] args) {
  Vehicle[] vehicles = {
      new Car("Toyota", "Camry", 2020, 4),
      new Motorcycle("Yamaha", "MT-07", 2025, "Parallel Twin"),
      new Truck("Isuzu", "Giga", 2024, 10)
  };

  for (Vehicle vehicle : vehicles) {
    vehicle.moveForward();
    vehicle.moveBackwards();
    vehicle.moveLeft();
    vehicle.moveRight();
  }
}