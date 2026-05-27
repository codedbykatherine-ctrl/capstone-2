import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Drink drink1 = new Drink();
        drink1.setSize("medium");


        Order order1 = new Order();
        order1.addName("k");

       // Drink twisted = new Drink();
       // Drink drink;
        //twisted.addDrink(drink);


        Drink twisted = new Drink();
        twisted.setSize("Large");
        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(twisted);



//
//
//        System.out.println(blah);


    }
}
