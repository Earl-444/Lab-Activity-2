public class Motorcycle extends Vehicle{
   private String EngineType;
   
   Motorcycle(String brand, String model, int year, String EngineType){
   super(brand,model,year);
   this.EngineType = EngineType;
   }
   
   @Override
   public void displayInfo(){
      super.displayInfo();
   System.out.print("Engine Type : " + EngineType);
   }
}
   