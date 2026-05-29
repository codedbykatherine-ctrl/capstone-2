public enum Cheese {
    QUESO_FRESCO(.75,1.50,2.25),
    OAXACA(.75,1.50,2.25),
    COTIJA(.75,1.50,2.25),
    CHEDDAR(.75,1.50,2.25);
    private final double singleCheesePrice;
    private final double threeTacoCheesePrice;
    private final double burritoCheesePrice;

    Cheese(double singleCheesePrice, double threeTacoCheesePrice, double burritoCheesePrice) {
        this.singleCheesePrice = singleCheesePrice;
        this.threeTacoCheesePrice = threeTacoCheesePrice;
        this.burritoCheesePrice = burritoCheesePrice;
    }
    public double getPrice(String tacoStyle){
        if(tacoStyle.equalsIgnoreCase("Single")){
            return singleCheesePrice;
        }else if (tacoStyle.equalsIgnoreCase("3 taco")){
            return threeTacoCheesePrice;
        }else if (tacoStyle.equalsIgnoreCase("Burrito")){
            return burritoCheesePrice;
        }
        return 0;
    }
}

