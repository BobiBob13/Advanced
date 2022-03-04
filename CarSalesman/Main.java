package CarSalesman;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Engine> engineList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();

        while (n-- > 0) {
            String engineInfo = scan.nextLine();
            String engineModel = engineInfo.split("\\s++")[0];
            int enginePower = Integer.parseInt(engineInfo.split("\\s++")[1]);

            int engineDisplacement = Integer.parseInt(engineInfo.split("\\s++")[2]);

            if (engineInfo.split("\\s++").length > 3) {

                String engineEff = engineInfo.split("\\s++")[3];
                Engine engine = new Engine(engineModel, enginePower, engineDisplacement, engineEff);
                engineList.add(engine);
            } else {
                Engine engine = new Engine(engineModel, enginePower, engineDisplacement);
                engineList.add(engine);
            }


        }
        int m = Integer.parseInt(scan.nextLine());

        while (m-- > 0) {
            String carInfo = scan.nextLine();
            String carModel = carInfo.split("\\s++")[0];
            String engineModel = carInfo.split("\\s++")[1];

            if (carInfo.split("\\s++").length > 3) {
                String carColor = carInfo.split("\\s++")[3];
                int carWeight = Integer.parseInt(carInfo.split("\\s++")[2]);
                Car car = new Car(carModel, engineModel, carWeight, carColor);
                carList.add(car);
            }
            if (carInfo.split("\\s++").length == 3) {

                try {
                    carModel = carInfo.split("\\s++")[0];
                    engineModel = carInfo.split("\\s++")[1];
                    String carColor = carInfo.split("\\s++")[2];
                    Car car = new Car(carModel,engineModel,carColor);
                    carList.add(car);
                } catch (Exception e) {
                    carModel = carInfo.split("\\s++")[0];
                    engineModel = carInfo.split("\\s++")[1];
                    int carWeight = Integer.parseInt(carInfo.split("\\s++")[2]);
                    Car car = new Car(carModel,engineModel,carWeight);
                    carList.add(car);
                }
            }else if (carInfo.split("\\s++").length == 2){
                carModel =  carInfo.split("\\s++")[0];
                engineModel = carInfo.split("\\s++")[1];
                Car car = new Car(carModel,engineModel);
                carList.add(car);
            }


        }


    }
}
