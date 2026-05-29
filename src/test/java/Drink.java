import java.util.ArrayList;

public class Drink {
    private DrinkSize size;

    public void setDrinkSize( DrinkSize size ) {
        this.size = size;
    }

    public DrinkSize getDrinkSize() {
        return this.size;
    }

    public double getPrice(){
        return this.size.getPrice();
    }





}
