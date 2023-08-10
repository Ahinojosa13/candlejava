public class Candle {
    private String name;
    private int quantity;
    private int burnTime;
    private double dollarPerBurnTime;
    private double price;

//    Class Constructor
    public Candle(String name, int quantity, int burnTime, double dollarPerBurnTime, double price){
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.dollarPerBurnTime = dollarPerBurnTime;
        this.price = price;
    }
//    Gets and Sets new info into template
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void  setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBurnTime() {
        return burnTime;
    }

    public void setBurnTime(int burnTime) {
        this.burnTime = burnTime;
    }

    public double getDollarPerBurnTime() {
        return dollarPerBurnTime;
    }

    public void setDollarPerBurnTime(double dollarPerBurnTime) {
        this.dollarPerBurnTime = dollarPerBurnTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
