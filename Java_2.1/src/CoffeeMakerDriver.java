public class CoffeeMakerDriver {
    public static void main(String [] args){
        CoffeeMaker coffeeMaker = new CoffeeMaker("normal", 50);

        coffeeMaker.pressOnOff();
        coffeeMaker.setCoffeeType("espresso");
        coffeeMaker.setAmount(50);

        System.out.println(coffeeMaker.getPowerStatus());
        System.out.println(coffeeMaker.getCoffeeType());
        System.out.println(coffeeMaker.getAmount());

        coffeeMaker.pressOnOff();
        System.out.println(coffeeMaker.getPowerStatus());
    }
}
