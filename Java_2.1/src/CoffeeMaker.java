public class CoffeeMaker {

    private boolean on = false;
    private String coffeeType;
    private int amount;

    //constructor
    public CoffeeMaker(String coffeeType, int amount){
        if(coffeeType.equals("normal") || coffeeType.equals("espresso")){
            this.coffeeType = coffeeType;
        }else this.coffeeType = "normal";

        if(amount >= 10 && amount <= 80){
            this.amount = amount;
        }else this.amount = 10;
    }

    //setters
    public void setCoffeeType(String coffeeType){
        if (this.on && coffeeType.equals("normal")|| this.on && coffeeType.equals("espresso")){
            this.coffeeType = coffeeType;
        }
    }

    public void setAmount(int amount){
        if (this.on && amount >= 10 && amount <= 80){
            this.amount = amount;
        }
    }

    //getters
    public String getPowerStatus() {
        if (on){
            return "Coffee maker is on.";
        }else return "Coffee maker is off.";
    }

    public void pressOnOff(){
        on = !on;
    }

    public String getCoffeeType(){
        return "Coffee type is " + coffeeType + ".";
    }

    public String getAmount(){
        return "Coffee amount is " + amount + "ml.";
    }
}
