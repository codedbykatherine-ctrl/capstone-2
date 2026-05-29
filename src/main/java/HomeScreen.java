import java.util.Scanner;

public class HomeScreen {
    private Scanner scanner = new Scanner(System.in);
    public void showHomeScreen(){
        boolean running = true;

        while(running) {
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("        🌮 VIVA LA VIDA TACOS 🌮      ");
            System.out.println("   tacos so good u might text ur ex   ");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            String choice = scanner.nextLine();
            if (choice.equals("1")){
                OrderScreen orderScreen = new OrderScreen();
                orderScreen.showOrderScreen();
            }else if (choice.equals("0")){
                System.out.println("GoodBye!");
                running = false;
            } else {
                System.out.println("Invalid choice");
            }

        }
    }




}
