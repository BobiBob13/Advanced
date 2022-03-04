package CarExer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();
        while (n-- > 0) {
            String[] token = scan.nextLine().split("\\s+");
            Car car;
            if (token.length == 1) {
               car = new Car(token[0]);
            } else {
                 car = new Car(token[0], token[1], Integer.parseInt(token[2]));
            }
            cars.add(car);

        }
        for (Car car : cars) {
            System.out.printf("The car is: %s %s - %d HP.%n", car.brand, car.model, car.horsePower);
        }

    }


}


