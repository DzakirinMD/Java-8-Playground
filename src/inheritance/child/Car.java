package inheritance.child;

import inheritance.parent.Vehicle;

// This Car class is inherited from the parent class Vehicle
public class Car extends Vehicle {

    private String modelName = "Mustang";

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
