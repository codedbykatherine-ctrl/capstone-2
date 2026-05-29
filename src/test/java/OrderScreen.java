import java.io.IOException;
import java.util.Scanner;

public class OrderScreen {
    private Scanner scanner = new Scanner(System.in);

    public void showOrderScreen() {
        Order order = new Order();
        boolean running = true;

        while (running) {
            System.out.println("\n===== ORDER SCREEN =====");
            System.out.println("1) Add Taco");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips & Salsa");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                Taco taco = Main.buildTaco(scanner);
                order.addOrderTaco(taco);

                System.out.println("Taco added!");

            } else if (choice.equals("2")) {
                addDrink(order);

            } else if (choice.equals("3")) {
                addChipsAndSalsa(order);

            } else if (choice.equals("4")) {
                System.out.println(order.receiptSummary());

                System.out.println("1) Confirm Order");
                System.out.println("0) Cancel Order");

                String checkoutChoice = scanner.nextLine();

                if (checkoutChoice.equals("1")) {
                    ReceiptFileManager receiptFileManager =
                            new ReceiptFileManager();

                    try {
                        receiptFileManager.saveReceipt(order);
                        System.out.println("Order complete!");

                    } catch (IOException e) {
                        System.out.println("Receipt could not be saved.");
                    }

                    running = false;

                } else if (checkoutChoice.equals("0")) {
                    System.out.println("Order canceled.");
                    running = false;

                } else {
                    System.out.println("Invalid checkout choice.");
                }

            } else if (choice.equals("0")) {
                System.out.println("Order canceled.");
                running = false;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    public void addDrink(Order order) {
        Drink drink = new Drink();

        System.out.println("Choose drink size:");
        System.out.println("1) Small - $" + DrinkSize.SMALL.getPrice());
        System.out.println("2) Medium - $" + DrinkSize.MEDIUM.getPrice());
        System.out.println("3) Large - $" + DrinkSize.LARGE.getPrice());

        String sizeChoice = scanner.nextLine();

        if (sizeChoice.equals("1")) {
            drink.setDrinkSize(DrinkSize.SMALL);
        } else if (sizeChoice.equals("2")) {
            drink.setDrinkSize(DrinkSize.MEDIUM);
        } else if (sizeChoice.equals("3")) {
            drink.setDrinkSize(DrinkSize.LARGE);
        } else {
            System.out.println("Invalid drink size.");
            return;
        }

        System.out.println("Choose flavor:");
        System.out.println("1) Cinco de Dranko");
        System.out.println("2) Baja Blasted");
        System.out.println("3) Horchata Heaux");
        System.out.println("4) Señor Sip");

        String flavorChoice = scanner.nextLine();

        if (flavorChoice.equals("1")) {
            drink.setDrinkFlavor("Cinco de Dranko");
        } else if (flavorChoice.equals("2")) {
            drink.setDrinkFlavor("Baja Blasted");
        } else if (flavorChoice.equals("3")) {
            drink.setDrinkFlavor("Horchata Heaux");
        } else if (flavorChoice.equals("4")) {
            drink.setDrinkFlavor("Señor Sip");
        } else {
            System.out.println("Invalid drink flavor.");
            return;
        }

        order.addDrink(drink);
        System.out.println("Your drink has been added!");
    }

    public void addChipsAndSalsa(Order order) {
        ChipsAndSalsa chips = new ChipsAndSalsa();

        System.out.println("Choose salsa:");
        System.out.println("1) Salsa Verde");
        System.out.println("2) Salsa Roja");
        System.out.println("3) Chipotle");
        System.out.println("4) Habanero");
        System.out.println("5) Mild");
        System.out.println("6) Extra Hot");

        String salsaChoice = scanner.nextLine();

        if (salsaChoice.equals("1")) {
            chips.setSalsaType(Sauce.SALSA_VERDE);
        } else if (salsaChoice.equals("2")) {
            chips.setSalsaType(Sauce.SALSA_ROJA);
        } else if (salsaChoice.equals("3")) {
            chips.setSalsaType(Sauce.CHIPOTLE);
        } else if (salsaChoice.equals("4")) {
            chips.setSalsaType(Sauce.HABANERO);
        } else if (salsaChoice.equals("5")) {
            chips.setSalsaType(Sauce.MILD);
        } else if (salsaChoice.equals("6")) {
            chips.setSalsaType(Sauce.EXTRA_HOT);
        } else {
            System.out.println("Invalid salsa choice.");
            return;
        }

        order.addChipsAndSalsa(chips);
        System.out.println("Chips & salsa added!");
    }
}