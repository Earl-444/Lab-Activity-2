public class Main {

 public static void main(String[] agrs) {
 
 Vehicle vehicle1 = new Vehicle();
 vehicle1.brand = "Porsche"; 
 vehicle1.model = "Carrera GTS";
 vehicle1.year = 2025;
 vehicle1.displayInfo();
 
 System.out.println("Age: " + vehicle1.calculateAge());
 System.out.println("Vintage: " + vehicle1.isVintage());
 
 Vehicle vehicle2 = new Vehicle();
 vehicle2.brand = "Honda"; 
 vehicle2.model = "CR-X Si";
 vehicle2.year = 1985;
 vehicle2.displayInfo();
 
 System.out.println("Age: " + vehicle2.calculateAge());
 System.out.println("Vintage: " + vehicle2.isVintage());
 

 
 Vehicle vehicle3 = new Vehicle();
 vehicle3.brand = "Toyota"; 
 vehicle3.model = "GR Supra";
 vehicle3.year = 2026;
 vehicle3.displayInfo();
 
 System.out.println("Age: " + vehicle3.calculateAge());
 System.out.println("Vintage: " + vehicle3.isVintage());
 

 }


}