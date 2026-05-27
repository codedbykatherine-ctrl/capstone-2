import java.util.ArrayList;

public class Order {

    //order owns drink list
    ArrayList<Drink> drinks = new ArrayList<>();

    // void does smt but give nothing in return
    public void addDrink(Drink drink){
        this.drinks.add(drink);
        //the drinks list inside this order
        //addDrink - method name
        //Drink drink - method Drink accepts one drink object
        //this - drink list from current order object
        // add - take this one drink and add it to this order's drink list


    }

}
