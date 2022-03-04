package RawData;

public class Cars {
    private String model;
    private Integer engineSpeed;
    private Integer enginePower;
    private String cargoType;
    private Integer cargoWeight;
    private Double tireOnePressure;
    private Integer tireOneAge;
    private Double tireTwoPressure;
    private Integer tireTwoAge;
    private Double tireThreePressure;
    private Integer tireThreeAge;
    private Double tireFourPressure;
    private Integer tireFourAge;

    //public RawData.Cars(String model, String engine, Integer cargo, Integer tires) {
       // this.model = model;
       // this.engine = engine;
       // this.cargo = cargo;
        //this.tires = tires;
    //}


    public Cars(String model,Integer engineSpeed, Integer enginePower, Integer cargoWeight, String cargoType, Double tireOnePress, Integer tireOneAge,
                Double tireTwoPress, Integer tireTwoAge, Double tireThreePress, Integer tireThreeAge, Double tireFourPress, Integer tireFourAge) {
        this.model = model;
        this.engineSpeed=engineSpeed;
        this.enginePower = enginePower;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
        this.tireOnePressure = tireOnePress;
        this.tireOneAge = tireOneAge;
        this.tireTwoPressure = tireTwoPress;
        this.tireTwoAge = tireTwoAge;
        this.tireThreePressure=tireThreePress;
        this.tireThreeAge=tireThreeAge;
        this.tireFourPressure=tireFourPress;
        this.tireFourAge=tireFourAge;
    }
}
