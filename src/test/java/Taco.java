import java.util.ArrayList;

public class Taco {
    private String size;
    private String shell;
    private Meat meat;
    private int quantity;
    private ArrayList<String> toppings = new ArrayList<>() ;
    private String tacoStyle;

    public void addTacoTopping(String topping){
        toppings.add(topping);
    }
    public void setTacoStyle(String tacoStyle){
        this.tacoStyle = tacoStyle;
    }
    public String getTacoStyle(){
        return this.tacoStyle;
    }


    public double tacoStylePrice(){
        double totalPrice = 0;

        if (this.tacoStyle.equalsIgnoreCase("Single")){
            totalPrice = 3.50;
        }
          else if  (this.tacoStyle.equalsIgnoreCase("3 taco")){
              totalPrice = 9.00;
        } else if (this.tacoStyle.equalsIgnoreCase("Burrito")) {
              totalPrice = 8.50;
        }
          // meat pricing gets added here
          if (this.meat != null){
              totalPrice = totalPrice + this.meat.getPrice(this.tacoStyle);
              totalPrice = totalPrice * this.quantity;
          }
        return totalPrice;

    }



    public void setTacoSize(String size) {
        this.size = size;
    }

    public String getTacoSize() {
        return this.size;
    }

    public void setTacoShell(String shell) {
        this.shell = shell;
    }

    public String getTacoShell() {
        return this.shell;
    }

    public void setTacoMeat(Meat meat) {
        this.meat = meat;
    }
    public Meat getTacoMeat(){
        return this.meat;
    }

    public String tacoSummary() {
        return "Taco size: " + this.size +
                " \n Taco shell: " + this.shell +
                "\n Taco meat selection: " + this.meat +
                "\n Taco Quantity:" + this.quantity +
                "\n Taco Toppings:" + this.toppings +
                "\n Taco Shell Style:" + this.tacoStyle;
    }
    public void setTacoQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getTacoQuantity(){
        return this.quantity;
    }




}
