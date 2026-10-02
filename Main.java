public class Main {

 public static void main(String[] agrs) {
 
 Vehicle vehicle1 = new Vehicle("Porsche", "Carrera GTS", 2025);
    System.out.println("Brand: " + vehicle1.getBrand());
    System.out.println("Model: " + vehicle1.getModel());
    System.out.println("Year: " + vehicle1.getYear());
    
      System.out.println("Age: " + vehicle1.calculateAge());
      System.out.println("Vintage: " + vehicle1.isVintage());
      System.out.println();
 
 Vehicle vehicle2 = new Vehicle("Honda", "CR-X Si", 1985);
   System.out.println("Brand: " + vehicle2.getBrand());
   System.out.println("Model: " + vehicle2.getModel());
   System.out.println("Year: " + vehicle2.getYear());
   
      System.out.println("Age: " + vehicle2.calculateAge());
      System.out.println("Vintage: " + vehicle2.isVintage());
      System.out.println();
 
 Vehicle vehicle3 = new Vehicle("Toyota", "GR Supra", 2026);
   System.out.println("Brand: " + vehicle1.getBrand());
   System.out.println("Model: " + vehicle1.getModel());
   System.out.println("Year: " + vehicle1.getYear());
   
      System.out.println("Age: " + vehicle3.calculateAge());
      System.out.println("Vintage: " + vehicle3.isVintage());
      System.out.println();
      
        System.out.println("---- T E S T ----");

        System.out.println("setYear(2000): " + vehicle2.setYear(2000));
        System.out.println("Year: " + vehicle2.getYear());
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println();

        System.out.println("setYear(1885): " + vehicle2.setYear(1885));
        System.out.println("Year remains: " + vehicle2.getYear());

        System.out.println();

        System.out.println("setYear(2027): " + vehicle2.setYear(2027));
        System.out.println("Year remains: " + vehicle2.getYear());

        System.out.println();

    }
}

