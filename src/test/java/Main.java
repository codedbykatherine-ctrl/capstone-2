import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.showHomeScreen();
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
            taco.setTacoStyle(("3 taco"));
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


        System.out.println("Choose meat:");
        System.out.println("1) Carne Asada");
        System.out.println("2) Al Pastor");
        System.out.println("3) Carnitas");
        System.out.println("4) Pollo");
        System.out.println("5) Chorizo");
        System.out.println("6) Pescado");

        String meatChoice = scanner.nextLine();

        switch(meatChoice) {
            case "1":
                taco.setTacoMeat(Meat.CARNE_ASADA);
                break;
            case "2":
                taco.setTacoMeat(Meat.AL_PASTOR);
                break;
            case "3":
                taco.setTacoMeat(Meat.CARNITAS);
                break;
            case "4":
                taco.setTacoMeat(Meat.POLLO);
                break;
            case "5":
                taco.setTacoMeat(Meat.CHORIZO);
                break;
            case "6":
                taco.setTacoMeat(Meat.PESCADO);
                break;
            default:
                System.out.println("Invalid meat choice");
        }


                System.out.println("Choose cheese:");
                System.out.println("1) Queso Fresco");
                System.out.println("2) Oaxaca");
                System.out.println("3) Cotija");
                System.out.println("4) Cheddar");

                String cheeseChoice = scanner.nextLine();
        switch (cheeseChoice){
            case "1":
                taco.setTacoCheese(Cheese.QUESO_FRESCO);
                break;

            case "2":
                taco.setTacoCheese(Cheese.OAXACA);
                break;

            case "3":
                taco.setTacoCheese(Cheese.COTIJA);
                break;

            case "4":
                taco.setTacoCheese(Cheese.CHEDDAR);
                break;

            default:
                System.out.println("Invalid cheese choice.");
        }
        System.out.println("Choose topping:");
        System.out.println("1) Extra Meat");
        System.out.println("2) Extra Cheese");
        System.out.println("3) Lettuce");
        System.out.println("4) Cilantro");
        System.out.println("5) Onions");
        System.out.println("6) Tomatoes");
        System.out.println("7) Jalapenos");
        System.out.println("8) Radishes");
        System.out.println("9) Pico");
        System.out.println("10) Guacamole");
        System.out.println("11) Corn");


        ArrayList<TacoToppings> availableToppings = new ArrayList<>();

        availableToppings.add(TacoToppings.EXTRA_MEAT);
        availableToppings.add(TacoToppings.EXTRA_CHEESE);
        availableToppings.add(TacoToppings.LETTUCE);
        availableToppings.add(TacoToppings.CILANTRO);
        availableToppings.add(TacoToppings.ONIONS);
        availableToppings.add(TacoToppings.TOMATOES);
        availableToppings.add(TacoToppings.JALAPENOS);
        availableToppings.add(TacoToppings.RADISHES);
        availableToppings.add(TacoToppings.PICO);
        availableToppings.add(TacoToppings.GUACAMOLE);
        availableToppings.add(TacoToppings.CORN);

        while(!availableToppings.isEmpty()){
            System.out.println("Choose a topping:");
            System.out.println("Enter 0 when finished.");

            for ( int i = 0; i < availableToppings.size(); i++){
                System.out.println((i + 1) + ")" + availableToppings.get(i));
            }
            String toppingChoice = scanner.nextLine();
            if(toppingChoice.equals("0")){
                break;
            }
            int choice = Integer.parseInt((toppingChoice));
             if (choice >= 1 && choice <= availableToppings.size()){
                 TacoToppings selectedTopping =
                         availableToppings.get(choice - 1);
                 //get topping from list (-1) start of list java needs[0]
                 taco.addTacoTopping(selectedTopping);
                 //saves topping into taco
                 availableToppings.remove(choice -1);
                 // remove toppings from menu so duplicates
             } else {
                 System.out.println(" Invalid topping choice.");
             }
        }
        return taco;

    }

}
