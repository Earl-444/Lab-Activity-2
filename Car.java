public class Car extends Vehicle{
   private int numberOfDoors;
   
   Car(String brand, String model, int year, int numberOfDoors){
   super(brand,model,year);
   this.numberOfDoors = numberOfDoors;
   }
   
   @Override
   public void displayInfo(){
      super.displayInfo();
   System.out.print("number of doors : " + numberOfDoors);
   }
}
   