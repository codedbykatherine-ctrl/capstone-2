

public class Main {
    public static void main(String[] args){

        Drink drink1 = new Drink();
        drink1.setDrinkSize(DrinkSize.MEDIUM);


       Drink twisted = new Drink();
       twisted.setDrinkSize(DrinkSize.LARGE);

       Order mama = new Order();
       mama.addDrink(twisted);
       mama.addDrink(drink1);


       System.out.println(drink1.getDrinkSize());
        System.out.println(drink1.getPrice());

        System.out.println(twisted.getDrinkSize());
        System.out.println(twisted.getPrice());






//
//
//        System.out.println(blah);


    }
}
