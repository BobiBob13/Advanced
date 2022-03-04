package Hotel;

public enum DiscountType {
    VIP(0.20),
    Second_Visit(0.10),
    None(0);

    private double percentage;

    DiscountType(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {

        return percentage;
    }


    public  static  DiscountType parseDiscount (String discount){
        switch (discount){
            case "VIP":
                return VIP;
            case "SecondVisit":
                return Second_Visit;
            case "None":
                return None;
            default:
                throw new IllegalArgumentException("Unknow discount");
        }

    }
}
