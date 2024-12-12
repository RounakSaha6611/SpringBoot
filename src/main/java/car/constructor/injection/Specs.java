package car.constructor.injection;

public class Specs {
    private String color;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Specs{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
