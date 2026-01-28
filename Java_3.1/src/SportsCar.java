public class SportsCar extends Car {

    public SportsCar(String typeName, double gasolineLevel, double speed, double maxSpeed, double tankCapacity) {
        super(typeName, gasolineLevel, speed, maxSpeed, tankCapacity);
    }

    @Override
    void accelerate() {
        super.accelerate();
        if (getGasolineLevel() > 0){
            setSpeed(getSpeed() + 20);
            setGasolineLevel(getGasolineLevel()-2);
        }
    }

    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > 0 && amount > 0){
            setSpeed(getSpeed() - amount * 2);
        }
    }
}