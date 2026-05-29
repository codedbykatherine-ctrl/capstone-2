import java.util.ArrayList;

public class Drink {
    private DrinkSize size;
    private String flavor;

    public void setDrinkSize( DrinkSize size ) {
        this.size = size;
    }

    public DrinkSize getDrinkSize() {
        return this.size;
    }

    public double getPrice(){
        return this.size.getPrice();
    }
    public void setDrinkFlavor(String flavor){
        this.flavor = flavor;
    }
    public String drinkSummary(){
        return "Drink:" + size + " " + flavor  + "----$"+ getPrice();


    }





}
