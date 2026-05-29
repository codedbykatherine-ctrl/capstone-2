import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Order order = new Order();
        Taco taco = buildTaco(scanner);

        order.addOrderTaco(taco);

        System.out.println(order.orderSummary());
        System.out.println("Order total: $" + order.orderTacoTotal());

        scanner.close();
    }

    public static Taco buildTaco(Scanner scanner){
        Taco taco = new Taco();
        System.out.println("What taco style would you like?");
        System.out.println("1) Single Taco - $3.50'");
        System.out.println("2) 3 Taco Meal - $9.00");
        System.out.println("3) Burrito - $8.50");
        String tacoStyleChoice = scanner.nextLine();
        // what user type gets stored in variable name tacoStyle

        if (tacoStyleChoice.equals("1")) {
            taco.setTacoStyle("Single");
        } else if (tacoStyleChoice.equals("2")){
            taco.setTacoStyle(("3 taco "));
        }else if (tacoStyleChoice.equals("3")){
            taco.setTacoStyle("Burrito");
        }
        System.out.println("Choose shell:");
        System.out.println("1) Corn");
        System.out.println("2) Flour");
        System.out.println("3) Hard shell");
        System.out.println("4) Bowl");

        String shellChoice = scanner.nextLine();

        switch(shellChoice){
            case"1":
                taco.setTacoShell("corn");
                break;
            case "2":
                taco.setTacoShell("flour");
                break;

            case "3":
                taco.setTacoShell("hard shell");
                break;

            case "4":
                taco.setTacoShell("bowl");
                break;

            default:
                System.out.println("Invalid shell choice.");
        }
        taco.setTacoSize("medium");
        taco.addTacoTopping("lettuce");
        taco.setTacoQuantity(1);

        return taco;

    }

}
//  Drink drink1 = new Drink();
//        drink1.setDrinkSize(DrinkSize.MEDIUM);
//        drink1.getPrice();
//        System.out.println(drink1.getPrice());
//        System.out.println(drink1.getDrinkSize());