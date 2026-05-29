import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Taco express = new Taco();
        Order kat = new Order();

        System.out.println("What taco style would you like?");
        String tacoStyle = scanner.nextLine();
        // what user type gets stored in variable name tacoStyle

        express.setTacoStyle(tacoStyle);

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
