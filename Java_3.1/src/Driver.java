public class Driver {
    public static void main(String [] args){

        Car normalCar = new Car("Toyota", 50, 0,  160, 50);
        SportsCar sportsCar = new SportsCar("Bugatti", 100, 0, 310,100);


        System.out.println("Starting state...");
        System.out.println("Normal car speed: " + normalCar.getSpeed());
        System.out.println("Sports car speed: " + sportsCar.getSpeed());

        //first acceleration
        normalCar.accelerate();
        sportsCar.accelerate();


        System.out.println("Speeds after accelerating...");
        System.out.println("Regular car speed after accelerating: " + normalCar.getSpeed());
        System.out.println("Sports car speed after accelerating: " + sportsCar.getSpeed());

        //second acceleration
        normalCar.accelerate();
        sportsCar.accelerate();

        //third acceleration
        normalCar.accelerate();
        sportsCar.accelerate();

        System.out.println("Speeds after accelerating a third time...");
        System.out.println("Regular car speed after accelerating: " + normalCar.getSpeed());
        System.out.println("Sports car speed after accelerating: " + sportsCar.getSpeed());

        normalCar.decelerate(10);
        sportsCar.decelerate(15);

        System.out.println("Speeds after decelerating...");
        System.out.println("Normal car speed after decelerating: "+ normalCar.getSpeed());
        System.out.println("Sports car speed after decelerating: "+ sportsCar.getSpeed());

        System.out.println("Fuel levels after testing...");
        System.out.println("Regular car fuel: " + normalCar.getGasolineLevel());
        System.out.println("Sports car fuel: " + sportsCar.getGasolineLevel());



    }
}
