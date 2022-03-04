package Hotel;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] info = scan.nextLine().split("\\s++");

        double pricePerDay = Double.parseDouble(info[0]);
        int numberOfDays = Integer.parseInt(info[1]);
        Season season = Season.valueOf(info[2].toUpperCase(Locale.ROOT));
        DiscountType discountType = DiscountType.parseDiscount(info[3]);

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, numberOfDays, season, discountType);

        System.out.printf("%.2f%n",priceCalculator.calculatedPrice());

    }
}
