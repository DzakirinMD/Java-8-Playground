package inheritance.parent;

public class Vehicle {

    protected String brand = "Ford";

    public void honk(){
        System.out.println(" Tuut, Tuut ! ");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
