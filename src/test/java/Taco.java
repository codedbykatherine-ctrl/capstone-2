public class Taco {
    private String size;
    private String shell;
    private String meat;

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

    public void setTacoMeat(String meat) {
        this.meat = meat;
    }
    public String getTacoMeat(){
        return this.meat;
    }

    public String tacoSummary() {
        return "Taco size: " + this.size +
                " \n Taco shell: " + this.shell +
                "\n Taco meat selection: " + this.meat;
    }

}
