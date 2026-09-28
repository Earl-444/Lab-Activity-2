public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("Porsche", "Carrera GTS", 2025),
            new Vehicle("Honda", "CR-X Si", 1985),
            new Vehicle("Toyota", "GR Supra", 2026)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("Age: " + vehicle.calculateAge());
            System.out.println("Vintage: " + vehicle.isVintage());
            System.out.println();
        }
    }
}