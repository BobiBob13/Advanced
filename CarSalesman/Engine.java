package CarSalesman;

public class Engine {
    private String engineModel;
    private Integer enginePower;
    private Integer engineDisplacement;
    private String engineEfficiency;

    public Engine(String engineModel, Integer enginePower, Integer engineDisplacement, String engineEfficiency) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineDisplacement = engineDisplacement;
        this.engineEfficiency = engineEfficiency;
    }
    public Engine(String engineModel, Integer enginePower, Integer engineDisplacement) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.engineDisplacement = engineDisplacement;
        this.engineEfficiency = "n/a";
}
}

