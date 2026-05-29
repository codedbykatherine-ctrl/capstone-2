public enum Meat {
    //custom datatype with only allowed meat choices
    //string meat accepts anything that is a string
    CARNE_ASADA (1.00, 2.00, 3.00 ),
    AL_PASTOR (1.00, 2.00, 3.00 ),
    CARNITAS (1.00, 2.00, 3.00 ),
    POLLO (1.00, 2.00, 3.00 ),
    CHORIZO(1.00, 2.00, 3.00 ),
    PESCADO(1.00, 2.00, 3.00 );

    // field inside enum value
    //private final other classes can not directly touch- need getters
    private final double singlePrice;
    private final double threeTacoPrice;
    private final double burritoPrice;
    // final price can not change


    Meat(double singlePrice, double threeTacoPrice, double burritoPrice) {
        this.singlePrice = singlePrice;
        this.threeTacoPrice = threeTacoPrice;
        this.burritoPrice = burritoPrice;
    }
     public double getPrice(String tacoStyle){
        if(tacoStyle.equalsIgnoreCase("Single")){
            return singlePrice;
        }else if (tacoStyle.equalsIgnoreCase("3 taco")){
            return threeTacoPrice;
        }else if (tacoStyle.equalsIgnoreCase("Burrito")){
            return burritoPrice;
        }
        return 0;
     }
}
