import java.util.ArrayList;

public class Order {

    //order owns drink list
    ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<Taco> orderTacos = new ArrayList<>();

    public void addOrderTaco( Taco orderTaco){
        orderTacos.add(orderTaco);
    }

    public String orderSummary(){
        String summary = " ";
        for ( Taco taco : orderTacos){
            summary = summary + taco.tacoSummary();
        }
        return summary;
    }


    // void does smt but give nothing in return
    public void addDrink(Drink drink){
        this.drinks.add(drink);
        //the drinks list inside this order
        //addDrink - method name
        //Drink  drink - method Drink accepts one drink object
        //this - drink list from current order object
        // add - take this one drink and add it to this order's drink list
    }

    // getDrinks shows each drink
    public ArrayList<Drink> getDrinks(){
        return this.drinks;
    }



    public double getDrinkTotal(){
        double total = 0 ;

        // this drink list inside THIS order
        for (Drink drink : this.drinks ) { // for every drink in this orders list
             total += drink.getPrice();// go through every Drink object in this.drinks one by one
        }                              // add the price into the total
        return total;
    }

    public ArrayList<Taco> getOrderSummary(){
        return orderTacos;
    }








}
