

public class Main {
    public static void main(String[] args){

        Drink drink1 = new Drink();
        drink1.setDrinkSize(DrinkSize.MEDIUM);
        drink1.getPrice();
        System.out.println(drink1.getPrice());
        System.out.println(drink1.getDrinkSize());



//       Drink twisted = new Drink();
//       twisted.setDrinkSize(DrinkSize.LARGE);
//
//       Order mama = new Order();
//       mama.addDrink(twisted);
//       mama.addDrink(drink1);
//
//       drink1.getPrice();
//
//
//      /* System.out.println(drink1.getPrice());
//         System.out.println(twisted.getDrinkSize());
//        System.out.println(twisted.getPrice()); */
//
//        for (Drink drink : mama.getDrinks()){
//            System.out.println(drink.getDrinkSize() +
//                    " $" + drink.getPrice());
//        }
//        System.out.println( "Drinks Total: $ " + mama.getDrinkTotal());
//
//        Taco kat = new Taco();
//        kat.setTacoSize("medium");
//        kat.setTacoShell("corn ");
//        kat.setTacoMeat("steak");
//       kat.setTacoQuantity(4);
//
//        System.out.println(" Is this your Taco:: \n "
//                + kat.tacoSummary());



    }
}
