import java.util.ArrayList;

public class Order {

    //order owns drink list
    ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<Taco> orderTacos = new ArrayList<>();

    public void addOrderTaco( Taco orderTaco){
        orderTacos.add(orderTaco);
    }
    public double getOrderTotal(){
        return orderTacoTotal()  + getDrinkTotal() + getChipsTotal();
    }

    public String orderSummary(){
        String summary = " ";
        for ( Taco taco : orderTacos){
            summary = summary + taco.tacoSummary() + "\n";
        }
        for(Drink drink : drinks){
            summary = summary + drink.drinkSummary() + "\n";
        }
        for (ChipsAndSalsa chips : chipsAndSalsas){
            summary = summary + chips.ChipsSummary() + "\n";
        }
        summary +=" \n Total: $"  + orderTacoTotal();

        return summary;
    }

    private ArrayList<ChipsAndSalsa> chipsAndSalsas= new ArrayList<>();

    public void addChipsAndSalsa(ChipsAndSalsa chipsAndSalsa){
        chipsAndSalsas.add(chipsAndSalsa);

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
    public double getChipsTotal(){
        double total = 0;
        for(ChipsAndSalsa chips : chipsAndSalsas){
            total += chips.getPrice();
        }
        return total;
    }

    public ArrayList<Taco> getOrderSummary(){
        return orderTacos;
    }

    public double orderTacoTotal(){
        double orderTacoTotal = 0;
        for( Taco taco : orderTacos){
            orderTacoTotal = orderTacoTotal + taco.tacoStylePrice();
        }
        return orderTacoTotal;

        }
    public String receiptSummary(){
        return"===============  RECEIPT ===============\n"+
                orderSummary() +
                "\n ----------------------- \n" +
                "\n Order total: $" + getOrderTotal()+
                " \n =============================== \n";

    }








}
