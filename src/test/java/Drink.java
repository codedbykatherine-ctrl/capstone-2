import java.util.ArrayList;

public class Drink {
    private DrinkSize size;

    public void setDrinkSize( DrinkSize size ) {
        this.size = size;
    }

    public DrinkSize getDrink() {
        return this.size;
    }

    public double getPrice(){
        return this.size.getPrice();
    }
 //   private  ArrayList<Drink> drinks = new ArrayList<>();

    //public void addDrink(){
       // this.drinks.add(Order);





}
