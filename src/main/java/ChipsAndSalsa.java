public class ChipsAndSalsa {
    private String salsaType;
    private final double price = 1.50;

    public void setSalsaType(Sauce salsaType){
        this.salsaType = this.salsaType;
    }
    public double getPrice(){
        return price;
    }
    public String ChipsSummary(){
        return "Chips & Salsa: " + salsaType + "----$"+ price;
    }
}
