public enum DrinkSize {

    //stop invalid choices and organize related data
    // LOCKS THE CHOICES
    //CONTROLLED SET OF ALLOWED VALUES
    // SECRETLY TINY OBJECTS

    SMALL(2.00),
    MEDIUM(2.50),
    LARGE(3.00);

    //field to store parameter double
    private final double price;

     //double parameter catches price
    DrinkSize(double price) {
        this.price = price;
        //take incoming parameter store inside this objects field (price)
    }

    public double getPrice(){
        return price;

    }
}
