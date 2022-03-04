package RawData;

public class Tires {
    private String tires;
    private Double tireOnePressure;
    private Integer tireOneAge;
    private Double tireTwoPressure;
    private Integer tireTwoAge;
    private Double tireThreePressure;
    private Integer tireThreeAge;
    private Double tireFourPressure;
    private Integer tireFourAge;

    public void tires(String tires, Double tireOnePressure, Integer tireOneAge,
                      Double tireTwoPressure, Integer tireTwoAge,
                      Double tireThreePressure, Integer tireThreeAge,
                      Double tireFourPressure, Integer tireFourAge) {

        this.tires = tires;
        this.tireOnePressure = tireOnePressure;
        this.tireOneAge = tireOneAge;
        this.tireTwoPressure = tireTwoPressure;
        this.tireThreePressure = tireThreePressure;
        this.tireThreeAge = tireThreeAge;
        this.tireFourPressure = tireFourPressure;
        this.tireTwoAge = tireFourAge;
    }

    public void setTireOnePressure(Double tireOnePressure) {
        this.tireOnePressure = tireOnePressure;
    }

    public void setTireOneAge(Integer tireOneAge) {
        this.tireOneAge = tireOneAge;
    }

    public void setTireTwoPressure(Double tireTwoPressure) {
        this.tireTwoPressure = tireTwoPressure;
    }

    public void setTireTwoAge(Integer tireTwoAge) {
        this.tireTwoAge = tireTwoAge;
    }

    public void setTireThreePressure(Double tireThreePressure) {
        this.tireThreePressure = tireThreePressure;
    }

    public void setTireThreeAge(Integer tireThreeAge) {
        this.tireThreeAge = tireThreeAge;
    }

    public void setTireFourPressure(Double tireFourPressure) {
        this.tireFourPressure = tireFourPressure;
    }

    public void setTireFourAge(Integer tireFourAge) {
        this.tireFourAge = tireFourAge;
    }
}


