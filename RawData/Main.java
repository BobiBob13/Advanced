package RawData;

import RawData.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Cars> carsListFragile = new ArrayList<>();
        List<Cars> carsListFlamable = new ArrayList<>();

        String[] info = scan.nextLine().split("\\s+");
        while (!info[0].contains("fragile") || (info[0].contains("flamable"))) {

            String model = info[0];
            Integer engineSpeed = Integer.parseInt(info[1]);
            Integer enginePower = Integer.parseInt(info[2]);
            Integer cargoWeight = Integer.parseInt(info[3]);
            String cargoType = info[4];
            Double tireOnePress = Double.parseDouble(info[5]);
            Integer tireOneAge = Integer.parseInt(info[6]);
            Double tireTwoPress = Double.parseDouble(info[7]);
            Integer tireTwoAge = Integer.parseInt(info[8]);
            Double tireThreePress = Double.parseDouble(info[9]);
            Integer tireThreeAge = Integer.parseInt(info[10]);
            Double tireFourPress = Double.parseDouble(info[11]);
            Integer tireFourAge = Integer.parseInt(info[12]);


            Cars cars = new Cars(model, engineSpeed, enginePower, cargoWeight, cargoType, tireOnePress, tireOneAge, tireTwoPress, tireTwoAge, tireThreePress, tireThreeAge, tireFourPress, tireFourAge);
            if (cargoType.equals("fragile")) {
                if (tireOnePress < 1) {
                    if (tireTwoPress < 1) {
                        if (tireThreePress < 1) {
                            if (tireFourPress < 1) {
                            }
                        }
                    }
                    carsListFragile.add(cars);
                }

            } else if (cargoType.equals("flamable")) {
                carsListFlamable.add(cars);

            }
            info = scan.nextLine().split("\\s+");

            if (info[0].equals("fragile")) {


                for (Cars cars1 : carsListFragile) {
                    System.out.println(cars1);
                }



            } else if (info.equals("flamable")) {
                for (Cars cars2 : carsListFlamable) {
                    System.out.println(cars2);
                }
            }

        }
    }
}

