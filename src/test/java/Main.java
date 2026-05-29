import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Taco express = new Taco();
        Order kat = new Order();

        System.out.println("What taco style would you like?");
        System.out.println("1) Single Taco - $3.50'");
        System.out.println("2) 3 Taco Meal - $9.00");
        System.out.println("3) Burrito - $8.50");
        String tacoStyleChoice = scanner.nextLine();
        // what user type gets stored in variable name tacoStyle

        if (tacoStyleChoice.equals("1")) {
            express.setTacoStyle("Single");
        } else if (tacoStyleChoice.equals("2")){
            express.setTacoStyle(("3 taco "));
        }else if (tacoStyleChoice.equals("3")){
            express.setTacoStyle("Burrito");
        }

        express.setTacoStyle(tacoStyleChoice);

        express.setTacoSize("medium");
        express.setTacoShell("corn");
        express.addTacoTopping("lettuce");
        express.setTacoQuantity(4);

        kat.addOrderTaco(express);

        System.out.println(kat.orderSummary());
        System.out.println("Order total: $" + kat.orderTacoTotal());

        System.out.println("Is this your Taco:: \n"
                + express.tacoSummary());
















        Drink drink1 = new Drink();
        drink1.setDrinkSize(DrinkSize.MEDIUM);
        drink1.getPrice();
        System.out.println(drink1.getPrice());
        System.out.println(drink1.getDrinkSize());






    }
}
