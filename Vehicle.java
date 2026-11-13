public abstract class Vehicle {
  private String brand;
  private String model;
  private int year;

  public Vehicle(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = (year >= 1886 && year <= 2026) ? year : 2026;
  }

  public abstract void move();

  public abstract void moveForward();

  public abstract void moveBackwards();

  public abstract void moveLeft();

  public abstract void moveRight();

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public boolean setYear(int year) {
    if (year >= 1886 && year <= 2026) {
      this.year = year;
      return true;
    }
    return false;
  }

  public void displayInfo() {
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
  }

  public int calculateAge() {
    return 2026 - year;
  }

  public boolean isVintage() {
    return calculateAge() > 25;
  }
}