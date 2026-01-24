public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla");
        myCar.fillTank();


        for (int i = 0; i < 10; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        myCar.setTargetSpeed(80);

        myCar.turnCruiseControlOn();

        System.out.println(myCar.getCruiseControlInfo());


        while(myCar.isCruiseControlOn()){
            myCar.updateCruiseControl();
        }


        //myCar.setTargetSpeed(200);
        //myCar.turnCruiseControlOn();
        //System.out.println(myCar.getCruiseControlInfo());

    }
}