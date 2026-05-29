public enum TacoToppings {
    EXTRA_MEAT(.50, 1.00, 1.50),
    EXTRA_CHEESE(.30, .60, .90),
    LETTUCE(0, 0, 0),
    CILANTRO(0, 0, 0),
    ONIONS(0, 0, 0),
    TOMATOES(0, 0, 0),
    JALAPENOS(0, 0, 0),
    RADISHES(0, 0, 0),
    PICO(0, 0, 0),
    GUACAMOLE(0, 0, 0),
    CORN(0, 0, 0),
    private final double singlePrice;
    private final double threeTacoPrice;
    private final double burritoPrice;


    TacoToppings(double singlePrice, double threeTacoPrice, double burritoPrice) {
        this.singlePrice = singlePrice;
        this.threeTacoPrice = threeTacoPrice;
        this.burritoPrice = burritoPrice;
    }
    public double getPrice(String tacoStyle) {
        if (tacoStyle.equalsIgnoreCase("Single")) {
            return singlePrice;
        } else if (tacoStyle.equalsIgnoreCase("3 taco")) {
            return threeTacoPrice;
        } else if (tacoStyle.equalsIgnoreCase("Burrito")) {
            return burritoPrice;
        }

        return 0;

}
