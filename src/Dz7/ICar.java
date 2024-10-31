package Dz7;

public abstract class ICar {
    public String make;
    public String model;
    public void displayInfo() {
        System.out.println("модель: " + model);
        System.out.println("создатель: " + make);
    }
}
