package Hotel;

import Hotel.DiscountType;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculatedPrice() {
        return (pricePerDay * season.getMultiplier() * numberOfDays * (1 - discountType.getPercentage()));
    }
}
