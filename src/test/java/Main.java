

public class Main {
    public static void main(String[] args){

        Drink drink1 = new Drink();
        drink1.setDrinkSize(DrinkSize.MEDIUM);


       Drink twisted = new Drink();
       twisted.setDrinkSize(DrinkSize.LARGE);

       Order mama = new Order();
       mama.addDrink(twisted);
       mama.addDrink(drink1);


      /* System.out.println(drink1.getPrice());
         System.out.println(twisted.getDrinkSize());
        System.out.println(twisted.getPrice()); */

        for (Drink drink : mama.getDrinks()){
            System.out.println(drink.getDrinkSize() +
                    " $" + drink.getPrice());
        }
        System.out.println( "Drinks Total: $ " + mama.getDrinkTotal());

        Taco kat = new Taco();
        kat.setTacoSize("medium");
        kat.setTacoShell("corn ");


        System.out.println(" Is this your Taco:: \n "
                + kat.TacoSummary());



    }
}
