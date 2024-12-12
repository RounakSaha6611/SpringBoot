package car.setter.injection;

public class Car {
    Specs specs;

    public void setSpecs(Specs specs) {
        this.specs = specs;
    }

    public void carDetails(){
        System.out.println("Car details: " + specs.toString());
    }
}
