package CarSalesman;

public class Car {
    private String model;
    private String engine;
    private Integer weight;
    private String color;


    public Car(String model, String engine, Integer weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
        this.weight = null;
        this.color = "n/a";
    }

    public Car(String model, String engine, Integer weight) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = "n/a";
    }

    public Car(String model, String engine, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = null;
        this.color = color;
    }
}