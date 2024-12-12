package car.autowire.constructor.injection;

public class Car {
    Specs specs;

    public Car(Specs specs) {
        this.specs = specs;
    }
//    public void setSpecs(Specs specs) {
//        this.specs = specs;
//    }

    public void carDetails(){
        System.out.println("Car details: " + specs.toString());
    }
}
